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
 * Represents a person's name.
 *
 * @author Farrukh S. Najmi
 */
public interface PersonName {
    /**
	 * Gets the last name (surname) for this Person.
	 * Default is a NULL String.
	 *
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @return the person's last name
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    public String getLastName() throws JAXRException;

    /**
	 * Sets the last name (surname) for this Person.
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @param lastName	 the person's last name
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    public void setLastName(String lastName) throws JAXRException;

    /**
	 * Gets the first name for this Person.
	 * Default is an empty String.
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @return the person's first name
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    public String getFirstName() throws JAXRException;

    /**
	 * Sets the first name for this Person.
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @param firstName the person's first name
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    public void setFirstName(String firstName) throws JAXRException;

    /**
	 * Gets the middle name for this Person.
	 * Default is an empty String.
	 *
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @return the person's middle name
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    public String getMiddleName() throws JAXRException;

	/**
	 * Sets the middle name for this Person.
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @param middleName the person's middle name
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	public void setMiddleName(String middleName) throws JAXRException;

	/**
	 * Gets the fully formatted name for this person.
	 * Default is an empty String.
	 *
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the person's full name
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	public String getFullName() throws JAXRException;

	/**
	 * Sets the fully formatted name for this person.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param fullName	the person's full name
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	public void setFullName(String fullName) throws JAXRException;
}
