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
 * An ExtensibleObject is one that allows itself to be extended by utilizing
 * dynamically added Slots that add arbitrary attributes to the object on a
 * per instance basis.
 *
 * @see Slot
 * @author Farrukh S. Najmi
 */
public interface ExtensibleObject {
    /**
	 * Adds a Slot to this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param slot	the Slot object being added to this object
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    void addSlot(Slot slot) throws JAXRException;

    /**
     *
     * Adds more Slots to this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param slots	the Collection of Slot objects being added to this object
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     * @see Slot
     */
    void addSlots(Collection slots) throws JAXRException;

    /**
	 * Removes a Slot from this object. The Slot is identified by its name.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param slotName	the name for the Slot object being removed from this object
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    void removeSlot(String slotName) throws JAXRException;

    /**
     * Removes specified Slots from this object. The Slots are identified by its name.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param slotNames	the Collection of names for Slot objects being removed from this object. Must be a Collection of Strings
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     * @see Slot
     */
    void removeSlots(Collection slotNames) throws JAXRException;

	/**
	 * Gets the slot specified by slotName.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param slotName the name of the desired Slot object
     * @return Slot object retrieved
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	Slot getSlot(String slotName) throws JAXRException;

    /**
     * Returns the Slots associated with this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @return Collection of Slot instances. The Collection may be empty but not null.
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     * @see Slot
     */
    Collection getSlots() throws JAXRException;

}
