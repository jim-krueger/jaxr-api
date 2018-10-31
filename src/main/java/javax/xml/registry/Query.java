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
 * The Query interface encapsulates a query in a declarative query language.
 * Currently a Query can be an SQL query or an ebXML Filter Query only.
 * In future support for other query languages such as XQL query may be added.
 * The query must conform to a fixed schema as defined by the JAXR specification.
 *
 * @author Farrukh S. Najmi
 */
public interface Query {

	/**
	 * An SQL query type.
	 */
	public static final int QUERY_TYPE_SQL=0;

	/**
	 * A W3C XQuery type.
	 */
	public static final int QUERY_TYPE_XQUERY=1;

	/**
	 * An OASIS ebXML Registry XML Filter Query type.
	 */
	public static final int QUERY_TYPE_EBXML_FILTER_QUERY=2;

    /**
	 * Gets the type of Query (for example, QUERY_TYPE_SQL).
	 *
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @see Query#QUERY_TYPE_SQL
	 * @see Query#QUERY_TYPE_XQUERY
	 * @see Query#QUERY_TYPE_EBXML_FILTER_QUERY
	 * @return the type of query
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public int getType() throws JAXRException;

	/**
	 * Returns the String representing the query. For example,
	 * in the case of an SQL query, returns the SQL query as a string.
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @return the String representation for this query
	 *
	 */
	public String toString();
}
