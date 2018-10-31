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
import java.util.*;
import javax.xml.registry.*;

/**
 *
 * ExternalLink instances model a named URI to content that may reside outside
 * the registry.
 * RegistryObject may be associated with any number of ExternalLinks to annotate
 * a RegistryObject with external links to external content.
 * <p>
 * Consider the case where a Submitting Organization submits a repository item
 * (e.g. a DTD) and wants to associate some external content to that object
 * (e.g. the Submitting Organization's home page). The ExternalLink enables this
 * capability.
 *
 * @see RegistryObject
 * @author Farrukh S. Najmi
 */
public interface ExternalLink extends RegistryObject, URIValidator {

    /**
     * Gets the collection of RegistryObjects that are annotated by this
     * ExternalLink.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @return Collection of RegistryObjects. Return an empty Collection if no RegistryObjects
     * are annotated by this object.
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    Collection getLinkedObjects() throws JAXRException;

    /**
     * Gets URI to the an external resource.
     * Default is a NULL String.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @return	the URI String for this object (e.g. "http://java.sun.com")
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    String getExternalURI() throws JAXRException;

    /**
     * Sets URI for an external resource.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param uri	the URI String for this object (e.g. "http://java.sun.com")
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setExternalURI(String uri) throws JAXRException;
}
