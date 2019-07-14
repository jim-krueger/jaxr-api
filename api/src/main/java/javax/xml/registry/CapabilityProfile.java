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
 * Provides information about the capabilities of a Jakarta XML Registries provider.
 *
 * @author Farrukh S. Najmi
 */
public interface CapabilityProfile {

	/**
	 * Gets the Jakarta XML Registries specification version supported by the Jakarta XML Registries provider.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the specification version
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	public String getVersion() throws JAXRException;

	/**
	 * Gets the capability level supported by the Jakarta XML Registries provider.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the capability level
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    public int getCapabilityLevel() throws JAXRException;

}
