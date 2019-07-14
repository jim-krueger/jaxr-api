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

import java.util.*;

import javax.xml.registry.*;

/**
 * The Versionable interface defines the behavior common to classes that
 * are capable of creating versions of their instances. At present all
 * RegistryEntry classes are required to implement the Versionable interface.
 *
 * @see RegistryEntry
 * @author Farrukh S. Najmi
 */
public interface Versionable {
    /**
     * Gets the major revision number for this version of the Versionable object.
     *
     * <DL><DT><B>Capability Level: 1 </B></DL>
     *
	 * @return the major version for this object
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    int getMajorVersion() throws JAXRException;

    /**
     * Sets the major revision number for this version of the Versionable object.
     *
     * <DL><DT><B>Capability Level: 1 </B></DL>
     *
	 * @param majorVersion	the major version number
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void setMajorVersion(int majorVersion) throws JAXRException;

    /**
     * Gets the minor revision number for this version of the Versionable object.
     *
     * <DL><DT><B>Capability Level: 1 </B></DL>
     *
     * @return the minor version for this object
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    int getMinorVersion() throws JAXRException;

    /**
     * Sets the minor revision number for this version of the Versionable object.
     *
     * <DL><DT><B>Capability Level: 1 </B></DL>
     *
     * @param minorVersion	the minor version number
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void setMinorVersion(int minorVersion) throws JAXRException;

    /**
     * Gets the user-specified revision number for this version of the Versionable object.
     *
     * <DL><DT><B>Capability Level: 1 </B></DL>
     *
     * @return the user-defined version number
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    String getUserVersion() throws JAXRException;

    /**
     * Sets the user specified revision number for this version of the Versionable object.
     *
     * <DL><DT><B>Capability Level: 1 </B></DL>
     *
     * @param userVersion	the user-defined version number
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void setUserVersion(String userVersion) throws JAXRException;
}
