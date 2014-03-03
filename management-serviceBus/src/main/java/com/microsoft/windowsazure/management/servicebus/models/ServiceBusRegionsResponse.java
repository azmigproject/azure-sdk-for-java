/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.servicebus.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
* A response to a request for a list of regions.
*/
public class ServiceBusRegionsResponse extends OperationResponse implements Iterable<ServiceBusLocation> {
    private ArrayList<ServiceBusLocation> regions;
    
    /**
    * The available regions.
    * @return The Regions value.
    */
    public ArrayList<ServiceBusLocation> getRegions() {
        return this.regions;
    }
    
    /**
    * The available regions.
    * @param regionsValue The Regions value.
    */
    public void setRegions(final ArrayList<ServiceBusLocation> regionsValue) {
        this.regions = regionsValue;
    }
    
    /**
    * Initializes a new instance of the ServiceBusRegionsResponse class.
    *
    */
    public ServiceBusRegionsResponse() {
        super();
        this.regions = new ArrayList<ServiceBusLocation>();
    }
    
    /**
    * Gets the sequence of Regions.
    *
    */
    public Iterator<ServiceBusLocation> iterator() {
        return this.getRegions().iterator();
    }
}