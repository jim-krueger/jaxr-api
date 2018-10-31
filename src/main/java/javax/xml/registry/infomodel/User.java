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

import java.net.*;

import javax.xml.registry.*;
import java.util.*;

/**
 * User instances are RegistryObjects that are used to provide information about registered users within the registry. Users are affiliated with Organizations. User objects are used in the audit trail for a RegistryObject.
 *
 * @see Organization
 * @see AuditableEvent
 * @author Farrukh S. Najmi
 */
public interface User extends RegistryObject {
    /**
	 * Gets the Organization that this User is affiliated with.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @return the Organization that this User is affiliated with
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @see Organization
	 */
    Organization getOrganization() throws JAXRException;

    /**
	 * Returns the name of this User.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the name of this User
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public PersonName getPersonName() throws JAXRException;

    /**
	 * Sets the name of this User.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param personName	the name of this User
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public void setPersonName(PersonName personName) throws JAXRException;

    /**
     * Gets the postal address for this User.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @see javax.xml.registry.infomodel.PostalAddress
     * @return Collection of PostalAddress instances. The Collection may be empty but not null.
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     *
     * @see PostalAddress
     */
    public Collection getPostalAddresses() throws JAXRException;

    /**
	 * Sets the addresses for this User.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param addresses Is a Collection of PostAddress instances.
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void setPostalAddresses(Collection addresses) throws JAXRException;

    /**
	 * Gets the URL to the web page for this User.
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @return the URL for this User's home page
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public URL getUrl() throws JAXRException;

    /**
	 * Sets the URL to the web page for this User.
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @param url	the URL for this User's home page
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public void setUrl(URL url) throws JAXRException;

	/**
	 * Gets the telephone numbers for this User that match the specified telephone number type.
	 *
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @see javax.xml.registry.infomodel.TelephoneNumber
	 * @return Collection of TelephoneNumber instances. The Collection may be empty but not null.
	 * @param phoneType specifies the type of phone numbers to be returned. If phoneType is null, return all telephoneNumbers
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public Collection getTelephoneNumbers(String phoneType) throws JAXRException;

	/**
	 * Sets the various telephone numbers for this user.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param phoneNumbers	the Collection of TelephoneNumbers to be set
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setTelephoneNumbers(Collection phoneNumbers) throws JAXRException;

	/**
	 * Gets the email addresses for this User.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @see javax.xml.registry.infomodel.EmailAddress
	 * @return Collection of EmailAddress instances. The Collection may be empty but not null.
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public Collection getEmailAddresses() throws JAXRException;

	/**
	 * Sets the Collection of EmailAddress instances for this User.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param emailAddresses	the Collection of EmailAddresses to be set
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setEmailAddresses(Collection emailAddresses) throws JAXRException;

	/**
	 * Gets the type for this User.
	 * Default is a NULL String.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the type for this User, which is an arbitrary String
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getType() throws JAXRException;

	/**
	 * Sets the type for this User.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param type	the type for this User, which is an arbitrary String
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setType(String type) throws JAXRException;

}
