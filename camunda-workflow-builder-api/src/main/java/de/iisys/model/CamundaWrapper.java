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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Camunda}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Camunda
 * @generated
 */
@ProviderType
public class CamundaWrapper implements Camunda, ModelWrapper<Camunda> {
	public CamundaWrapper(Camunda camunda) {
		_camunda = camunda;
	}

	@Override
	public Class<?> getModelClass() {
		return Camunda.class;
	}

	@Override
	public String getModelClassName() {
		return Camunda.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("fooId", getFooId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("field1", getField1());
		attributes.put("field2", getField2());
		attributes.put("field3", getField3());
		attributes.put("field4", getField4());
		attributes.put("field5", getField5());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long fooId = (Long)attributes.get("fooId");

		if (fooId != null) {
			setFooId(fooId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String field1 = (String)attributes.get("field1");

		if (field1 != null) {
			setField1(field1);
		}

		Boolean field2 = (Boolean)attributes.get("field2");

		if (field2 != null) {
			setField2(field2);
		}

		Integer field3 = (Integer)attributes.get("field3");

		if (field3 != null) {
			setField3(field3);
		}

		Date field4 = (Date)attributes.get("field4");

		if (field4 != null) {
			setField4(field4);
		}

		String field5 = (String)attributes.get("field5");

		if (field5 != null) {
			setField5(field5);
		}
	}

	/**
	* Returns the field2 of this camunda.
	*
	* @return the field2 of this camunda
	*/
	@Override
	public boolean getField2() {
		return _camunda.getField2();
	}

	@Override
	public boolean isCachedModel() {
		return _camunda.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _camunda.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this camunda is field2.
	*
	* @return <code>true</code> if this camunda is field2; <code>false</code> otherwise
	*/
	@Override
	public boolean isField2() {
		return _camunda.isField2();
	}

	@Override
	public boolean isNew() {
		return _camunda.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _camunda.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<de.iisys.model.Camunda> toCacheModel() {
		return _camunda.toCacheModel();
	}

	@Override
	public de.iisys.model.Camunda toEscapedModel() {
		return new CamundaWrapper(_camunda.toEscapedModel());
	}

	@Override
	public de.iisys.model.Camunda toUnescapedModel() {
		return new CamundaWrapper(_camunda.toUnescapedModel());
	}

	@Override
	public int compareTo(de.iisys.model.Camunda camunda) {
		return _camunda.compareTo(camunda);
	}

	/**
	* Returns the field3 of this camunda.
	*
	* @return the field3 of this camunda
	*/
	@Override
	public int getField3() {
		return _camunda.getField3();
	}

	@Override
	public int hashCode() {
		return _camunda.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _camunda.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CamundaWrapper((Camunda)_camunda.clone());
	}

	/**
	* Returns the field1 of this camunda.
	*
	* @return the field1 of this camunda
	*/
	@Override
	public java.lang.String getField1() {
		return _camunda.getField1();
	}

	/**
	* Returns the field5 of this camunda.
	*
	* @return the field5 of this camunda
	*/
	@Override
	public java.lang.String getField5() {
		return _camunda.getField5();
	}

	/**
	* Returns the user name of this camunda.
	*
	* @return the user name of this camunda
	*/
	@Override
	public java.lang.String getUserName() {
		return _camunda.getUserName();
	}

	/**
	* Returns the user uuid of this camunda.
	*
	* @return the user uuid of this camunda
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _camunda.getUserUuid();
	}

	/**
	* Returns the uuid of this camunda.
	*
	* @return the uuid of this camunda
	*/
	@Override
	public java.lang.String getUuid() {
		return _camunda.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _camunda.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _camunda.toXmlString();
	}

	/**
	* Returns the create date of this camunda.
	*
	* @return the create date of this camunda
	*/
	@Override
	public Date getCreateDate() {
		return _camunda.getCreateDate();
	}

	/**
	* Returns the field4 of this camunda.
	*
	* @return the field4 of this camunda
	*/
	@Override
	public Date getField4() {
		return _camunda.getField4();
	}

	/**
	* Returns the modified date of this camunda.
	*
	* @return the modified date of this camunda
	*/
	@Override
	public Date getModifiedDate() {
		return _camunda.getModifiedDate();
	}

	/**
	* Returns the company ID of this camunda.
	*
	* @return the company ID of this camunda
	*/
	@Override
	public long getCompanyId() {
		return _camunda.getCompanyId();
	}

	/**
	* Returns the foo ID of this camunda.
	*
	* @return the foo ID of this camunda
	*/
	@Override
	public long getFooId() {
		return _camunda.getFooId();
	}

	/**
	* Returns the group ID of this camunda.
	*
	* @return the group ID of this camunda
	*/
	@Override
	public long getGroupId() {
		return _camunda.getGroupId();
	}

	/**
	* Returns the primary key of this camunda.
	*
	* @return the primary key of this camunda
	*/
	@Override
	public long getPrimaryKey() {
		return _camunda.getPrimaryKey();
	}

	/**
	* Returns the user ID of this camunda.
	*
	* @return the user ID of this camunda
	*/
	@Override
	public long getUserId() {
		return _camunda.getUserId();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_camunda.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this camunda.
	*
	* @param companyId the company ID of this camunda
	*/
	@Override
	public void setCompanyId(long companyId) {
		_camunda.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this camunda.
	*
	* @param createDate the create date of this camunda
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_camunda.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_camunda.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_camunda.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_camunda.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field1 of this camunda.
	*
	* @param field1 the field1 of this camunda
	*/
	@Override
	public void setField1(java.lang.String field1) {
		_camunda.setField1(field1);
	}

	/**
	* Sets whether this camunda is field2.
	*
	* @param field2 the field2 of this camunda
	*/
	@Override
	public void setField2(boolean field2) {
		_camunda.setField2(field2);
	}

	/**
	* Sets the field3 of this camunda.
	*
	* @param field3 the field3 of this camunda
	*/
	@Override
	public void setField3(int field3) {
		_camunda.setField3(field3);
	}

	/**
	* Sets the field4 of this camunda.
	*
	* @param field4 the field4 of this camunda
	*/
	@Override
	public void setField4(Date field4) {
		_camunda.setField4(field4);
	}

	/**
	* Sets the field5 of this camunda.
	*
	* @param field5 the field5 of this camunda
	*/
	@Override
	public void setField5(java.lang.String field5) {
		_camunda.setField5(field5);
	}

	/**
	* Sets the foo ID of this camunda.
	*
	* @param fooId the foo ID of this camunda
	*/
	@Override
	public void setFooId(long fooId) {
		_camunda.setFooId(fooId);
	}

	/**
	* Sets the group ID of this camunda.
	*
	* @param groupId the group ID of this camunda
	*/
	@Override
	public void setGroupId(long groupId) {
		_camunda.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this camunda.
	*
	* @param modifiedDate the modified date of this camunda
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_camunda.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_camunda.setNew(n);
	}

	/**
	* Sets the primary key of this camunda.
	*
	* @param primaryKey the primary key of this camunda
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_camunda.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_camunda.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this camunda.
	*
	* @param userId the user ID of this camunda
	*/
	@Override
	public void setUserId(long userId) {
		_camunda.setUserId(userId);
	}

	/**
	* Sets the user name of this camunda.
	*
	* @param userName the user name of this camunda
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_camunda.setUserName(userName);
	}

	/**
	* Sets the user uuid of this camunda.
	*
	* @param userUuid the user uuid of this camunda
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_camunda.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this camunda.
	*
	* @param uuid the uuid of this camunda
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_camunda.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CamundaWrapper)) {
			return false;
		}

		CamundaWrapper camundaWrapper = (CamundaWrapper)obj;

		if (Objects.equals(_camunda, camundaWrapper._camunda)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _camunda.getStagedModelType();
	}

	@Override
	public Camunda getWrappedModel() {
		return _camunda;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _camunda.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _camunda.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_camunda.resetOriginalValues();
	}

	private final Camunda _camunda;
}