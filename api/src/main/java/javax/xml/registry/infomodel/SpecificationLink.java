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
 * A SpecificationLink provides the linkage between a ServiceBinding and one of its technical specifications that describes how to use the service using the ServiceBinding. For example, a ServiceBinding may have a SpecificationLink instance that describes how to access the service using a technical specification in the form of a WSDL document or a CORBA IDL document.
 * It serves the same purpose as the union of the tModelInstanceInfo and instanceDetails structures in
 * UDDI.
 *
 * @see Concept
 * @author Farrukh S. Najmi
 */
public interface SpecificationLink extends RegistryObject {
    /**
     * Gets the specification object for this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the RegistryObject that is the specification object.
     * 	For a UDDI provider the specification object must be a Concept with no parent.
     * 	For an ebXML provider it is likely to be an ExtrinsicObject.
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @see RegistryObject
     */
    RegistryObject getSpecificationObject() throws JAXRException;

    /**
     * Sets the specification object for this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param obj the RegistryObject that is the specification object.
     * 	For a UDDI provider the specification object must be a Concept with no parent.
     * 	For an ebXML provider it is likely to be an ExtrinsicObject.
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setSpecificationObject(RegistryObject obj) throws JAXRException;

    /**
     * Gets the description of usage parameters.
	 * Default is an empty String.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 *
     * @return the usage description for this object, which must not be null
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
	InternationalString getUsageDescription() throws JAXRException;

    /**
     * Sets  the description of usage parameters.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param usageDescription the description of usage parameters for this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
	void setUsageDescription(InternationalString usageDescription) throws JAXRException;

    /**
     * Gets any usage parameters. A usage parameter is an arbitrary String
	 * that describes how to use the technical specification accessed via this
	 * SpecificationLink. Each parameter is a String.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the Collection of String instances. The Collection may be empty but not null.
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
     */
	Collection getUsageParameters() throws JAXRException;

    /**
     * Sets any usage parameters. Each parameter is a String
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @param usageParameters the Collection of usage parameter Strings
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
	void setUsageParameters(Collection usageParameters) throws JAXRException;


	/**
	 * Gets the parent ServiceBinding for this SpecificationLink.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the parent ServiceBinding within which this object is composed
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	ServiceBinding getServiceBinding() throws JAXRException;
}
