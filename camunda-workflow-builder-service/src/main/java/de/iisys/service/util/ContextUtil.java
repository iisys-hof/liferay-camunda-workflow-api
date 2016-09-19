package de.iisys.service.util;

import java.io.Serializable;
import java.util.Map;

import com.liferay.portal.kernel.service.ServiceContext;

public class ContextUtil
{
	public static ServiceContext getServiceContext(Map<String, Serializable> context)
	{
		ServiceContext svcCont = new ServiceContext();

		String companyId = (String) context.get("companyId");
		svcCont.setCompanyId(Long.parseLong(companyId));
		
		svcCont.setCommand((String)context.get("command"));

		String userId = (String) context.get("userId");
		svcCont.setUserId(Long.parseLong(userId));
		
		return svcCont;
	}
}
