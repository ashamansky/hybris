package de.hybris.platform.bonstore.jobs;


import de.hybris.platform.bonstore.model.OrganisationModel;
import de.hybris.platform.bonstore.service.MailService;
import de.hybris.platform.bonstore.service.OrganisationService;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;

import java.util.List;

public class SendOrganisationUserListJob extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = Logger.getLogger(SendOrganisationUserListJob.class);

    private MailService mailService;
    private OrganisationService organisationService;

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        LOG.info("Sending Organisation User List");

        List<OrganisationModel> organisationList = organisationService.findAll();

        organisationList.stream().forEach(organisation -> {
//            organisation.getCustomers().stream().filter(c -> c.)
        });




        return null;
    }
}
