/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.xml.registry;

import java.util.*;
import javax.xml.registry.infomodel.*;

/**
 * This is the common base interface for all QueryManagers in the API.
 *
 * @author Farrukh S. Najmi
 */
public interface QueryManager {

    /**
     * Gets the RegistryObject specified by the Id and type of object.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @param id is the id of the Key for a RegistryObject.
	 * @param objectType is a constant definition from LifeCycleManager that specifies the type of object desired.
     * @return the RegistryObject, returned as its concrete type (e.g. Organization, User etc.).
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public RegistryObject getRegistryObject(String id, String objectType)  throws JAXRException;

    /**
     * Gets the RegistryObject specified by the Id.
     *
     *
     * <DL><DT><B>Capability Level: 1 </B></DL>
     *
	 * @param id	the id for the desired object
     * @return the RegistryObject, returned as its concrete type (e.g. Organization, User etc.).
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public RegistryObject getRegistryObject(String id)  throws JAXRException;

    /**
	 * Gets the specified RegistryObjects.
	 * The objects are returned as their concrete type (e.g. Organization, User etc.).
	 *
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @param objectKeys	a Collection of Key objects for the desired objects
	 * @return BulkResponse containing a heterogeneous Collection of RegistryObjects (e.g. Organization, User etc.).
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public BulkResponse getRegistryObjects(Collection objectKeys)  throws JAXRException;

    /**
     * Gets the specified RegistryObjects.
     * The objects are returned as their concrete type (e.g. Organization, User etc.).
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     *
     * @param objectKeys	a Collection of Key objects for the desired objects
     * @param objectTypes	a Collection of String objects that allow filtering desired objects by their type
     * @return BulkResponse containing a heterogeneous Collection of RegistryObjects (e.g. Organization, User etc.).
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public BulkResponse getRegistryObjects(Collection objectKeys, String objectTypes)  throws JAXRException;

    /**
     * Gets the RegistryObjects owned by the caller.
     * The objects are returned as their concrete type (e.g. Organization, User etc.).
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @return BulkResponse containing a heterogeneous Collection of RegistryObjects (e.g. Organization, User etc.).
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public BulkResponse getRegistryObjects()  throws JAXRException;

    /**
     * Gets the RegistryObjects owned by the caller, that are of the specified type.
     * The objects are returned as their concrete type (e.g. Organization, User etc.).
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @param objectType Is a constant that defines the type of object sought. See LifeCycleManager for constants for object types.
	 * @see LifeCycleManager#ORGANIZATION
     * @return BulkResponse containing a heterogeneous Collection of RegistryObjects (e.g. Organization, User etc.).
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public BulkResponse getRegistryObjects(String objectType)  throws JAXRException;


    /**
     * Returns the parent RegistryService that created this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @return the RegistryService created this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @see javax.xml.registry.RegistryService
     */
    RegistryService getRegistryService() throws JAXRException;
}
