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

import javax.xml.registry.infomodel.*;
import java.util.*;



/**
 * This class represents a connection between a JAXR client and a
 * JAXR provider.
 *
 * @see ConnectionFactory
 * @author Farrukh S. Najmi
 */
public interface Connection {

    /**
     * Gets the RegistryService interface associated with the Connection.
	 * If a Connection property (e.g. credentials) is set after the client calls getRegistryService
	 * then the newly set Connection property is visible to the RegistryService
	 * previously returned by this call.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @return the RegistryService associated with this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @see RegistryService
     */
	RegistryService getRegistryService() throws JAXRException;

    /**
	 * Closes a Connection when it is no longer needed.
     * Since a provider typically allocates significant resources outside
     * the JVM on behalf of a Connection, clients should close them when
     * they are not needed.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void close() throws JAXRException;

	/**
	 * Indicated whether this Connection has been closed or not.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return <code>true</code> if Connection is closed; <code>false</code> otherwise
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	boolean isClosed() throws JAXRException;

	/**
	 * Indicates whether a client uses synchronous communication with JAXR provider or not.
	 * A JAXR provider must support both modes
	 * of communication. A JAXR client can choose which mode it wants to use.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return <code>true</code> if Connection is synchronous (default); <code>false</code> otherwise
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public boolean isSynchronous() throws JAXRException;

	/**
	 * Sets whether the client uses synchronous communication or not.
	 * A JAXR client may dynamically change its communication style
	 * preference.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param sync	<code>true</code> if Connection is desired to be synchronous; <code>false</code> otherwise
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setSynchronous(boolean sync) throws JAXRException;

	/**
	 * Sets the Credentials associated with this client. The credentials is used to authenticate the client with the JAXR provider.
	 * A JAXR client may dynamically change its identity by changing
	 * the credentials associated with it.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 *
	 * @param credentials	a Collection oj java.lang.Objects which provide identity related information for the caller.
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setCredentials(Set credentials) throws JAXRException;

	/**
	 * Gets the credentials associated with this client.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return Set of java.lang.Object instances. The Collection may be empty but not null.
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 *
	 */
	public Set getCredentials() throws JAXRException;


}
