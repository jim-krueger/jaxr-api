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


/**
 * FindQualifier provides various constants
 * that identify options that effect find method behavior.
 * A JAXR provider may silently ignore any qualifiers marked as optional.
 * A JAXR provider must support qualifiers not marked optional.
 *
 * @see BusinessQueryManager
 */
public interface FindQualifier {

	//Based on UDDI V1.0 API
	
        /**
         * Specifies a hint to queries that they should use exact (case-insensitive) match when comparing String values.
         */
	public static final String EXACT_NAME_MATCH = "exactNameMatch";

        /**
         * Specifies a hint to queries that they should case-sensitive match when comparing String values.
         */
        public static final String CASE_SENSITIVE_MATCH = "caseSensitiveMatch";

        /**
         * Specifies a hint to queries that they should sort results by Name in ascending alpha-numeric order.
         */
	public static final String SORT_BY_NAME_ASC  = "sortByNameAsc";

        /**
         * Specifies a hint to queries that they should sort results by Name in descending alpha-numeric order.
         */
	public static final String SORT_BY_NAME_DESC = "sortByNameDesc";

        /**
         * Specifies a hint to queries that they should sort results by creation/modification date in ascending order.
         */
        public static final String SORT_BY_DATE_ASC  = "sortByDateAsc";

        /**
         * Specifies a hint to queries that they should sort results by creation/modification date in descending order.
         */
	public static final String SORT_BY_DATE_DESC = "sortByDateDesc";
	
        /**
         * Specifies a hint to queries that when multiple taxonomy values from the same ClassificationScheme are specified 
         * in the Classifications for the query then the candidate set of objects matching the query should include
         * any object that is classified by any one of the taxonomy values. For example, if a query includes Classifications with 
         * both Japan and Korea taxonomy values under the geography ClassificationScheme, then it should match objects that are 
         * classified by either Japan or Korea ClassificationNodes.
         */
	public static final String OR_LIKE_KEYS = "orLikeKeys";

        /**
         * Specifies a hint to queries that the candidate set of objects matching the query should include
         * any object that is classified by any one of the taxonomy values specified in any of the Classification for the query. 
         */
        public static final String OR_ALL_KEYS = "orAllKeys";

	/** Maps to UDDI combineCategoryBags. Required for JAXR UDDI providers, optional for all others. */
	public static final String COMBINE_CLASSIFICATIONS  = "combineClassifications";

	/** Maps to UDDI serviceSubset. Required for JAXR UDDI providers, optional for all others. */
	public static final String SERVICE_SUBSET = "serviceSubset";

	public static final String AND_ALL_KEYS  = "andAllKeys";

	/** Optional qualifier that allows matching strings by their sounds. */
	public static final String SOUNDEX = "soundex";
}
