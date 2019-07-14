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

import java.net.*;

import javax.xml.registry.*;

/**
 * ExtrinsicObjects provide metadata that describes submitted content whose
 * type is not intrinsically known to the registry and therefore must be
 * described by means of additional attributes (e.g., mime type).
 * <p>
 * Examples of content described by ExtrinsicObject include Collaboration
 * Protocol Profiles (CPP), business process descriptions, and schemas.
 *
 * @author Farrukh S. Najmi
 */
public interface ExtrinsicObject extends RegistryEntry {

    /**
     * Gets the mime type associated with this object.
	 * Default is a NULL String.
	 *
     *
     * <DL><DT><B>Capability Level: 1 </B></DL>
     *
	 * @return the mime type associated with this object
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    String getMimeType() throws JAXRException;

    /**
     * Sets the mime type associated with this object.
     *
     * <DL><DT><B>Capability Level: 1 </B></DL>
     *
	 * @param mimeType	the mime type associated with this object
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void setMimeType(String mimeType) throws JAXRException;

    /**
     * Determines whether the ExtrinsicObject is opaque (not readable) by the registry operator.
     * <p>
     * In some situations, a Submitting Organization may submit content that is encrypted and not even readable by the registry. This attribute allows the registry to know whether this is the case.
     *
     * <DL><DT><B>Capability Level: 1 </B></DL>
     *
	 * @return <code>true</code> if the ExtrinsicObject is readable by the registry operator; <code>false</code> otherwise
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    boolean isOpaque() throws JAXRException;

    /**
     * Sets whether the ExtrinsicObject is opaque (not readable) by the registry.
     *
     * <DL><DT><B>Capability Level: 1 </B></DL>
     *
	 * @param isOpaque	boolean value set to <code>true</code> if the ExtrinsicObject is readable by the registry operator; <code>false</code> otherwise
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void setOpaque(boolean isOpaque) throws JAXRException;

    /**
	 * Gets the repository item for this object.
	 * Must not return null.
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @return the DataHandler for the repository item
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    public javax.activation.DataHandler getRepositoryItem() throws JAXRException;

    /**
	 * Sets the repository item for this object.
	 *
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @param repositoryItem	the DataHandler for the repository item. Must not be null
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    public void setRepositoryItem(javax.activation.DataHandler repositoryItem) throws JAXRException;
}
