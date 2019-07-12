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
 * PostalAddress is a simple re-usable entity class that defines attributes of a postal Address.
 *
 * @author Farrukh S. Najmi
 */
public interface PostalAddress extends ExtensibleObject  {
	/**
	 * Returns the street name.
	 * Default is an empty String.
	 *
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the street name
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getStreet() throws JAXRException;

	/**
	 * Sets the street name.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param street the street name
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setStreet(String street) throws JAXRException;

	/**
	 * Returns the street number.
	 * Default is an empty String.
	 *
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the street number
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getStreetNumber() throws JAXRException;

	/**
	 * Sets the street number.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param streetNumber the street number
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setStreetNumber(String streetNumber) throws JAXRException;

	/**
	 * Returns the city.
	 * Default is an empty String.
	 *
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the city
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getCity() throws JAXRException;

	/**
	 * Sets the city.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param city the city
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setCity(String city) throws JAXRException;

	/**
	 * Returns the state or province.
	 * Default is an empty String.
	 *
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the state or province
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getStateOrProvince() throws JAXRException;

	/**
	 * Sets the state or province.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param stateOrProvince	the state or province
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setStateOrProvince(String stateOrProvince) throws JAXRException;

	/**
	 * Returns the postal or zip code.
	 * Default is an empty String.
	 *
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the postal code (e.g. US zip code)
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getPostalCode() throws JAXRException;

	/**
	 * Sets the postal or zip code.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param postalCode the postal code (e.g. US zip code)
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public void setPostalCode(String postalCode) throws JAXRException;

	/**
	 * Returns the country.
	 * Default is an empty String.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the country
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public String getCountry() throws JAXRException;

    /**
	 * Sets the country.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param country	the country
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public void setCountry(String country) throws JAXRException;

    /**
     * Returns the type of address (for example, "headquarters") as a String.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @return the type for this PostalAddress. This is an arbitrary String (e.g. "Home", "Office")
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public String getType() throws JAXRException;

    /**
     * Sets the type of address (for example, "headquarters") as a String.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param type	the type for this PostalAddress. This is an arbitrary String (e.g. "Home", "Office")
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    public void setType(String type) throws JAXRException;

    /**
	 * Sets a user-defined postal scheme for codifying the attributes of PostalAddress.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param scheme	the user defined postal scheme.
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public void setPostalScheme(ClassificationScheme scheme)  throws JAXRException;

    /**
	 * Returns a user-defined postal scheme for codifying the attributes of PostalAddress.
	 * If none is defined for this object, then must return the default value
	 * returned by RegistryService#getDefaultPostalScheme()
	 *
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @see javax.xml.registry.RegistryService#getDefaultPostalScheme()
	 * @return the user defined postal scheme.
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    public ClassificationScheme getPostalScheme()  throws JAXRException;

}
