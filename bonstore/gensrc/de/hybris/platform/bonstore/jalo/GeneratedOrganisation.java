/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 08.09.2016 14:45:43                         ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *  
 */
package de.hybris.platform.bonstore.jalo;

import de.hybris.platform.bonstore.constants.BonstoreConstants;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.bonstore.jalo.Organisation Organisation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOrganisation extends GenericItem
{
	/** Qualifier of the <code>Organisation.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Organisation.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Organisation.phone</code> attribute **/
	public static final String PHONE = "phone";
	/** Qualifier of the <code>Organisation.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>Organisation.customers</code> attribute **/
	public static final String CUSTOMERS = "customers";
	/**
	* {@link OneToManyHandler} for handling 1:n CUSTOMERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Customer> CUSTOMERSHANDLER = new OneToManyHandler<Customer>(
	CoreConstants.TC.CUSTOMER,
	false,
	"organisation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(PHONE, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.customers</code> attribute.
	 * @return the customers
	 */
	public Collection<Customer> getCustomers(final SessionContext ctx)
	{
		return CUSTOMERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.customers</code> attribute.
	 * @return the customers
	 */
	public Collection<Customer> getCustomers()
	{
		return getCustomers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.customers</code> attribute. 
	 * @param value the customers
	 */
	public void setCustomers(final SessionContext ctx, final Collection<Customer> value)
	{
		CUSTOMERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.customers</code> attribute. 
	 * @param value the customers
	 */
	public void setCustomers(final Collection<Customer> value)
	{
		setCustomers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customers. 
	 * @param value the item to add to customers
	 */
	public void addToCustomers(final SessionContext ctx, final Customer value)
	{
		CUSTOMERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customers. 
	 * @param value the item to add to customers
	 */
	public void addToCustomers(final Customer value)
	{
		addToCustomers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customers. 
	 * @param value the item to remove from customers
	 */
	public void removeFromCustomers(final SessionContext ctx, final Customer value)
	{
		CUSTOMERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customers. 
	 * @param value the item to remove from customers
	 */
	public void removeFromCustomers(final Customer value)
	{
		removeFromCustomers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.email</code> attribute.
	 * @return the email - Email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.email</code> attribute.
	 * @return the email - Email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.email</code> attribute. 
	 * @param value the email - Email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.email</code> attribute. 
	 * @param value the email - Email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.id</code> attribute.
	 * @return the id
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.id</code> attribute.
	 * @return the id
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.phone</code> attribute.
	 * @return the phone - Phone
	 */
	public String getPhone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.phone</code> attribute.
	 * @return the phone - Phone
	 */
	public String getPhone()
	{
		return getPhone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.phone</code> attribute. 
	 * @param value the phone - Phone
	 */
	public void setPhone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.phone</code> attribute. 
	 * @param value the phone - Phone
	 */
	public void setPhone(final String value)
	{
		setPhone( getSession().getSessionContext(), value );
	}
	
}
