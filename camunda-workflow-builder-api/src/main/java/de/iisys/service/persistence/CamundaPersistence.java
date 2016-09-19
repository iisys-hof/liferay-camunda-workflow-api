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

package de.iisys.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import de.iisys.exception.NoSuchCamundaException;

import de.iisys.model.Camunda;

/**
 * The persistence interface for the camunda service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see de.iisys.service.persistence.impl.CamundaPersistenceImpl
 * @see CamundaUtil
 * @generated
 */
@ProviderType
public interface CamundaPersistence extends BasePersistence<Camunda> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CamundaUtil} to access the camunda persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the camundas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching camundas
	*/
	public java.util.List<Camunda> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the camundas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CamundaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of camundas
	* @param end the upper bound of the range of camundas (not inclusive)
	* @return the range of matching camundas
	*/
	public java.util.List<Camunda> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the camundas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CamundaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of camundas
	* @param end the upper bound of the range of camundas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching camundas
	*/
	public java.util.List<Camunda> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator);

	/**
	* Returns an ordered range of all the camundas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CamundaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of camundas
	* @param end the upper bound of the range of camundas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching camundas
	*/
	public java.util.List<Camunda> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first camunda in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching camunda
	* @throws NoSuchCamundaException if a matching camunda could not be found
	*/
	public Camunda findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator)
		throws NoSuchCamundaException;

	/**
	* Returns the first camunda in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public Camunda fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator);

	/**
	* Returns the last camunda in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching camunda
	* @throws NoSuchCamundaException if a matching camunda could not be found
	*/
	public Camunda findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator)
		throws NoSuchCamundaException;

	/**
	* Returns the last camunda in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public Camunda fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator);

	/**
	* Returns the camundas before and after the current camunda in the ordered set where uuid = &#63;.
	*
	* @param fooId the primary key of the current camunda
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next camunda
	* @throws NoSuchCamundaException if a camunda with the primary key could not be found
	*/
	public Camunda[] findByUuid_PrevAndNext(long fooId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator)
		throws NoSuchCamundaException;

	/**
	* Removes all the camundas where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of camundas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching camundas
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the camunda where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCamundaException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching camunda
	* @throws NoSuchCamundaException if a matching camunda could not be found
	*/
	public Camunda findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCamundaException;

	/**
	* Returns the camunda where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public Camunda fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the camunda where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public Camunda fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the camunda where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the camunda that was removed
	*/
	public Camunda removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchCamundaException;

	/**
	* Returns the number of camundas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching camundas
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the camundas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching camundas
	*/
	public java.util.List<Camunda> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the camundas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CamundaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of camundas
	* @param end the upper bound of the range of camundas (not inclusive)
	* @return the range of matching camundas
	*/
	public java.util.List<Camunda> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the camundas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CamundaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of camundas
	* @param end the upper bound of the range of camundas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching camundas
	*/
	public java.util.List<Camunda> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator);

	/**
	* Returns an ordered range of all the camundas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CamundaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of camundas
	* @param end the upper bound of the range of camundas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching camundas
	*/
	public java.util.List<Camunda> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first camunda in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching camunda
	* @throws NoSuchCamundaException if a matching camunda could not be found
	*/
	public Camunda findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator)
		throws NoSuchCamundaException;

	/**
	* Returns the first camunda in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public Camunda fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator);

	/**
	* Returns the last camunda in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching camunda
	* @throws NoSuchCamundaException if a matching camunda could not be found
	*/
	public Camunda findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator)
		throws NoSuchCamundaException;

	/**
	* Returns the last camunda in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public Camunda fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator);

	/**
	* Returns the camundas before and after the current camunda in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param fooId the primary key of the current camunda
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next camunda
	* @throws NoSuchCamundaException if a camunda with the primary key could not be found
	*/
	public Camunda[] findByUuid_C_PrevAndNext(long fooId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator)
		throws NoSuchCamundaException;

	/**
	* Removes all the camundas where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of camundas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching camundas
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the camundas where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the matching camundas
	*/
	public java.util.List<Camunda> findByField2(boolean field2);

	/**
	* Returns a range of all the camundas where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CamundaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of camundas
	* @param end the upper bound of the range of camundas (not inclusive)
	* @return the range of matching camundas
	*/
	public java.util.List<Camunda> findByField2(boolean field2, int start,
		int end);

	/**
	* Returns an ordered range of all the camundas where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CamundaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of camundas
	* @param end the upper bound of the range of camundas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching camundas
	*/
	public java.util.List<Camunda> findByField2(boolean field2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator);

	/**
	* Returns an ordered range of all the camundas where field2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CamundaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param field2 the field2
	* @param start the lower bound of the range of camundas
	* @param end the upper bound of the range of camundas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching camundas
	*/
	public java.util.List<Camunda> findByField2(boolean field2, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first camunda in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching camunda
	* @throws NoSuchCamundaException if a matching camunda could not be found
	*/
	public Camunda findByField2_First(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator)
		throws NoSuchCamundaException;

	/**
	* Returns the first camunda in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public Camunda fetchByField2_First(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator);

	/**
	* Returns the last camunda in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching camunda
	* @throws NoSuchCamundaException if a matching camunda could not be found
	*/
	public Camunda findByField2_Last(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator)
		throws NoSuchCamundaException;

	/**
	* Returns the last camunda in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public Camunda fetchByField2_Last(boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator);

	/**
	* Returns the camundas before and after the current camunda in the ordered set where field2 = &#63;.
	*
	* @param fooId the primary key of the current camunda
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next camunda
	* @throws NoSuchCamundaException if a camunda with the primary key could not be found
	*/
	public Camunda[] findByField2_PrevAndNext(long fooId, boolean field2,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator)
		throws NoSuchCamundaException;

	/**
	* Removes all the camundas where field2 = &#63; from the database.
	*
	* @param field2 the field2
	*/
	public void removeByField2(boolean field2);

	/**
	* Returns the number of camundas where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the number of matching camundas
	*/
	public int countByField2(boolean field2);

	/**
	* Caches the camunda in the entity cache if it is enabled.
	*
	* @param camunda the camunda
	*/
	public void cacheResult(Camunda camunda);

	/**
	* Caches the camundas in the entity cache if it is enabled.
	*
	* @param camundas the camundas
	*/
	public void cacheResult(java.util.List<Camunda> camundas);

	/**
	* Creates a new camunda with the primary key. Does not add the camunda to the database.
	*
	* @param fooId the primary key for the new camunda
	* @return the new camunda
	*/
	public Camunda create(long fooId);

	/**
	* Removes the camunda with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the camunda
	* @return the camunda that was removed
	* @throws NoSuchCamundaException if a camunda with the primary key could not be found
	*/
	public Camunda remove(long fooId) throws NoSuchCamundaException;

	public Camunda updateImpl(Camunda camunda);

	/**
	* Returns the camunda with the primary key or throws a {@link NoSuchCamundaException} if it could not be found.
	*
	* @param fooId the primary key of the camunda
	* @return the camunda
	* @throws NoSuchCamundaException if a camunda with the primary key could not be found
	*/
	public Camunda findByPrimaryKey(long fooId) throws NoSuchCamundaException;

	/**
	* Returns the camunda with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fooId the primary key of the camunda
	* @return the camunda, or <code>null</code> if a camunda with the primary key could not be found
	*/
	public Camunda fetchByPrimaryKey(long fooId);

	@Override
	public java.util.Map<java.io.Serializable, Camunda> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the camundas.
	*
	* @return the camundas
	*/
	public java.util.List<Camunda> findAll();

	/**
	* Returns a range of all the camundas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CamundaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of camundas
	* @param end the upper bound of the range of camundas (not inclusive)
	* @return the range of camundas
	*/
	public java.util.List<Camunda> findAll(int start, int end);

	/**
	* Returns an ordered range of all the camundas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CamundaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of camundas
	* @param end the upper bound of the range of camundas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of camundas
	*/
	public java.util.List<Camunda> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator);

	/**
	* Returns an ordered range of all the camundas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CamundaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of camundas
	* @param end the upper bound of the range of camundas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of camundas
	*/
	public java.util.List<Camunda> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Camunda> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the camundas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of camundas.
	*
	* @return the number of camundas
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}