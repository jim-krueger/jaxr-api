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
 * Defines common behavior expected of any class that validates URIs.
 *
 *
 * @author Farrukh S. Najmi
 */
public interface URIValidator {

	/**
	 * Sets whether to do URI validation for this object. Default is true.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param validate <code>true</code> implies JAXR provider must perform validation
	 * 	of URIs when they are set; <code>false</code> implies validation is turned off
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setValidateURI(boolean validate) throws JAXRException;

	/**
	 * Gets whether to do URI validation for this object.
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return <code>true</code> implies JAXR provider must perform validation
	 * 	of URIs when they are set; <code>false</code> implies validation is turned off
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public boolean getValidateURI() throws JAXRException;
}
