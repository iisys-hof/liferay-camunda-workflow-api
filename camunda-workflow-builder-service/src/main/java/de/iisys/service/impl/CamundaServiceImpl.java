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

package de.iisys.service.impl;

import java.io.Serializable;
import java.util.Map;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.WorkflowInstanceLinkLocalServiceUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowStatusManagerUtil;

import aQute.bnd.annotation.ProviderType;

import de.iisys.service.base.CamundaServiceBaseImpl;
import de.iisys.service.util.ContextUtil;

/**
 * The implementation of the camunda remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link de.iisys.service.CamundaService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CamundaServiceBaseImpl
 * @see de.iisys.service.CamundaServiceUtil
 */
@ProviderType
public class CamundaServiceImpl extends CamundaServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link de.iisys.service.CamundaServiceUtil} to access the camunda remote service.
	 */
	
	public void updateStatus(String status, Map<String, Serializable> context) throws Exception
	{
		ServiceContext svcCont = null;
		
//		HttpServletRequest request = AccessControlUtil
//				.getAccessControlContext().getRequest();
		
		// reconstruct service context from request
		// Caution: causes Exceptions in the backend since requests/servlets are not thread safe
//		svcCont = ServiceContextFactory.getInstance(request);
//		context.put("serviceContext", svcCont);
		
		// construct service context from parameters
		svcCont = ContextUtil.getServiceContext(context);
		context.put("serviceContext", svcCont);
		
		WorkflowStatusManagerUtil.updateStatus(
			WorkflowConstants.getLabelStatus(status), context);
		
		// TODO: delete link? appears to be necessary
		WorkflowInstanceLinkLocalServiceUtil.deleteWorkflowInstanceLinks(
			Long.valueOf(context.get("companyId").toString()),
			Long.valueOf(context.get("groupId").toString()),
			context.get("entryClassName").toString(),
			Long.valueOf(context.get("entryClassPK").toString()));
		
		// no worky - tries deleting the workflow
	}
}