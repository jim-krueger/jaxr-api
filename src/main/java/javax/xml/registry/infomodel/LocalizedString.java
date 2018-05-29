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
import java.util.*;

/**
 * This interface is used as a simple wrapper interface that associates a String with its Locale. The interface is needed in the InternationalString interface where a Collection of LocalizedString instances are kept. Each LocalizedString instance has a Locale and a String instance. 
 *
 * @see InternationalString
 * @author Farrukh S. Najmi
 */
public interface LocalizedString {

	/**
	 * The default name returned by getCharsetName if no other 
	 * name has explicitly been set.
	 */
	public static final String DEFAULT_CHARSET_NAME = "UTF-8";

	/**
	 * Gets the canonical name for the charset for this object.
	 * Must return the default charset when there is no charset name defined.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @see LocalizedString#DEFAULT_CHARSET_NAME
	 * @return the character set name for the character set used by this object
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    String getCharsetName() throws JAXRException;

	/**
	 * Get the Locale for this object.
	 * Must return the default Locale when no Locale has been defined.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @see java.util.Locale#getDefault() 
	 * @return the Locale used by this object
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    Locale getLocale() throws JAXRException;
	
    /**
     * Get the String value for this object.
	 *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @return the value defined by this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    String getValue() throws JAXRException;

    /**
     * Set the canonical name for the charset for this object.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param charsetName	the character set name for the character set used by this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setCharsetName(String charsetName) throws JAXRException;

    /**
     * Set the Locale for this object.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param locale 	the Locale used by this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setLocale(Locale locale) throws JAXRException;

    /**
     * Set the String value for the specified object.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param value	the value defined by this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setValue(String value) throws JAXRException;		
	
}
