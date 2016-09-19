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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import de.iisys.model.Camunda;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the camunda service. This utility wraps {@link de.iisys.service.persistence.impl.CamundaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CamundaPersistence
 * @see de.iisys.service.persistence.impl.CamundaPersistenceImpl
 * @generated
 */
@ProviderType
public class CamundaUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Camunda camunda) {
		getPersistence().clearCache(camunda);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Camunda> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Camunda> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Camunda> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Camunda> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Camunda update(Camunda camunda) {
		return getPersistence().update(camunda);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Camunda update(Camunda camunda, ServiceContext serviceContext) {
		return getPersistence().update(camunda, serviceContext);
	}

	/**
	* Returns all the camundas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching camundas
	*/
	public static List<Camunda> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Camunda> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Camunda> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Camunda> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Camunda> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Camunda> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first camunda in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching camunda
	* @throws NoSuchCamundaException if a matching camunda could not be found
	*/
	public static Camunda findByUuid_First(java.lang.String uuid,
		OrderByComparator<Camunda> orderByComparator)
		throws de.iisys.exception.NoSuchCamundaException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first camunda in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public static Camunda fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Camunda> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last camunda in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching camunda
	* @throws NoSuchCamundaException if a matching camunda could not be found
	*/
	public static Camunda findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Camunda> orderByComparator)
		throws de.iisys.exception.NoSuchCamundaException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last camunda in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public static Camunda fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Camunda> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the camundas before and after the current camunda in the ordered set where uuid = &#63;.
	*
	* @param fooId the primary key of the current camunda
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next camunda
	* @throws NoSuchCamundaException if a camunda with the primary key could not be found
	*/
	public static Camunda[] findByUuid_PrevAndNext(long fooId,
		java.lang.String uuid, OrderByComparator<Camunda> orderByComparator)
		throws de.iisys.exception.NoSuchCamundaException {
		return getPersistence()
				   .findByUuid_PrevAndNext(fooId, uuid, orderByComparator);
	}

