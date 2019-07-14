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

import java.io.*;
import java.net.*;
import javax.xml.registry.*;
import java.util.*;

/**
 * The RegistryObject class is an abstract base class used by most classes in the model. It provides minimal metadata for registry objects. It also provides methods for accessing related objects that provide additional dynamic metadata for the registry object.
 *
 * @see RegistryEntry
 * @author Farrukh S. Najmi
 */
public interface RegistryObject extends ExtensibleObject  {
    /**
	 * Gets the key representing the universally unique ID (UUID) for this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the Key for this object
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    Key getKey() throws JAXRException;

    /**
	 * Gets the textual description for this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the description for this object which must not be null
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    InternationalString getDescription() throws JAXRException;

    /**
	 * Sets the context independent textual description for this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param description the description for this object
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    void setDescription(InternationalString description) throws JAXRException;

    /**
     * @associates <{AccessControlPolicy}>
     * @supplierCardinality 1
     */
    //AccessControlPolicy getAccessControlPolicy() throws JAXRException;

    /**
	 * Gets the user-friendly name of this object.
	 *
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the name for this object which must not be null.
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    InternationalString getName() throws JAXRException;


    /**
	 * Sets user-friendly name of object in repository.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param name	the name for this object
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
    void setName(InternationalString name) throws JAXRException;

	/**
	 * Sets the key representing the universally unique ID (UUID) for this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param key the key for this object
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	void setKey(Key key) throws JAXRException;

	/**
	 * Returns a registry provider specific XML representation of this Object.
	 * This may be used as a last resort back door way to get to a provider specific
	 * information element that is not accessible via the API.
	 * Implementation may choose to throw a UnsupportedCapabilityException.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the String containing the XML representation for this object
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	String toXML() throws JAXRException;

	/**
	 * Adds specified Classification to this object.
	 * Silently replaces the classifiedObject in Classification with reference to this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param classification	the Classification being added
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	void addClassification(Classification classification) throws JAXRException;

	/**
	 * Adds specified Classifications to this object.
	 * Silently replaces the classifiedObject in Classifications with reference to this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param classifications	the Collection of Classifications being added
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	void addClassifications(Collection classifications) throws JAXRException;

	/**
	 * Removes specified Classification from this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param classification	the Classification being removed
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	void removeClassification(Classification classification) throws JAXRException;

	/**
	 * Removes specified Classifications from this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param classifications	the Collection of Classifications being removed
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	void removeClassifications(Collection classifications) throws JAXRException;

	/**
	 * Replaces all previous Classifications with specified
	 * Classifications.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param classifications	the Collection of Classifications being set
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	void setClassifications(Collection classifications) throws JAXRException;

	/**
	 * Gets the Classification instances that classify this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
     * @see javax.xml.registry.infomodel.Classification
     * @return Collection of Classification instances. The Collection may be empty but not null.
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     *
	 */
	Collection getClassifications() throws JAXRException;

    /**
     * Returns the complete audit trail of all requests that effected a state change in this  object as an ordered Collection
     * of AuditableEvent objects.
     *
     * <DL><DT><B>Capability Level: 1 </B><DD>This method must throw UnsupportedCapabilityException in lower capability levels.</DL>
     *
     * @see javax.xml.registry.infomodel.AuditableEvent
     * @return Collection of AuditableEvent instances. The Collection may be empty but not null.
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     *
     */
    Collection getAuditTrail() throws JAXRException;

    /**
     * Adds specified Association to use this object as source.
	 * Silently replaces the sourceObject in Association with reference to this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param association	the Association being added
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void addAssociation(Association association) throws JAXRException;

    /**
     * Adds specified Associations to use this object as source.
     * Silently replaces the sourceObject in Associations with reference to this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param associations	the Collection of Associations being added
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void addAssociations(Collection associations) throws JAXRException;

    /**
     * Removes specified Association from this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param association	the Association being removed
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void removeAssociation(Association association) throws JAXRException;

    /**
     * Removes specified Associations from this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param associations	the Collection of Associations being removed
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void removeAssociations(Collection associations) throws JAXRException;

    /**
     * Replaces all previous Associations from this object with
	 * specified Associations.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param associations	the Collection of Associations being set
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void setAssociations(Collection associations) throws JAXRException;

    /**
     * Gets all Associations where this object is source.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @see javax.xml.registry.infomodel.Association
     * @return Collection of Association instances. The Collection may be empty but not null.
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     *
     */
    Collection getAssociations() throws JAXRException;

