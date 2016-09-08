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
package de.hybris.platform.bonstorehmc.setup;

import de.hybris.platform.bonstorehmc.constants.BonstorehmcConstants;
import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.platform.bonstorehmc.service.BonstorehmcService;


@SystemSetup(extension = BonstorehmcConstants.EXTENSIONNAME)
public class BonstorehmcSystemSetup
{
	private final BonstorehmcService bonstorehmcService;

	public BonstorehmcSystemSetup(final BonstorehmcService bonstorehmcService)
	{
		this.bonstorehmcService = bonstorehmcService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		bonstorehmcService.createLogo(BonstorehmcConstants.PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return BonstorehmcSystemSetup.class.getResourceAsStream("/bonstorehmc/sap-hybris-platform.png");
	}
}
