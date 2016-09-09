package de.hybris.platform.bonstore.service.impl;


import de.hybris.platform.bonstore.service.MailService;
import de.hybris.platform.bonstore.service.SingletonScopedComponent;
import de.hybris.platform.commons.renderer.RendererService;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.i18n.FormatFactory;
import de.hybris.platform.servicelayer.i18n.I18NService;
import de.hybris.platform.servicelayer.i18n.L10NService;
import de.hybris.platform.servicelayer.session.SessionExecutionBody;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.util.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;

import java.util.Collection;
import java.util.Locale;
import java.util.stream.Collectors;

@SingletonScopedComponent(value = "mailService")
public class DefaultMailService implements MailService, InitializingBean {
    private final static Logger LOG = LoggerFactory.getLogger(DefaultMailService.class);

    private String fromAddress;

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private SessionService sessionService;
    @Autowired
    private I18NService i18nService;
    @Autowired
    private FormatFactory formatFactory;
    @Autowired
    private RendererService rendererService;
    @Autowired
    private L10NService l10NService;

    @Override
    public void afterPropertiesSet() throws Exception {
        fromAddress = Config.getParameter("mail.from");
    }

    @Override
    public void sendUserList(CustomerModel manager, Collection<CustomerModel> customers) {
        String emailAddress = manager.getAddresses().stream()
                .filter(addressModel -> addressModel.getEmail().isEmpty())
                .map(AddressModel::getEmail).collect(Collectors.toList()).get(0);

        final MailPreparator preparator = mimeMessage -> {
            mimeMessage.setSubject("Organization User List");
            mimeMessage.setText(customers.stream().map(CustomerModel::getDisplayName).collect(Collectors.joining("<br/>")));
        };
        send(preparator, manager, emailAddress);
    }

    protected void send(final MailPreparator preparer, final CustomerModel sender, String destination)
    {
        sessionService.executeInLocalView(new SessionExecutionBody()
        {
            @Override
            public void executeWithoutResult()
            {
                i18nService.setLocalizationFallbackEnabled(true);
                if (sender.getSessionLanguage() != null)
                {
                    i18nService.setCurrentLocale(new Locale(sender.getSessionLanguage().getIsocode()));
                }

                final MimeMessagePreparator preparator = mimeMessage -> {
                    final MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "UTF-8");
                    message.setTo(destination);
                    message.setFrom(fromAddress);
                    preparer.prepare(message);
                };
                try
                {
                    mailSender.send(preparator);
                }
                catch (final MailException e)
                {
                    LOG.error("Can not send mail to {} - {}: {}", sender.getUid(), destination, e.getMessage());
                }
            }
        });
    }


    protected interface MailPreparator
    {
        void prepare(MimeMessageHelper message) throws Exception; //NOPMD
    }

    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
}