    /**
     * Returns the collection of RegistryObject instances associated with this object.
	 *
	 * <DL><DT><B>Capability Level: 1 </B><DD>This method must throw UnsupportedCapabilityException in lower capability levels.</DL>
	 *
     * @see javax.xml.registry.infomodel.RegistryObject
     * @return Collection of RegistryObject instances. The Collection may be empty but not null.
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    Collection getAssociatedObjects() throws JAXRException;

    /**
     * Adds specified ExternalIdentifier as an external identifier to this object.
     * Silently replaces the registryObject in ExternalIdentifier with reference to this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param externalIdentifier	the ExternalIdentifier being added
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void addExternalIdentifier(ExternalIdentifier externalIdentifier) throws JAXRException;

    /**
     * Adds specified ExternalIdentifiers as an external identifiers to this object.
     * Silently replaces the registryObject in ExternalIdentifiers with reference to this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param externalIdentifiers	the Collection of ExternalIdentifiers being added
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void addExternalIdentifiers(Collection externalIdentifiers) throws JAXRException;

    /**
     * Removes specified ExternalIdentifier as an external identifier from this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param externalIdentifier	the ExternalIdentifier being removed
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void removeExternalIdentifier(ExternalIdentifier externalIdentifier) throws JAXRException;

    /**
     * Removes specified ExternalIdentifiers as an external identifiers from this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param externalIdentifiers	the Collection of ExternalIdentifiers being removed
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void removeExternalIdentifiers(Collection externalIdentifiers) throws JAXRException;

    /**
     * Replaces all previous external identifiers with specified
     * Collection of ExternalIdentifiers as an external identifier.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param externalIdentifiers	the Collection of ExternalIdentifiers being set
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void setExternalIdentifiers(Collection externalIdentifiers) throws JAXRException;

    /**
     * Returns the ExternalIdentifiers associated with this object
     * that are external identifiers for this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @see javax.xml.registry.infomodel.ExternalIdentifier
     * @return Collection of ExternalIdentifier instances. The Collection may be empty but not null.
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    Collection getExternalIdentifiers() throws JAXRException;

    /**
     * Adds specified ExternalLink to this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param externalLink	the ExternalLink being added
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void addExternalLink(ExternalLink externalLink) throws JAXRException;

    /**
     * Adds specified ExternalLinks to this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param externalLinks	the Collection of ExternalLinks being added
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void addExternalLinks(Collection externalLinks) throws JAXRException;

    /**
     * Removes specified ExternalLink from this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param externalLink	the ExternalLink being removed
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void removeExternalLink(ExternalLink externalLink) throws JAXRException;

    /**
     * Removes specified ExternalLinks from this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param externalLinks	the Collection of ExternalLinks being removed
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void removeExternalLinks(Collection externalLinks) throws JAXRException;

    /**
     * Replaces all previous ExternalLinks with specified
     * ExternalLinks.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @param externalLinks	the Collection of ExternalLinks being set
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    void setExternalLinks(Collection externalLinks) throws JAXRException;

    /**
     * Returns the ExternalLinks associated with this object.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @see javax.xml.registry.infomodel.ExternalLink
     * @return Collection of ExternalLink instances. The Collection may be empty but not null.
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    Collection getExternalLinks() throws JAXRException;

    /**
     * Gets the object type that best describes the RegistryObject.
     *
     * <DL><DT><B>Capability Level: 1 </B><DD>This method must throw UnsupportedCapabilityException in lower capability levels.</DL>
     *
     * @return the object type as a Concept within the pre-defined ClassificationScheme named ObjectType
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    Concept getObjectType() throws JAXRException;

	/**
	 * Gets the Organization that submitted this RegistryObject.
	 *
	 * @return the Organization that submitted this object to the registry
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	Organization getSubmittingOrganization() throws JAXRException;

    /**
     * Returns the Package associated with this object.
     *
     * <DL><DT><B>Capability Level: 1 </B><DD>This method must throw UnsupportedCapabilityException in lower capability levels.</DL>
     *
     * @see javax.xml.registry.infomodel.RegistryPackage
     * @return Collection of RegistryPackage instances. The Collection may be empty but not null.
     * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
     *
     */
    Collection getRegistryPackages() throws JAXRException;

	/**
	 * Returns the LifeCycleManager that created this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return the LifeCycleManager objet that created this object
	 * @throws JAXRException	If the Jakarta XML Registries provider encounters an internal error
	 *
	 */
	LifeCycleManager getLifeCycleManager() throws JAXRException;

}
