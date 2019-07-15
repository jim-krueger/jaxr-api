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
 * Represents an email address.
 *
 * @see User
 * @author Farrukh S. Najmi
 */
public interface EmailAddress {

	/**
	 * Returns the email address for this object.
	 * Default is a NULL String.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the actual email address (e.g. john.doe@acme.com)
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    public String getAddress() throws JAXRException;

	/**
	 * Sets the email address for this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param address	the actual email address (e.g. john.doe@acme.com)
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    public void setAddress(String address) throws JAXRException;

    /**
     * Gets the type for this object.
     * Default is a NULL String.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @return	the usage type for this object which is an arbitrary value (e.g. "Home" or "Office")
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    public String getType() throws JAXRException;

    /**
     * Sets the type for this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @param	type	the usage type for this object which is an arbitrary value (e.g. "Home" or "Office")
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    public void setType(String type) throws JAXRException;
}
