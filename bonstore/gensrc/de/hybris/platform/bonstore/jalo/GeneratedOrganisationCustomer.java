/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 08.09.2016 13:48:31                         ---
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
import de.hybris.platform.bonstore.jalo.Organisation;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.bonstore.jalo.OrganisationCustomer OrganisationCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOrganisationCustomer extends Customer
{
	/** Qualifier of the <code>OrganisationCustomer.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>OrganisationCustomer.attemptCount</code> attribute **/
	public static final String ATTEMPTCOUNT = "attemptCount";
	/** Qualifier of the <code>OrganisationCustomer.organisation</code> attribute **/
	public static final String ORGANISATION = "organisation";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ORGANISATION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedOrganisationCustomer> ORGANISATIONHANDLER = new BidirectionalOneToManyHandler<GeneratedOrganisationCustomer>(
	BonstoreConstants.TC.ORGANISATIONCUSTOMER,
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Customer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(ATTEMPTCOUNT, AttributeMode.INITIAL);
		tmp.put(ORGANISATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganisationCustomer.attemptCount</code> attribute.
	 * @return the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public Integer getAttemptCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ATTEMPTCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganisationCustomer.attemptCount</code> attribute.
	 * @return the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public Integer getAttemptCount()
	{
		return getAttemptCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganisationCustomer.attemptCount</code> attribute. 
	 * @return the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public int getAttemptCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAttemptCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganisationCustomer.attemptCount</code> attribute. 
	 * @return the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public int getAttemptCountAsPrimitive()
	{
		return getAttemptCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganisationCustomer.attemptCount</code> attribute. 
	 * @param value the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public void setAttemptCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ATTEMPTCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganisationCustomer.attemptCount</code> attribute. 
	 * @param value the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public void setAttemptCount(final Integer value)
	{
		setAttemptCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganisationCustomer.attemptCount</code> attribute. 
	 * @param value the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public void setAttemptCount(final SessionContext ctx, final int value)
	{
		setAttemptCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganisationCustomer.attemptCount</code> attribute. 
	 * @param value the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public void setAttemptCount(final int value)
	{
		setAttemptCount( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ORGANISATIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganisationCustomer.organisation</code> attribute.
	 * @return the organisation
	 */
	public Organisation getOrganisation(final SessionContext ctx)
	{
		return (Organisation)getProperty( ctx, ORGANISATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganisationCustomer.organisation</code> attribute.
	 * @return the organisation
	 */
	public Organisation getOrganisation()
	{
		return getOrganisation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganisationCustomer.organisation</code> attribute. 
	 * @param value the organisation
	 */
	public void setOrganisation(final SessionContext ctx, final Organisation value)
	{
		ORGANISATIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganisationCustomer.organisation</code> attribute. 
	 * @param value the organisation
	 */
	public void setOrganisation(final Organisation value)
	{
		setOrganisation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganisationCustomer.status</code> attribute.
	 * @return the status - It indicates if account is locked or not.
	 */
	public Boolean isStatus(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganisationCustomer.status</code> attribute.
	 * @return the status - It indicates if account is locked or not.
	 */
	public Boolean isStatus()
	{
		return isStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganisationCustomer.status</code> attribute. 
	 * @return the status - It indicates if account is locked or not.
	 */
	public boolean isStatusAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isStatus( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OrganisationCustomer.status</code> attribute. 
	 * @return the status - It indicates if account is locked or not.
	 */
	public boolean isStatusAsPrimitive()
	{
		return isStatusAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganisationCustomer.status</code> attribute. 
	 * @param value the status - It indicates if account is locked or not.
	 */
	public void setStatus(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganisationCustomer.status</code> attribute. 
	 * @param value the status - It indicates if account is locked or not.
	 */
	public void setStatus(final Boolean value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganisationCustomer.status</code> attribute. 
	 * @param value the status - It indicates if account is locked or not.
	 */
	public void setStatus(final SessionContext ctx, final boolean value)
	{
		setStatus( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OrganisationCustomer.status</code> attribute. 
	 * @param value the status - It indicates if account is locked or not.
	 */
	public void setStatus(final boolean value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
}
