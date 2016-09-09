/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 09.09.2016 14:47:59                         ---
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
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>BonstoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBonstoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("status", AttributeMode.INITIAL);
		tmp.put("attemptCount", AttributeMode.INITIAL);
		tmp.put("organisation", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.attemptCount</code> attribute.
	 * @return the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public Integer getAttemptCount(final SessionContext ctx, final Customer item)
	{
		return (Integer)item.getProperty( ctx, BonstoreConstants.Attributes.Customer.ATTEMPTCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.attemptCount</code> attribute.
	 * @return the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public Integer getAttemptCount(final Customer item)
	{
		return getAttemptCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.attemptCount</code> attribute. 
	 * @return the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public int getAttemptCountAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Integer value = getAttemptCount( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.attemptCount</code> attribute. 
	 * @return the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public int getAttemptCountAsPrimitive(final Customer item)
	{
		return getAttemptCountAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.attemptCount</code> attribute. 
	 * @param value the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public void setAttemptCount(final SessionContext ctx, final Customer item, final Integer value)
	{
		item.setProperty(ctx, BonstoreConstants.Attributes.Customer.ATTEMPTCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.attemptCount</code> attribute. 
	 * @param value the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public void setAttemptCount(final Customer item, final Integer value)
	{
		setAttemptCount( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.attemptCount</code> attribute. 
	 * @param value the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public void setAttemptCount(final SessionContext ctx, final Customer item, final int value)
	{
		setAttemptCount( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.attemptCount</code> attribute. 
	 * @param value the attemptCount - It indicates how many times user entered incorrect password successively.
	 */
	public void setAttemptCount(final Customer item, final int value)
	{
		setAttemptCount( getSession().getSessionContext(), item, value );
	}
	
	public Organisation createOrganisation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BonstoreConstants.TC.ORGANISATION );
			return (Organisation)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Organisation : "+e.getMessage(), 0 );
		}
	}
	
	public Organisation createOrganisation(final Map attributeValues)
	{
		return createOrganisation( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return BonstoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.organisation</code> attribute.
	 * @return the organisation
	 */
	public Organisation getOrganisation(final SessionContext ctx, final Customer item)
	{
		return (Organisation)item.getProperty( ctx, BonstoreConstants.Attributes.Customer.ORGANISATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.organisation</code> attribute.
	 * @return the organisation
	 */
	public Organisation getOrganisation(final Customer item)
	{
		return getOrganisation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.organisation</code> attribute. 
	 * @param value the organisation
	 */
	public void setOrganisation(final SessionContext ctx, final Customer item, final Organisation value)
	{
		item.setProperty(ctx, BonstoreConstants.Attributes.Customer.ORGANISATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.organisation</code> attribute. 
	 * @param value the organisation
	 */
	public void setOrganisation(final Customer item, final Organisation value)
	{
		setOrganisation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.status</code> attribute.
	 * @return the status - It indicates if account is locked or not.
	 */
	public Boolean isStatus(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, BonstoreConstants.Attributes.Customer.STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.status</code> attribute.
	 * @return the status - It indicates if account is locked or not.
	 */
	public Boolean isStatus(final Customer item)
	{
		return isStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.status</code> attribute. 
	 * @return the status - It indicates if account is locked or not.
	 */
	public boolean isStatusAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isStatus( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.status</code> attribute. 
	 * @return the status - It indicates if account is locked or not.
	 */
	public boolean isStatusAsPrimitive(final Customer item)
	{
		return isStatusAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.status</code> attribute. 
	 * @param value the status - It indicates if account is locked or not.
	 */
	public void setStatus(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, BonstoreConstants.Attributes.Customer.STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.status</code> attribute. 
	 * @param value the status - It indicates if account is locked or not.
	 */
	public void setStatus(final Customer item, final Boolean value)
	{
		setStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.status</code> attribute. 
	 * @param value the status - It indicates if account is locked or not.
	 */
	public void setStatus(final SessionContext ctx, final Customer item, final boolean value)
	{
		setStatus( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.status</code> attribute. 
	 * @param value the status - It indicates if account is locked or not.
	 */
	public void setStatus(final Customer item, final boolean value)
	{
		setStatus( getSession().getSessionContext(), item, value );
	}
	
}
