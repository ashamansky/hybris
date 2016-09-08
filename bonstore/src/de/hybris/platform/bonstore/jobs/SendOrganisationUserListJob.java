package de.hybris.platform.bonstore.jobs;


import de.hybris.platform.bonstore.model.OrganisationModel;
import de.hybris.platform.bonstore.service.MailService;
import de.hybris.platform.bonstore.service.OrganisationService;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class SendOrganisationUserListJob extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = Logger.getLogger(SendOrganisationUserListJob.class);

    private MailService mailService;
    private OrganisationService organisationService;

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

        return null;
    }

    private List<CustomerModel> findOrganizationManager(OrganisationModel organisationModel) {
        return organisationModel.getCustomers()
                .stream()
                //TODO: Need to figure CustomerModel email field name
                .filter(customer -> customer.getCustomerID().equals(organisationModel.getEmail()))
                .collect(Collectors.toList());


    }
}
