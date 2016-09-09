package de.hybris.platform.bonstore.service;

import de.hybris.platform.core.model.user.CustomerModel;

import java.util.Collection;

public interface MailService {
    void sendUserList(CustomerModel manager, Collection<CustomerModel> customers);
}
