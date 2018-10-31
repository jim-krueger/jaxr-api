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

package javax.xml.registry.infomodel;

import javax.xml.registry.*;

import java.util.*;

/**
 * Service instances are RegistryObjects that provide information on services
 * (for example, web services) offered by an Organization. A Service may have a set of ServiceBinding instances.
 * Maps to a BusinessService in UDDI.
 *
 * @see ServiceBinding
 * @author Farrukh S. Najmi
 */
public interface Service extends RegistryEntry {

	/**
	 * Gets the Organization that provides this service.
	 * Providing Organization may be null. The providing
	 * Organization may be different from the Submitting Organization
	 * as defined by RegistryObject#getSubmittingOrganization.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @see RegistryObject#getSubmittingOrganization()
	 * @return the Organization that provides this service
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 *
	 */
	Organization getProvidingOrganization() throws JAXRException;

	/**
	 * Sets the Organization that provides this service.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param providingOrganization	the Organization that provides this service
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void setProvidingOrganization(Organization providingOrganization) throws JAXRException;

	/**
	 * Adds a child ServiceBinding.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param serviceBinding	the ServiceBinding being added
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void addServiceBinding(ServiceBinding serviceBinding) throws JAXRException;

	/**
	 * Adds a Collection of ServiceBinding children.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param serviceBindings	the Collection of ServiceBindings being added
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void addServiceBindings(Collection serviceBindings) throws JAXRException;

	/**
	 * Removes a child ServiceBinding.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param serviceBinding	the ServiceBinding being removed
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void removeServiceBinding(ServiceBinding serviceBinding) throws JAXRException;

	/**
	 * Removes a Collection of children ServiceBindings.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param serviceBindings	the Collection of ServiceBindings being removed
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void removeServiceBindings(Collection serviceBindings) throws JAXRException;

	/**
	 * Gets all children ServiceBindings.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @see javax.xml.registry.infomodel.ServiceBinding
	 * @return Collection of ServiceBinding instances. The Collection may be empty but not null.
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	Collection getServiceBindings() throws JAXRException;

}
