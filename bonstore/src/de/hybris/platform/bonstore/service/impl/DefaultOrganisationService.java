package de.hybris.platform.bonstore.service.impl;

import de.hybris.platform.bonstore.daos.OrganisationDao;
import de.hybris.platform.bonstore.model.OrganisationModel;
import de.hybris.platform.bonstore.service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("organisationService")
public class DefaultOrganisationService implements OrganisationService{

    @Autowired
    private OrganisationDao organisationDao;

    @Override
    public List<OrganisationModel> findAll() {
        return organisationDao.findAll();
    }
}
