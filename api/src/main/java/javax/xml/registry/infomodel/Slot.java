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
 * Slot instances provide a dynamic way to add arbitrary attributes to
 * RegistryObject instances. This ability to add attributes dynamically
 * to RegistryObject instances enables extensibility within the Registry
 * Information Model.
 * <p>
 * A RegistryObject may have 0 or more Slots. A slot is composed of a name,
 * a slotType and a collection of values. The name of a slot is locally unique
 * within the RegistryObject instance. Similarly, the value of a Slot is
 * locally unique within a slot instance. Since a Slot represents an
 * extensible attribute whose value may be a collection, a
 * Slot is allowed to have a collection of values rather than a single value.
 * The slotType attribute may optionally specify a type or category for the slot.
 *
 * @see ExtensibleObject
 * @author Farrukh S. Najmi
 */
public interface Slot {

	/**
	 * Gets the name for this Slot.
	 * Default is a NULL String.
	 *
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the name
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public String getName() throws JAXRException;

    /**
     * Sets the name for this Slot.
     * Default is a NULL String.
     *
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 @param name	the name
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setName(String name) throws JAXRException;

    /**
     * Gets the slotType for this Slot.
     * Default is a NULL String.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @return the slot type which is an arbitrary String
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getSlotType() throws JAXRException;

    /**
     * Sets the slotType for this Slot.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @param slotType	the slot type which is an arbitrary String
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setSlotType(String slotType) throws JAXRException;

    /**
     * Gets the values for this Slot.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
     * @see java.lang.String
     * @return Collection of String instances representing the values for this Slot. The Collection may be empty but not null.
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     *
     */
    public Collection getValues() throws JAXRException;

    /**
     * Sets the values for this Slot.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @param values the values for this Slot
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setValues(Collection values) throws JAXRException;

	/**
	 * Name for pre-defined Slot used in PostalAddress by JAXR UDDI provider.
	 */
	public static final String SORT_CODE_SLOT = "sortCode";

	/**
	 * Name for pre-defined Slot used in PostalAddress by JAXR UDDI provider.
	 */
	public static final String ADDRESS_LINES_SLOT = "addressLines";

	/**
	 * Name for pre-defined Slot used in Organization and ClassificationScheme by JAXR UDDI provider.
	 */
	public static final String AUTHORIZED_NAME_SLOT = "authorizedName";

	/**
	 * Name for pre-defined Slot used in Organization and ClassificationScheme by JAXR UDDI provider.
	 */
	public static final String OPERATOR_SLOT = "operator";

}
