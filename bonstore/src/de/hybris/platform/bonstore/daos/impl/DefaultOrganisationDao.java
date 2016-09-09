package de.hybris.platform.bonstore.daos.impl;


import de.hybris.platform.bonstore.daos.OrganisationDao;
import de.hybris.platform.bonstore.model.OrganisationModel;
import de.hybris.platform.cuppy.model.PlayerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("organisationDao")
public class DefaultOrganisationDao implements OrganisationDao {

    @Autowired
    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<OrganisationModel> findAll() {
        final StringBuilder builder = new StringBuilder();
        builder.append("SELECT {p:").append(OrganisationModel.PK).append("} ");
        builder.append("FROM {").append(OrganisationModel._TYPECODE).append(" AS p} ");
        builder.append("ORDER BY ").append("{p:").append(OrganisationModel.ID).append("}");

        final FlexibleSearchQuery query = new FlexibleSearchQuery(builder.toString());
        query.setNeedTotal(true);
        query.addQueryParameter("true", Boolean.TRUE);

        return flexibleSearchService.<OrganisationModel> search(query).getResult();
    }
}
