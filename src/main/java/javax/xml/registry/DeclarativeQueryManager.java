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
 * This interface provides the ability to execute declarative queries (e.g. SQL)
 *
 * @author Farrukh S. Najmi
 */
public interface DeclarativeQueryManager extends QueryManager {

	/**
	 * Creates a Query object given a queryType (for example, QUERY_TYPE_SQL) and a String
	 * that represents a query in the syntax appropriate for queryType.
	 *
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @see Query#QUERY_TYPE_SQL
	 * @see Query#QUERY_TYPE_XQUERY
	 * @see Query#QUERY_TYPE_EBXML_FILTER_QUERY
	 * @param queryType	the type of query
	 * @param queryString	the query in its string representation
	 * @return Query object created
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 * @throws InvalidRequestException	If the JAXR provider validates query syntax (optional) and the sqlQuery is not valid
	 *
	 */
	Query createQuery(int queryType, String queryString) throws InvalidRequestException, JAXRException;

	/**
	 * Executes a query as specified by query parameter.
	 *
	 * <DL><DT><B>Capability Level: 1 </B></DL>
	 *
	 * @param query	the query to be executed
	 * @return the BulkResponse that is the result of the query
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public BulkResponse executeQuery(Query query) throws JAXRException;


    /** @link dependency
     * @label processes*/
    /*#Query lnkQuery;*/
}
