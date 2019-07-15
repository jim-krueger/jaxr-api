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

package javax.xml.registry;

import java.util.*;

import javax.xml.registry.infomodel.*;

/**
 * The BusinessQueryManager interface, which is exposed by the Registry Service, implements the business style query interface. It is also
 * referred to as the focused query interface.
 *
 * @see DeclarativeQueryManager
 * @see FindQualifier
 * @see BulkResponse
 *
 * @author Farrukh S. Najmi
 */
public interface BusinessQueryManager extends QueryManager {

	/**
	 * Finds all Association objects that match all of the criteria specified by the parameters of this call.
	 * This is a logical AND operation between all non-null parameters. If
	 * no parameters are specified, no Associations are returned.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param findQualifiers a Collection of find qualifiers as defined by
	 * the FindQualifier interface, which specifies qualifiers that affect
	 * string matching, sorting, boolean predicate logic, and the like.
	 * @param sourceObjectId a String that represents the id for a RegistryObject that must be the sourceObject of the Associations that match. This parameter is ignored if specified as null.
	 * @param targetObjectId a String that represents the id for a RegistryObject that must be the targetObject of the Associations that match. This parameter is ignored if specified as null.
	 * @param associationTypes a Collection of associationTypes. This is a logical OR operation across the collection. This parameter is ignored if specified as null.
	 *
	 * @return a BulkResponse containing a Collection of Associations
         *
         * @throws JAXRException if the Jakarta XML Registries provider encounters an internal error
	 */
	BulkResponse findAssociations(
		Collection findQualifiers,
		String sourceObjectId,
		String targetObjectId,
		Collection associationTypes
	) throws JAXRException;

	/**
	 * Finds all Association objects owned by the caller that match all of the criteria specified by the parameters of this call.
	 * This is a logical AND operation between all non-null parameters. If
	 * no parameters are specified, no Associations are returned.
	 *
	 * <p>
	 * This call is sensitive to the identity of the caller and is a privileged operation that requires
	 * the caller to have provided its identity credentials to the Connection associated with this object.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param findQualifiers a Collection of find qualifiers as defined by
	 * the FindQualifier interface, which specifies qualifiers that affect
	 * string matching, sorting, boolean predicate logic, and the like.
	 * @param confirmedByCaller If true, provider must include Associations involving the caller that have been confirmed by the caller. If false, provider must include Associations involving the caller that have not been confirmed by the caller. This parameter is ignored if specified as null.
	 * @param confirmedByOtherParty If true, provider must include Associations involving the caller that have been confirmed by the other party. If false, provider must include Associations involving the caller that have not been confirmed by the other party. This parameter is ignored if specified as null.
	 * @param associationTypes a Collection of associationTypes. This is a logical OR operation across the collection. This parameter is ignored if specified as null.
	 *
	 * @return a BulkResponse containing a Collection of Associations
         *
         * @throws JAXRException if the Jakarta XML Registries provider encounters an internal error
	 */
	BulkResponse findCallerAssociations(
		Collection findQualifiers,
		Boolean confirmedByCaller,
		Boolean confirmedByOtherParty,
		Collection associationTypes
	) throws JAXRException;