	/**
	* Removes all the camundas where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of camundas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching camundas
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the camunda where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCamundaException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching camunda
	* @throws NoSuchCamundaException if a matching camunda could not be found
	*/
	public static Camunda findByUUID_G(java.lang.String uuid, long groupId)
		throws de.iisys.exception.NoSuchCamundaException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the camunda where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public static Camunda fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the camunda where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public static Camunda fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the camunda where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the camunda that was removed
	*/
	public static Camunda removeByUUID_G(java.lang.String uuid, long groupId)
		throws de.iisys.exception.NoSuchCamundaException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of camundas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching camundas
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the camundas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching camundas
	*/
	public static List<Camunda> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<Camunda> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<Camunda> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Camunda> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<Camunda> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Camunda> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first camunda in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching camunda
	* @throws NoSuchCamundaException if a matching camunda could not be found
	*/
	public static Camunda findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Camunda> orderByComparator)
		throws de.iisys.exception.NoSuchCamundaException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first camunda in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public static Camunda fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Camunda> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last camunda in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching camunda
	* @throws NoSuchCamundaException if a matching camunda could not be found
	*/
	public static Camunda findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Camunda> orderByComparator)
		throws de.iisys.exception.NoSuchCamundaException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last camunda in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public static Camunda fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Camunda> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static Camunda[] findByUuid_C_PrevAndNext(long fooId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Camunda> orderByComparator)
		throws de.iisys.exception.NoSuchCamundaException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(fooId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the camundas where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of camundas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching camundas
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the camundas where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the matching camundas
	*/
	public static List<Camunda> findByField2(boolean field2) {
		return getPersistence().findByField2(field2);
	}

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
	public static List<Camunda> findByField2(boolean field2, int start, int end) {
		return getPersistence().findByField2(field2, start, end);
	}

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
	public static List<Camunda> findByField2(boolean field2, int start,
		int end, OrderByComparator<Camunda> orderByComparator) {
		return getPersistence()
				   .findByField2(field2, start, end, orderByComparator);
	}

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
	public static List<Camunda> findByField2(boolean field2, int start,
		int end, OrderByComparator<Camunda> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByField2(field2, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first camunda in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching camunda
	* @throws NoSuchCamundaException if a matching camunda could not be found
	*/
	public static Camunda findByField2_First(boolean field2,
		OrderByComparator<Camunda> orderByComparator)
		throws de.iisys.exception.NoSuchCamundaException {
		return getPersistence().findByField2_First(field2, orderByComparator);
	}

	/**
	* Returns the first camunda in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public static Camunda fetchByField2_First(boolean field2,
		OrderByComparator<Camunda> orderByComparator) {
		return getPersistence().fetchByField2_First(field2, orderByComparator);
	}

	/**
	* Returns the last camunda in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching camunda
	* @throws NoSuchCamundaException if a matching camunda could not be found
	*/
	public static Camunda findByField2_Last(boolean field2,
		OrderByComparator<Camunda> orderByComparator)
		throws de.iisys.exception.NoSuchCamundaException {
		return getPersistence().findByField2_Last(field2, orderByComparator);
	}

	/**
	* Returns the last camunda in the ordered set where field2 = &#63;.
	*
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching camunda, or <code>null</code> if a matching camunda could not be found
	*/
	public static Camunda fetchByField2_Last(boolean field2,
		OrderByComparator<Camunda> orderByComparator) {
		return getPersistence().fetchByField2_Last(field2, orderByComparator);
	}

	/**
	* Returns the camundas before and after the current camunda in the ordered set where field2 = &#63;.
	*
	* @param fooId the primary key of the current camunda
	* @param field2 the field2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next camunda
	* @throws NoSuchCamundaException if a camunda with the primary key could not be found
	*/
	public static Camunda[] findByField2_PrevAndNext(long fooId,
		boolean field2, OrderByComparator<Camunda> orderByComparator)
		throws de.iisys.exception.NoSuchCamundaException {
		return getPersistence()
				   .findByField2_PrevAndNext(fooId, field2, orderByComparator);
	}

	/**
	* Removes all the camundas where field2 = &#63; from the database.
	*
	* @param field2 the field2
	*/
	public static void removeByField2(boolean field2) {
		getPersistence().removeByField2(field2);
	}

	/**
	* Returns the number of camundas where field2 = &#63;.
	*
	* @param field2 the field2
	* @return the number of matching camundas
	*/
	public static int countByField2(boolean field2) {
		return getPersistence().countByField2(field2);
	}

	/**
	* Caches the camunda in the entity cache if it is enabled.
	*
	* @param camunda the camunda
	*/
	public static void cacheResult(Camunda camunda) {
		getPersistence().cacheResult(camunda);
	}

	/**
	* Caches the camundas in the entity cache if it is enabled.
	*
	* @param camundas the camundas
	*/
	public static void cacheResult(List<Camunda> camundas) {
		getPersistence().cacheResult(camundas);
	}

	/**
	* Creates a new camunda with the primary key. Does not add the camunda to the database.
	*
	* @param fooId the primary key for the new camunda
	* @return the new camunda
	*/
	public static Camunda create(long fooId) {
		return getPersistence().create(fooId);
	}

	/**
	* Removes the camunda with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the camunda
	* @return the camunda that was removed
	* @throws NoSuchCamundaException if a camunda with the primary key could not be found
	*/
	public static Camunda remove(long fooId)
		throws de.iisys.exception.NoSuchCamundaException {
		return getPersistence().remove(fooId);
	}

	public static Camunda updateImpl(Camunda camunda) {
		return getPersistence().updateImpl(camunda);
	}

	/**
	* Returns the camunda with the primary key or throws a {@link NoSuchCamundaException} if it could not be found.
	*
	* @param fooId the primary key of the camunda
	* @return the camunda
	* @throws NoSuchCamundaException if a camunda with the primary key could not be found
	*/
	public static Camunda findByPrimaryKey(long fooId)
		throws de.iisys.exception.NoSuchCamundaException {
		return getPersistence().findByPrimaryKey(fooId);
	}

	/**
	* Returns the camunda with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fooId the primary key of the camunda
	* @return the camunda, or <code>null</code> if a camunda with the primary key could not be found
	*/
	public static Camunda fetchByPrimaryKey(long fooId) {
		return getPersistence().fetchByPrimaryKey(fooId);
	}

	public static java.util.Map<java.io.Serializable, Camunda> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the camundas.
	*
	* @return the camundas
	*/
	public static List<Camunda> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Camunda> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Camunda> findAll(int start, int end,
		OrderByComparator<Camunda> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Camunda> findAll(int start, int end,
		OrderByComparator<Camunda> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the camundas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of camundas.
	*
	* @return the number of camundas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CamundaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CamundaPersistence, CamundaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CamundaPersistence.class);
}