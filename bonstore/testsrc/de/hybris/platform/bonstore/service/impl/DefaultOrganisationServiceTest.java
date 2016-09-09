package de.hybris.platform.bonstore.service.impl;


import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.bonstore.service.OrganisationService;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.fest.assertions.Assertions.assertThat;

@IntegrationTest
public class DefaultOrganisationServiceTest extends ServicelayerTransactionalTest{

    @Resource
    private OrganisationService organisationService;

    @Test
    public void testFindAllOrganisations() throws Exception {
        assertThat(organisationService.findAll()).isNotNull();
    }
}