	/**
	 * Finds all Organization objects that match all of the criteria specified by the parameters of this call.
	 * This is a logical AND operation between all non-null parameters.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param findQualifiers a Collection of find qualifiers as defined by
	 * the FindQualifier interface, which specifies qualifiers that affect
	 * string matching, sorting, boolean predicate logic, and the like.
	 *
	 * @param namePatterns a Collection that may consist of either String
	 * or LocalizedString objects. Each String or value within a
	 * LocalizedString is a partial or full name pattern with wildcard
	 * searching as specified by the SQL-92 LIKE specification. Unless
	 * otherwise specified in findQualifiers, this is a logical OR, and a
	 * match on any name qualifies as a match for this criterion.
	 *
         * @param classifications a Collection of Classification objects that
         * classify the object. It is analogous to a catgegoryBag in the UDDI
         * specification. Unless otherwise specified in findQualifiers, this is
         * a logical AND, and a match on all specified Classifications qualifies
         * as a match for this criterion. The programmer may use the
         * LifeCycleManager.createClassification method to create a transient
         * Classification for use in this Collection.
         *
         * @param specifications a Collection of RegistryObjects that represent
         * (proxy) a technical specification. It is analogous to a tModelBag in
         * the UDDI specification. In the case of a UDDI provider, the
         * RegistryObject is a specification Concept. In the case of an ebXML
         * provider, the RegistryObject is likely to be an ExtrinsicObject.
         * Unless otherwise specified in findQualifiers, this is a logical AND,
         * and a match on all specified Specifications qualifies as a match
         * for this criterion.
         *
         * @param externalIdentifiers a Collection of ExternalIdentifier objects
         * that provide an external identifier for the object using an
         * identification scheme such as DUNS. It is analogous to an
         * identifierBag in the UDDI specification. Unless otherwise specified
         * in findQualifiers, this is a logical AND, and a match on all
         * specified ExternalIdentifiers qualifies as a match for this
         * criterion. The programmer may use the
         * LifeCycleManager.createExternalIdentifier method to create a
         * transient ExternalIdentifier for use in this Collection.
         *
         * @param externalLinks a Collection of ExternalLink objects that link
         * the object to content outside the registry. It is analogous to an
         * overviewDoc in the UDDI specification. Unless otherwise specified in
         * findQualifiers, this is a logical AND, and a match on all specified
         * ExternalLinks qualifies as a match for this criterion.
         *
	 * @return a BulkResponse containing a Collection of Organizations
         *
         * @throws JAXRException if the Jakarta XML Registries provider encounters an internal error
	 */
	BulkResponse findOrganizations(
		Collection findQualifiers,
		Collection namePatterns,
		Collection classifications,
		Collection specifications,
		Collection externalIdentifiers,
		Collection externalLinks
	) throws JAXRException;

	/**
	 * Finds all Service objects that match all of the criteria specified by the parameters of this call.
	 * This is a logical AND operation between all non-null parameters.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param orgKey Key identifying an Organization. Required for UDDI providers.
	 *
	 * @param findQualifiers a Collection of find qualifiers as defined by
	 * the FindQualifier interface, which specifies qualifiers that affect
	 * string matching, sorting, boolean predicate logic, and the like.
	 *
	 * @param namePatterns a Collection that may consist of either String
	 * or LocalizedString objects. Each String or value within a
	 * LocalizedString is a partial or full name pattern with wildcard
	 * searching as specified by the SQL-92 LIKE specification. Unless
	 * otherwise specified in findQualifiers, this is a logical OR, and a
	 * match on any name qualifies as a match for this criterion.
	 *
         * @param classifications a Collection of Classification objects that
         * classify the object. It is analogous to a catgegoryBag in the UDDI
         * specification. Unless otherwise specified in findQualifiers, this is
         * a logical AND, and a match on all specified Classifications qualifies
         * as a match for this criterion. The programmer may use the
         * LifeCycleManager.createClassification method to create a transient
         * Classification for use in this Collection.
         *
         * @param specifications a Collection of RegistryObjects that represent
         * (proxy) a technical specification. It is analogous to a tModelBag in
         * the UDDI specification. In the case of a UDDI provider, the
         * RegistryObject is a specification Concept. In the case of an ebXML
         * provider, the RegistryObject is likely to be an ExtrinsicObject.
         * Unless otherwise specified in findQualifiers, this is a logical AND,
         * and a match on all specified Specifications qualifies as a match
         * for this criterion.
         *
	 * @return a BulkResponse containing a Collection of Services
	 *
         * @throws JAXRException if the Jakarta XML Registries provider encounters an internal error
	 */
	BulkResponse findServices(Key orgKey,
		Collection findQualifiers,
		Collection namePatterns,
		Collection classifications,
		Collection specifications
	) throws JAXRException;



