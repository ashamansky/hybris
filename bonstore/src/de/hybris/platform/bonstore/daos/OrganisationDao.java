package de.hybris.platform.bonstore.daos;


import de.hybris.platform.bonstore.model.OrganisationModel;

import java.util.List;

public interface OrganisationDao {
    List<OrganisationModel> findAll();
}
