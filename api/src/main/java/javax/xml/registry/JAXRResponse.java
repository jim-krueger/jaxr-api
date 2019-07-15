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

/**
 * A Jakarta XML Registries requests' response.
 *
 * @see JAXRException
 * @author Farrukh S. Najmi
 */
public interface JAXRResponse {

	/**
	 * Status indicating a successful response.
	 */
	public static final int STATUS_SUCCESS=0;

	/**
	 * Status indicating a successful response that included at least one warning.
	 */
	public static final int STATUS_WARNING=1;

	/**
	 * Status indicating a failure response.
	 */
	public static final int STATUS_FAILURE=2;

	/**
	 * Status indicating that the results are currently unavailable.
	 */
	public static final int STATUS_UNAVAILABLE=3;

	/**
	 * Returns the unique id for the request that generated this response.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the request id
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	String getRequestId() throws JAXRException;


	/**
	 * Returns the status for this response.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @see JAXRResponse#STATUS_SUCCESS
	 * @return the status which is an integer enumerated value
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	public int getStatus() throws JAXRException;

	/**
	 * Returns true if a response is available, false otherwise.
	 * This is a polling method and must not block.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return <code>true</code> if the response is available; <code>false</code> otherwise
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	public boolean isAvailable() throws JAXRException;
}