	/**
	 * Finds all ServiceBinding objects that match all of the criteria specified by the parameters of this call.
	 * This is a logical AND operation between all non-null parameters.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param serviceKey Key identifying a Service. Required for UDDI providers.
	 *
	 * @param findQualifiers a Collection of find qualifiers as defined by
	 * the FindQualifier interface, which specifies qualifiers that affect
	 * string matching, sorting, boolean predicate logic, and the like.
	 *
         * @param classifications a Collection of Classification objects that
         * classify the object. It is analogous to a catgegoryBag in the UDDI
         * specification. Unless otherwise specified in findQualifiers, this is
         * a logical AND, and a match on all specified Classifications qualifies
         * as a match for this criterion. The programmer may use the
         * LifeCycleManager.createClassification method to create a transient
         * Classification for use in this Collection.
         *
         * @param specifications a Collection of RegistryObjects that represent
         * (proxy) a technical specification. It is analogous to a tModelBag in
         * the UDDI specification. In the case of a UDDI provider, the
         * RegistryObject is a specification Concept. In the case of an ebXML
         * provider, the RegistryObject is likely to be an ExtrinsicObject.
         * Unless otherwise specified in findQualifiers, this is a logical AND,
         * and a match on all specified Specifications qualifies as a match
         * for this criterion.
	 *
	 * @return a BulkResponse containing a Collection of ServiceBindings
	 *
         * @throws JAXRException if the Jakarta XML Registries provider encounters an internal error
	 */
	BulkResponse findServiceBindings(
		Key serviceKey,
		Collection findQualifiers,
		Collection classifications,
		Collection specifications
	) throws JAXRException;

	/**
	 * Finds all ClassificationScheme objects that match all of the criteria specified by the parameters of this call.
	 * This is a logical AND operation between all non-null parameters.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param findQualifiers a Collection of find qualifiers as defined by
	 * the FindQualifier interface, which specifies qualifiers that affect
	 * string matching, sorting, boolean predicate logic, and the like.
	 *
	 * @param namePatterns a Collection that may consist of either String
	 * or LocalizedString objects. Each String or value within a
	 * LocalizedString is a partial or full name pattern with wildcard
	 * searching as specified by the SQL-92 LIKE specification. Unless
	 * otherwise specified in findQualifiers, this is a logical OR, and a
	 * match on any name qualifies as a match for this criterion.
	 *
         * @param classifications a Collection of Classification objects that
         * classify the object. It is analogous to a catgegoryBag in the UDDI
         * specification. Unless otherwise specified in findQualifiers, this is
         * a logical AND, and a match on all specified Classifications qualifies
         * as a match for this criterion. The programmer may use the
         * LifeCycleManager.createClassification method to create a transient
         * Classification for use in this Collection.
         *
         * @param externalLinks a Collection of ExternalLink objects that link
         * the object to content outside the registry. It is analogous to an
         * overviewDoc in the UDDI specification. Unless otherwise specified in
         * findQualifiers, this is a logical AND, and a match on all specified
         * ExternalLinks qualifies as a match for this criterion.
	 *
	 * @return a BulkResponse containing a Collection of ClassificationSchemes
	 *
         * @throws JAXRException if the Jakarta XML Registries provider encounters an internal error
	 */
	BulkResponse findClassificationSchemes(
		Collection findQualifiers,
		Collection namePatterns,
		Collection classifications,
		Collection externalLinks
	) throws JAXRException;

	/**
	 * Finds a ClassificationScheme by name based on the specified find
	 * qualifiers and name pattern.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param findQualifiers a Collection of find qualifiers as defined by
	 * the FindQualifier interface, which specifies qualifiers that affect
	 * string matching, sorting, boolean predicate logic, and the like.
	 *
	 * @param namePattern a String that is a partial or full
	 * name pattern with wildcard searching as specified by the SQL-92 LIKE
	 * specification
	 *
	 * @return the ClassificationScheme matching the namePattern, or null
	 * if no match is found.
	 *
         * @throws JAXRException if the Jakarta XML Registries provider encounters an internal
         * error.  Throws an InvalidRequestException if multiple matches are
         * found.
	 *
	 */
	ClassificationScheme findClassificationSchemeByName(Collection findQualifiers, String namePattern) throws JAXRException;

