/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apereo.portal.groups.pags.testers;

import org.apereo.portal.groups.pags.IPersonTester;
import org.apereo.portal.groups.pags.dao.IPersonAttributesGroupTestDefinition;
import org.apereo.portal.security.IPerson;

/**
 * @author Eric Dalquist
 */
public class AlwaysTrueTester implements IPersonTester {

    /**
     * @since 4.3
     */
    public AlwaysTrueTester(IPersonAttributesGroupTestDefinition definition) {}

    /**
     * @deprecated use {@link EntityPersonAttributesGroupStore}, which leverages
     * the single-argument constructor.
     */
    @Deprecated
    public AlwaysTrueTester(String attribute, String test) {}

    /* (non-Javadoc)
     * @see org.apereo.portal.groups.pags.IPersonTester#test(org.apereo.portal.security.IPerson)
     */
    public boolean test(IPerson person) {
        return true;
    }
}
