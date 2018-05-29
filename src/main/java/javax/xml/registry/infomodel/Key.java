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
 * Represents a unique key that identifies a RegistryObject. Must be a DCE 128 UUID.
 *
 * @see RegistryObject
 * @author Farrukh S. Najmi
 */
public interface Key {

	/**
	 * Returns the unique Id of this key.
	 * Default is a NULL String. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the id for this object
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public String getId() throws JAXRException;
	
	/**
	 * Sets the unique id associated with this key.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param id	the id being defined for this object
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public void setId(String id) throws JAXRException;
	
}
