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
 * RegistryPackage instances are RegistryEntries that group logically related 
 * RegistryEntries together.
 * A package may contain any number of RegistryObjects. A RegistryObject may be a member of any number of Packages.
 *
 * @see RegistryObject
 * @author Farrukh S. Najmi
 */
public interface RegistryPackage extends RegistryEntry {
	/** 
	 * Adds a child RegistryObject as member. 
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @param registryObject	the RegistryObject being added
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void addRegistryObject(RegistryObject registryObject) throws JAXRException;

	/** 
	 * Adds a Collection of RegistryObject children as members.
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @param registryObjects	the Collection of RegistryObjects being added
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void addRegistryObjects(Collection registryObjects) throws JAXRException;

	/** 
	 * Removes a child RegistryObject from membership. 
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @param registryObject	the RegistryObject being removed
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void removeRegistryObject(RegistryObject registryObject) throws JAXRException;

	/** 
	 * Removes a Collection of children RegistryObjects from membership.
	 *
	 * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
	 *
	 * @param registryObjects	the Collection of RegistryObject being removed
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	void removeRegistryObjects(Collection registryObjects) throws JAXRException;

    /**
     * Gets the collection of member RegistryObjects of this RegistryPackage.
     * 	 	 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
     * @return the Set of RegistryObjects that are members of this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    Set getRegistryObjects() throws JAXRException;
}
