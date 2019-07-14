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
 * This is the principal interface implemented by a Jakarta XML Registries provider.
 * A registry client can get this interface from a Connection to a registry.
 * It provides the methods that are used by the client to discover various capability
 * specific interfaces implemented by the Jakarta XML Registries provider.
 *
 * @see Connection
 * @author Farrukh S. Najmi
 */
public interface RegistryService {

    /**
     * Returns the CapabilityProfile for the Jakarta XML Registries provider.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @return the CapabilityProfile for a Jakarta XML Registries provider
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     * @see javax.xml.registry.CapabilityProfile
     * @see LifeCycleManager
     */
    CapabilityProfile getCapabilityProfile() throws JAXRException;


    /**
     * Returns the BusinessLifeCycleManager object implemented by the Jakarta XML Registries provider.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @return the BusinessLifeCycleManager
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     * @see javax.xml.registry.BusinessLifeCycleManager
     * @see LifeCycleManager
     */
    BusinessLifeCycleManager getBusinessLifeCycleManager() throws JAXRException;

    /**
     * Returns the BusinessQueryManager object implemented by the Jakarta XML Registries provider.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @return the BusinessQueryManaer
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     * @see BusinessQueryManager
     */
    BusinessQueryManager getBusinessQueryManager() throws JAXRException;

    /**
     * Returns the DeclarativeQueryManager object implemented by the Jakarta XML Registries provider.
     *
     * <DL><DT><B>Capability Level: 1 </B></DL>
     *
	 * @return the DeclarativeQueryManager
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     * @throws UnsupportedCapabilityException If the Jakarta XML Registries provider can not satisfy the request
     *
     * @see DeclarativeQueryManager
     */
    DeclarativeQueryManager getDeclarativeQueryManager() throws JAXRException, UnsupportedCapabilityException;

	/**
	 * Returns the BulkResponse associated with specified requestId.
	 * Once a client retrieves a BulkResponse for a particular requestId
	 * any subsequent calls to retrieve the Bulkresponse for the same requestId
	 * should result in an InvalidRequestException.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param requestId	the id for a previous asynchronous request
	 * @return the BulkResponse that contains the result for the specified request
	 * @throws InvalidRequestException	if no responses exist for specified requestId
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	BulkResponse getBulkResponse(String requestId) throws InvalidRequestException, JAXRException;


    /**
     * Gets the default user-defined postal scheme for codifying the attributes of PostalAddress.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @return the ClassificationScheme that is the default postal scheme
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    public ClassificationScheme getDefaultPostalScheme()  throws JAXRException;

	/**
	 * Takes a String that is an XML request in a registry-specific
	 * format, sends the request to the registry, and returns a String that is
	 * the registry-specific XML response.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param request	the registry-specific request in a String representation
	 * @return the String that is the XML response in a registry-specific manner
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	public String makeRegistrySpecificRequest(String request) throws JAXRException;
}
