/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.bonstore.setup;

import static de.hybris.platform.bonstore.constants.BonstoreConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.platform.bonstore.constants.BonstoreConstants;
import de.hybris.platform.bonstore.service.BonstoreService;


@SystemSetup(extension = BonstoreConstants.EXTENSIONNAME)
public class BonstoreSystemSetup
{
	private final BonstoreService bonstoreService;

	public BonstoreSystemSetup(final BonstoreService bonstoreService)
	{
		this.bonstoreService = bonstoreService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		bonstoreService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return BonstoreSystemSetup.class.getResourceAsStream("/bonstore/sap-hybris-platform.png");
	}
}
