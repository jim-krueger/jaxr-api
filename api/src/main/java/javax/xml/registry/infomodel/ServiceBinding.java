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
 * ServiceBinding instances are RegistryObjects that represent technical information on a specific way to access a specific interface offered by a Service instance. A ServiceBinding may have a set of SpecificationLink instances.
 * Maps to a BindingTemplate in UDDI.
 *
 * @see Concept
 * @author Farrukh S. Najmi
 */
public interface ServiceBinding extends RegistryObject, URIValidator {

	/**
	 * Gets the URI that gives access to the service via this binding.
	 * Default is a NULL String.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the URI that gives access to the service via this binding
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 *
	 */
	String getAccessURI() throws JAXRException;

	/**
	 * Sets the URI that gives access to the service via this binding.
	 * The accessURI is mutually exclusive from targetBinding. Jakarta XML Registries Provider must
	 * throw an InvalidRequestException if an accessURI is set when there is
	 * already a non-null targetBinding defined.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param uri	the URI that gives access to the service via this binding
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	void setAccessURI(String uri) throws JAXRException;

	/**
	 * Gets the next ServiceBinding in case there is a redirection from
	 * one service provider to another service provider.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the next ServiceBinding in case there is a service redirection
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	ServiceBinding getTargetBinding() throws JAXRException;

    /**
	 * Sets the next ServiceBinding in case there is a redirection.
     * The targetBinding is mutually exclusive from the accessURI. Jakarta XML Registries Provider must
     * throw an InvalidRequestExcpetion if a targetBinding is set when there is
     * already a non-null accessURI defined.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param binding the target ServiceBinding to which this object is redirected to
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    void setTargetBinding(ServiceBinding binding) throws JAXRException;



	/**
	 * Gets the parent service for which this is a binding.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return	the parent Service object
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	Service getService() throws JAXRException;

    /**
	 * Adds a child SpecificationLink.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param specificationLink	the SpecificationLink being added
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    void addSpecificationLink(SpecificationLink specificationLink) throws JAXRException;

    /**
	 * Adds a Collection of SpecificationLink children.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param specificationLinks	the Collection of SpecificationLinks being added
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    void addSpecificationLinks(Collection specificationLinks) throws JAXRException;

    /**
	 * Removes a child SpecificationLink.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param specificationLink	the SpecificationLink being removed
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    void removeSpecificationLink(SpecificationLink specificationLink) throws JAXRException;

    /**
	 * Removes a Collection of children SpecificationLinks.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param specificationLinks	the Collection of SpecificationLinks being removed
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    void removeSpecificationLinks(Collection specificationLinks) throws JAXRException;


    /**
     * Gets all children SpecificationLinks.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     *
     * @see javax.xml.registry.infomodel.SpecificationLink
     * @return Collection of SpecificationLink instances. The Collection may be empty but not null.
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    Collection getSpecificationLinks() throws JAXRException;

}
