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
 * Represents a single logical connection to a federation or group of
 * registry providers. This interface is used in support of the distributed
 * query feature of the Jakarta XML Registries API.
 *
 *
 * @author Farrukh S. Najmi
 */
public interface FederatedConnection extends Connection {
    /**
     * Gets the RegistryService interface associated with the Connection.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     * @associates <{RegistryService}>
     * @see RegistryService
     */
	/*#RegistryService getRegistryService() throws JAXRException;*/
}
