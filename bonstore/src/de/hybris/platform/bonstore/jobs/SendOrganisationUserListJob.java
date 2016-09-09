package de.hybris.platform.bonstore.jobs;


import de.hybris.platform.bonstore.model.OrganisationModel;
import de.hybris.platform.bonstore.service.MailService;
import de.hybris.platform.bonstore.service.OrganisationService;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class SendOrganisationUserListJob extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = Logger.getLogger(SendOrganisationUserListJob.class);

    private String fromAddress;


    private MailService mailService;
    private OrganisationService organisationService;

    public void setOrganisationService(final OrganisationService organisationService) {
        this.organisationService = organisationService;
    }

    public void setMailService(final MailService mailService) {
        this.mailService = mailService;
    }

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        LOG.info("Sending Organisation User List");

        organisationService.findAll()
                .stream()
                .forEach(organisation ->
                    findOrganizationManager(organisation)
                            .stream()
                            .forEach(manager -> mailService.sendUserList(manager, organisation.getCustomers()))
                );

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    private List<CustomerModel> findOrganizationManager(OrganisationModel organisationModel) {
        return organisationModel.getCustomers()
                .stream()
                .filter(customer -> customer.getAddresses()
                        .stream()
                        .anyMatch(addressModel -> addressModel.getEmail().equals(organisationModel.getEmail())))
                .collect(Collectors.toList());


    }
}
