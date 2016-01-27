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

package com.microsoft.azure.management.compute.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.ResourceBaseExtended;

import java.util.ArrayList;

/**
* Create or update Availability Set parameters.
*/
public class AvailabilitySet extends ResourceBaseExtended {
    private Integer platformFaultDomainCount;
    
    /**
    * Optional. Gets or sets Fault Domain count.
    * @return The PlatformFaultDomainCount value.
    */
    public Integer getPlatformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }
    
    /**
    * Optional. Gets or sets Fault Domain count.
    * @param platformFaultDomainCountValue The PlatformFaultDomainCount value.
    */
    public void setPlatformFaultDomainCount(final Integer platformFaultDomainCountValue) {
        this.platformFaultDomainCount = platformFaultDomainCountValue;
    }
    
    private Integer platformUpdateDomainCount;
    
    /**
    * Optional. Gets or sets Update Domain count.
    * @return The PlatformUpdateDomainCount value.
    */
    public Integer getPlatformUpdateDomainCount() {
        return this.platformUpdateDomainCount;
    }
    
    /**
    * Optional. Gets or sets Update Domain count.
    * @param platformUpdateDomainCountValue The PlatformUpdateDomainCount value.
    */
    public void setPlatformUpdateDomainCount(final Integer platformUpdateDomainCountValue) {
        this.platformUpdateDomainCount = platformUpdateDomainCountValue;
    }
    
    private ArrayList<InstanceViewStatus> statuses;
    
    /**
    * Optional. Gets or sets the resource status information.
    * @return The Statuses value.
    */
    public ArrayList<InstanceViewStatus> getStatuses() {
        return this.statuses;
    }
    
    /**
    * Optional. Gets or sets the resource status information.
    * @param statusesValue The Statuses value.
    */
    public void setStatuses(final ArrayList<InstanceViewStatus> statusesValue) {
        this.statuses = statusesValue;
    }
    
    private ArrayList<VirtualMachineReference> virtualMachinesReferences;
    
    /**
    * Optional. Gets or sets a list containing reference to all Virtual
    * Machines  created under this Availability Set.
    * @return The VirtualMachinesReferences value.
    */
    public ArrayList<VirtualMachineReference> getVirtualMachinesReferences() {
        return this.virtualMachinesReferences;
    }
    
    /**
    * Optional. Gets or sets a list containing reference to all Virtual
    * Machines  created under this Availability Set.
    * @param virtualMachinesReferencesValue The VirtualMachinesReferences value.
    */
    public void setVirtualMachinesReferences(final ArrayList<VirtualMachineReference> virtualMachinesReferencesValue) {
        this.virtualMachinesReferences = virtualMachinesReferencesValue;
    }
    
    /**
    * Initializes a new instance of the AvailabilitySet class.
    *
    */
    public AvailabilitySet() {
        super();
        this.setStatuses(new LazyArrayList<InstanceViewStatus>());
        this.setVirtualMachinesReferences(new LazyArrayList<VirtualMachineReference>());
    }
    
    /**
    * Initializes a new instance of the AvailabilitySet class with required
    * arguments.
    *
    * @param location Gets or sets the location of the resource.
    */
    public AvailabilitySet(String location) {
        this();
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setLocation(location);
    }
}