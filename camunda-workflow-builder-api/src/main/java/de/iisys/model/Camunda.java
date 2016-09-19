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

package de.iisys.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Camunda service. Represents a row in the &quot;camunda_Camunda&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CamundaModel
 * @see de.iisys.model.impl.CamundaImpl
 * @see de.iisys.model.impl.CamundaModelImpl
 * @generated
 */
@ImplementationClassName("de.iisys.model.impl.CamundaImpl")
@ProviderType
public interface Camunda extends CamundaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link de.iisys.model.impl.CamundaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Camunda, Long> FOO_ID_ACCESSOR = new Accessor<Camunda, Long>() {
			@Override
			public Long get(Camunda camunda) {
				return camunda.getFooId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Camunda> getTypeClass() {
				return Camunda.class;
			}
		};
}