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
import java.net.*;
import javax.xml.registry.*;

/**
 * The RegistryEntry interface is a base interface for interfaces in the model that require additional metadata beyond what is provided by the RegistryObject interface.
 * A few interfaces in the model represent high level (coarse grain) objects in the registry that require additional metadata such as version information and indication of the stability or volatility of the information.
 *
 *
 * @author Farrukh S. Najmi
 */
public interface RegistryEntry extends RegistryObject, Versionable {
    /**
	 * Gets the life cycle status of the RegistryEntry within the registry.
	 *
	 * <DL><DT><B>Capability Level: 1 </B><DD>This method must throw UnsupportedCapabilityException in lower capability levels.</DL>
	 *
	 * @see RegistryEntry#STATUS_SUBMITTED
	 *
	 * @return the life cycle status as an integer enumeration
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    int getStatus() throws JAXRException;

    /**
	 * Gets the stability indicator for the RegistryEntry within the Registry.
	 * The stability indicator is provided by the submitter as an indication
	 * of the level of stability for the content.
     *
     * <DL><DT><B>Capability Level: 1 </B><DD>This method must throw UnsupportedCapabilityException in lower capability levels.</DL>
     *
	 * @see RegistryEntry#STABILITY_DYNAMIC
	 * @return the stability indicator as an integer enumeration
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
     */
    int getStability() throws JAXRException;

	/**
	 * Sets the stability indicator for the RegistryEntry.
	 *
	 * <DL><DT><B>Capability Level: 1 </B><DD>This method must throw UnsupportedCapabilityException in lower capability levels.</DL>
	 *
	 * @param stability the stability indicator
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    void setStability(int stability) throws JAXRException;


	/**
	 * Gets expirationDate attribute of the RegistryEntry within the Registry.
	 * This attribute defines a time limit upon the stability indication
	 * provided by the stability attribute. Once the expirationDate has been
	 * reached the stability attribute in effect becomes STABILITY_DYNAMIC
	 * implying that content can change at any time and in any manner.
	 * A null value implies that there is no expiration on stability attribute.
	 *
	 * <DL><DT><B>Capability Level: 1 </B><DD>This method must throw UnsupportedCapabilityException in lower capability levels.</DL>
	 *
	 * @return the expiration Date for the stability indicator
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	Date getExpiration() throws JAXRException;

	/**
	 * Sets the expirationDate.
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @param expiration	the expiration Date for the stability indicator
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	void setExpiration(Date expiration) throws JAXRException;

	/** RegistryEntry has been submitted. */
	public static final int STATUS_SUBMITTED=0;

	/** RegistryEntry has been submitted and approved. */
	public static final int STATUS_APPROVED=1;

	/** RegistryEntry has been deprecated. */
	public static final int STATUS_DEPRECATED=2;

	/** RegistryEntry has been withdrawn by the submitter. */
	public static final int STATUS_WITHDRAWN=3;


	/** RegistryEntry may change at any time. */
	public static final int STABILITY_DYNAMIC=0;

	/** RegistryEntry may change at any time, however the changes will be backward compatible. */
	public static final int STABILITY_DYNAMIC_COMPATIBLE=1;

	/** RegistryEntry will not change. */
	public static final int STABILITY_STATIC=2;

}
