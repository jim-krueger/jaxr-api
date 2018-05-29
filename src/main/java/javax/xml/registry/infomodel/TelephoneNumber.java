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
 * A simple re-usable entity class that defines attributes of a telephone number.
 *
 * @author Farrukh S. Najmi 
 */
public interface TelephoneNumber {
    /**
     * Gets the country code. 
     * Default is an empty String.
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @return the country code
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getCountryCode() throws JAXRException;

    /**
     * Gets the area code. 
     * Default is an empty String.
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @return the area code
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getAreaCode() throws JAXRException;

    /**
     * Gets the telephone number suffix, not including the country or area code. 
     * Default is an empty String.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @return the telephone number
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getNumber() throws JAXRException;

    /**
     * Gets the internal extension.
     * Default is an empty String.
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @return the internal extension number
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getExtension() throws JAXRException;

    /**
     * Gets the URL that can dial this number electronically.
     * Default is a NULL String.
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @return the url
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getUrl() throws JAXRException;

    /**
     * The type of telephone number (for example, "fax"). Any String would do.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @return the type for this TelephoneNumber, which is an arbitrary String
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getType() throws JAXRException;

    /**
     * Sets country code.
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @param countryCode the country code
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setCountryCode(String countryCode) throws JAXRException;

    /**
     * Sets the area code. 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @param areaCode the area code
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setAreaCode(String areaCode) throws JAXRException;

    /**
     * Sets the telephone number suffix, not including the country or area code. 
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     * 
	 * @param number	the telephone number
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setNumber(String number) throws JAXRException;

    /**
     * Sets the internal extension. 
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     *
	 * @param extension	the internal extension number
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setExtension(String extension) throws JAXRException;

    /**
     * Sets the URL that can dial this number electronically.
     *
     * <p><DL><DT><B>Capability Level: 1 </B></DL> 	 
     * 
	 * @param url the URL string
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setUrl(String url) throws JAXRException;

    /**
     * Sets the type of telephone number (for example, "fax"). Any String will do.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @param type the type for this TelephoneNumber, which is an arbitrary String
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setType(String type) throws JAXRException;

}
