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
 * This interface represents a String that has been internationalized into several Locales.
 * This interface is used as a replacement for the String type whenever a String attribute needs to be I18N capable. An instance of the InternationalString interface composes within it a Collection of LocalizedString instances, where each String is specific to a particular Locale. The InternationalString interface provides set/get methods for adding or getting locale specific String values for the InternationalString instance.
 *
 *
 * @see LocalizedString
 * @author Farrukh S. Najmi
 */
public interface InternationalString {
	/**
	 * Gets the String value for the Locale returned by Locale.getDefault().
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the String value for the Locale returned by Locale.getDefault()
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    String getValue() throws JAXRException;

    /**
     * Gets the String value for the specified Locale. Return null if no locale specific
	 * value is found for the specified locale.
	 *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @param locale	The Locale for the desired value
	 * @return the String value for the specified Locale
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    String getValue(Locale locale) throws JAXRException;

    /**
     * Sets the String value for the Locale returned by Locale.getDefault().
	 *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @param value	the String value for the Locale returned by Locale.getDefault()
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setValue(String value) throws JAXRException;

    /**
     * Sets the String value for the specified Locale.
	 *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @param locale	The locale for this value being set
	 * @param value		The value being set
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setValue(Locale locale, String value) throws JAXRException;

    /**
	 * Adds a LocalizedString to this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param localizedString	the LocalizedString being added to this object
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void addLocalizedString(LocalizedString localizedString) throws JAXRException;

    /**
     *
     * Adds many LocalizedStrings to this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
	 * @param localizedStrings	the Collection of LocalizedStrings being added to this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void addLocalizedStrings(Collection localizedStrings) throws JAXRException;

    /**
	 * Removes a LocalizedString from this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param localizedString	the LocalizedString being removed from this object
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void removeLocalizedString(LocalizedString localizedString) throws JAXRException;

    /**
     * Removes specified LocalizedStrings to this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param localizedStrings	the Collection of LocalizedStrings being removed from this object
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void removeLocalizedStrings(Collection localizedStrings) throws JAXRException;

	/**
	 * Gets the LocalizedString for the specified Locale and charsetName.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param locale	The loacle for the desired LocalizedStrings
	 * @param charsetName	The character set name for the desired LocalizedStrings
	 * @return the LocalizedString that matches specified locale and character set
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	LocalizedString getLocalizedString(Locale locale, String charsetName) throws JAXRException;


    /**
     * Returns the LocalizedStrings associated with this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
     * @see javax.xml.registry.infomodel.LocalizedString
     * @return Collection of LocalizedString instances. The Collection may be empty but not null.
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    Collection getLocalizedStrings() throws JAXRException;

}
