/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package de.iisys.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CamundaService}.
 *
 * @author Brian Wing Shun Chan
 * @see CamundaService
 * @generated
 */
@ProviderType
public class CamundaServiceWrapper implements CamundaService,
	ServiceWrapper<CamundaService> {
	public CamundaServiceWrapper(CamundaService camundaService) {
		_camundaService = camundaService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _camundaService.getOSGiServiceIdentifier();
	}

	@Override
	public void updateStatus(java.lang.String status,
		java.util.Map<java.lang.String, java.io.Serializable> context)
		throws java.lang.Exception {
		_camundaService.updateStatus(status, context);
	}

	@Override
	public CamundaService getWrappedService() {
		return _camundaService;
	}

	@Override
	public void setWrappedService(CamundaService camundaService) {
		_camundaService = camundaService;
	}

	private CamundaService _camundaService;
}