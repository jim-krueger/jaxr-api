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
 * The Concept interface is used to represent taxonomy elements and their structural relationship with each other in order to describe an internal taxonomy.
 * Concept instances are used to define tree structures where the root of the tree is a ClassificationScheme instance and each node in the tree is a Concept instance. Two Concepts may be defined as being equivalent.
 * <p>Figure 1 shows how Concept instances are used to represent taxonomy elements and their structural relationship with each other in order to describe an internal taxonomy.
 * <p>
 * <center>
 * <img SRC="{@docRoot}/resources/images/schemeInstance.gif" ALT="Using Concepts to Represent Taxonomy Elements">
 * <br><b>Figure 1. Using Concepts to Represent Taxonomy Elements</b>
 * </center>
 *
 *
 * @see RegistryObject
 * @see Classification
 * @see ClassificationScheme
 * @author Farrukh S. Najmi
 */
public interface Concept extends RegistryObject {


	/**
	 * Gets the value (usually a code in a taxonomy) associated with this Concept.
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return	the value (usually a taxonomy value) associated with this Concept
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	String getValue() throws JAXRException;	

    /**
     * Sets the value (usually a taxonomy value) associated with this Concept.
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
	 * @param value	the value (usually a taxonomy value) associated with this Concept
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    void setValue(String value) throws JAXRException;	
	
    /** 
	 * Adds a child Concept. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param concept	the concept being added as a child of this object 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void addChildConcept(Concept concept) throws JAXRException;

    /** 
	 * Adds a Collection of Concept children. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param concepts	the Collection of Concepts being added as a children of this object 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void addChildConcepts(Collection concepts) throws JAXRException;

    /** 
	 * Removes a child Concept. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param concept	the concept being removed as a child Concept of this object 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void removeChildConcept(Concept concept) throws JAXRException;

    /** 
	 * Removes a Collection of children Concepts. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @param concepts	the Collection of Concepts being removed as children Concepts of this object 
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    void removeChildConcepts(Collection concepts) throws JAXRException;

    /** 
	 * Gets number of children. 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the number of children Concepts
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    int getChildConceptCount() throws JAXRException;

    /** 
     * Gets all immediate children Concepts. 	 
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @see javax.xml.registry.infomodel.Concept
     * @return Collection of Concept instances. The Collection may be empty but not null.	 
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    Collection getChildrenConcepts() throws JAXRException;
    
    /** 
     * Gets all descendant Concepts. 	 
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @see javax.xml.registry.infomodel.Concept
     * @return Collection of Concept instances. The Collection may be empty but not null.	 
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     *
     */
    Collection getDescendantConcepts() throws JAXRException;
	
    /** 
	 * Gets the parent Concept or null if parent is a ClassificationScheme.  
	 * 
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 *
	 * @return the Concept that is the parent of this object
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 * @label parent
	 * @directed
	 * @supplierCardinality 0..1
	 * @associates <{javax.xml.registry.infomodel.Concept}>
	 */
    Concept getParentConcept()  throws JAXRException;

    /** 
     * Gets the ClassificationScheme that this Concept is a descendent of.
     *
     *
     * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
     *
     * @return the ClassificationScheme that is the ancestor of this object. May return null
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     * @label classificationScheme
     * @directed
     * @supplierCardinality 0..1
     * @associates <{javax.xml.registry.infomodel.ClassificationScheme}>
     */
    ClassificationScheme getClassificationScheme()  throws JAXRException;	
		

	/** 
	 * Gets the canonical path representation for this Concept.
	 *
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the canonical path String representing this object
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	String getPath() throws JAXRException;

	/** 
	 * Gets the parent Concept or ClassificationScheme for this object.
	 *
	 *
	 * <p><DL><DT><B>Capability Level: 0 </B></DL> 	 
	 *
	 * @return the parent Concept or ClassificationScheme for this object
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	RegistryObject getParent() throws JAXRException;
}