	/**
	 * Finds all Concept objects that match all of the criteria specified by the parameters of this call.
	 * This is a logical AND operation between all non-null parameters.
	 *
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param findQualifiers a Collection of find qualifiers as defined by
	 * the FindQualifier interface, which specifies qualifiers that affect
	 * string matching, sorting, boolean predicate logic, and the like.
	 *
	 * @param namePatterns a Collection that may consist of either String
	 * or LocalizedString objects. Each String or value within a
	 * LocalizedString is a partial or full name pattern with wildcard
	 * searching as specified by the SQL-92 LIKE specification. Unless
	 * otherwise specified in findQualifiers, this is a logical OR, and a
	 * match on any name qualifies as a match for this criterion.
	 *
         * @param classifications a Collection of Classification objects that
         * classify the object. It is analogous to a catgegoryBag in the UDDI
         * specification. Unless otherwise specified in findQualifiers, this is
         * a logical AND, and a match on all specified Classifications qualifies
         * as a match for this criterion. The programmer may use the
         * LifeCycleManager.createClassification method to create a transient
         * Classification for use in this Collection.
         *
         * @param externalIdentifiers a Collection of ExternalIdentifier objects
         * that provide an external identifier for the object using an
         * identification scheme such as DUNS. It is analogous to an
         * identifierBag in the UDDI specification. Unless otherwise specified
         * in findQualifiers, this is a logical AND, and a match on all
         * specified ExternalIdentifiers qualifies as a match for this
         * criterion. The programmer may use the
         * LifeCycleManager.createExternalIdentifier method to create a
         * transient ExternalIdentifier for use in this Collection.
         *
         * @param externalLinks a Collection of ExternalLink objects that link
         * the object to content outside the registry. It is analogous to an
         * overviewDoc in the UDDI specification. Unless otherwise specified in
         * findQualifiers, this is a logical AND, and a match on all specified
         * ExternalLinks qualifies as a match for this criterion.
	 *
	 * @return a BulkResponse containing a Collection of Concepts
	 *
         * @throws JAXRException if the Jakarta XML Registries provider encounters an internal error
	 */
	BulkResponse findConcepts(
		Collection findQualifiers,
		Collection namePatterns,
		Collection classifications,
		Collection externalIdentifiers,
		Collection externalLinks
	) throws JAXRException;

	/**
	 * Finds a Concept based on the path specified.
	 * If the specified path matches more than one Concept,
	 * the one that is most general (higher in the concept hierarchy) is returned.
	 *
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @param path a canonical path expression, as defined in the Jakarta XML Registries specification, that identifies the Concept.
	 *
	 * @return the Concept found, or null if no match is found
	 *
         * @throws JAXRException if the Jakarta XML Registries provider encounters an internal error
	 */
	Concept findConceptByPath(String path) throws JAXRException;

	/**
	 * Finds all RegistryPackage objects that match all of the criteria specified by the parameters of this call.
	 * This is a logical AND operation between all non-null parameters.
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 *
	 * @param findQualifiers a Collection of find qualifiers as defined by
	 * the FindQualifier interface, which specifies qualifiers that affect
	 * string matching, sorting, boolean predicate logic, and the like.
	 *
	 * @param namePatterns a Collection that may consist of either String
	 * or LocalizedString objects. Each String or value within a
	 * LocalizedString is a partial or full name pattern with wildcard
	 * searching as specified by the SQL-92 LIKE specification. Unless
	 * otherwise specified in findQualifiers, this is a logical OR, and a
	 * match on any name qualifies as a match for this criterion.
	 *
         * @param classifications a Collection of Classification objects that
         * classify the object. It is analogous to a catgegoryBag in the UDDI
         * specification. Unless otherwise specified in findQualifiers, this is
         * a logical AND, and a match on all specified Classifications qualifies
         * as a match for this criterion. The programmer may use the
         * LifeCycleManager.createClassification method to create a transient
         * Classification for use in this Collection.
         *
         * @param externalLinks a Collection of ExternalLink objects that link
         * the object to content outside the registry. It is analogous to an
         * overviewDoc in the UDDI specification. Unless otherwise specified in
         * findQualifiers, this is a logical AND, and a match on all specified
         * ExternalLinks qualifies as a match for this criterion.
	 *
	 * @return a BulkResponse containing a Collection of RegistryPackages
	 *
         * @throws JAXRException if the Jakarta XML Registries provider encounters an internal error
	 */
	BulkResponse findRegistryPackages(
		Collection findQualifiers,
		Collection namePatterns,
		Collection classifications,
		Collection externalLinks
	) throws JAXRException;

    /** @link dependency
     * @label uses*/
    /*#FindQualifier lnkFindQualifier;*/

}
