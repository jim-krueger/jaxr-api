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
 * Contains the response of a method in the API that performs a bulk
 * operation and returns a bulk response. Partial commits are allowed on
 * a bulk operation.
 * <p>
 * In the event of a partial success where only a subset of objects were processed successfully, the getStatus method of the BulkResponse must return JAXRResponse.STATUS_WARNING. In this case, a Collection of JAXRException instances is included in the BulkResponse instance. The JAXRExceptions provide information on each error that prevented some objects in the request to not be processed successfully.
 *
 * @see QueryManager
 * @see LifeCycleManager
 * @author Farrukh S. Najmi
 */
public interface BulkResponse extends JAXRResponse {

    /**
     * Get the Collection of objects returned as a response of a
	 * bulk operation.
	 * Caller thread will block here if result is not yet available.
     *
     * <DL><DT><B>Capability Level: 0 </B></DL>
     *
     * @see javax.xml.registry.infomodel.RegistryObject
     * @return Collection of RegistryObject instances. The Collection may be empty but not null.
     * @throws JAXRException	If the JAXR provider encounters an internal error
     *
     */
    Collection getCollection() throws JAXRException;

    /**
	 * Get the Collection of RegistryException instances in case of partial commit.
	 * Caller thread will block here if result is not yet available.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @see RegistryException
	 * @return Collection of RegistryException instances. Return null if result is available and there is no RegistryException.
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
    Collection getExceptions() throws JAXRException;

	/**
	 * Determines whether the response is a partial response due to large result set.
	 *
	 * <DL><DT><B>Capability Level: 0 </B></DL>
	 *
	 * @return <code>true</code> if the response is partial; <code>false</code> otherwise
	 * @throws JAXRException	If the JAXR provider encounters an internal error
	 *
	 */
	public boolean isPartialResponse() throws JAXRException;

}
