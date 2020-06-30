/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.is.client;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.wso2.carbon.apimgt.impl.AMDefaultKeyManagerImpl;

/**
 * This class provides the implementation to use "wso2is" for managing
 * OAuth clients and Tokens needed by WSO2 API Manager.
 */
public class WSO2ISOAuthClient extends AMDefaultKeyManagerImpl {

    private static final Log log = LogFactory.getLog(WSO2ISOAuthClient.class);

    public String getType() {

        return WSO2ISConstants.WSO2IS_TYPE;
    }
}
