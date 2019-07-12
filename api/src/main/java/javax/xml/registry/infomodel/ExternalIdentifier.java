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

/**
 * ExternalIdentifier instances provide the additional identifier information
 * to RegistryObjects such as DUNS number, Social Security Number, or an alias
 * name of the organization.  The attribute name inherited from RegistryObject is
 * used to contain the identification scheme ("DUNS" "Social Security Number", etc.),
 * and the attribute value contains the actual information (e.g. the actual DUNS number).
 * Each RegistryObject may have 0 or more ExternalIdentifiers.
 *
 * @see RegistryObject
 * @author Farrukh S. Najmi
 */
public interface ExternalIdentifier extends RegistryObject {

	/**
	 * Gets the parent RegistryObject for this ExternalIdentifier.
	 * To set the registryObject call addExternalIdentifier on a RegistryObject.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @see RegistryObject#addExternalIdentifier(ExternalIdentifier ei)
	 * @return	the RegistryObject that this object identifies
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	RegistryObject getRegistryObject() throws JAXRException;

	/**
	 * Gets the value of an ExternalIdentifier.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return	the identification value defined by this object (e.g. a company's DUNS number)
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getValue() throws JAXRException;

	/**
	 * Sets the value of an ExternalIdentifier.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param value	the identification value defined by this object (e.g. a company's DUNS number)
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setValue(String value) throws JAXRException;

    /**
     * Gets the ClassificationScheme that is used as the identification scheme
     * for identifying this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @return the ClassificationScheme that is used as the identification scheme (e.g. "DUNS")
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @see Classification
     */
    ClassificationScheme getIdentificationScheme() throws JAXRException;

    /**
     * Sets the ClassificationScheme that is used as the identification scheme
	 * for identifying this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @param identificationScheme	the ClassificationScheme that is used as the identification scheme (e.g. "DUNS")
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setIdentificationScheme(ClassificationScheme identificationScheme) throws JAXRException;
}
