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
package de.hybris.platform.bonstorefrontend.setup;

import static de.hybris.platform.bonstorefrontend.constants.BonstorefrontendConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.platform.bonstorefrontend.constants.BonstorefrontendConstants;
import de.hybris.platform.bonstorefrontend.service.BonstorefrontendService;


@SystemSetup(extension = BonstorefrontendConstants.EXTENSIONNAME)
public class BonstorefrontendSystemSetup
{
	private final BonstorefrontendService bonstorefrontendService;

	public BonstorefrontendSystemSetup(final BonstorefrontendService bonstorefrontendService)
	{
		this.bonstorefrontendService = bonstorefrontendService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		bonstorefrontendService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return BonstorefrontendSystemSetup.class.getResourceAsStream("/bonstorefrontend/sap-hybris-platform.png");
	}
}
