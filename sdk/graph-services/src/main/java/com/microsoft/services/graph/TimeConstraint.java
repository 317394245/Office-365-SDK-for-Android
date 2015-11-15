/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph;

import com.microsoft.services.orc.core.ODataBaseEntity;




/**
 * The type Time Constraint.
*/
public class TimeConstraint extends ODataBaseEntity {

    public TimeConstraint(){
        setODataType("#Microsoft.Graph.TimeConstraint");
    }

    private ActivityDomain ActivityDomain;

    /**
    * Gets the Activity Domain.
    *
    * @return the ActivityDomain
    */
    public ActivityDomain getActivityDomain() {
        return this.ActivityDomain; 
    }

    /**
    * Sets the Activity Domain.
    *
    * @param value the ActivityDomain
    */
    public void setActivityDomain(ActivityDomain value) { 
        this.ActivityDomain = value;
        valueChanged("ActivityDomain", value);

    }

    private java.util.List<TimeSlot> Timeslots;

    /**
    * Gets the Timeslots.
    *
    * @return the java.util.List<TimeSlot>
    */
    public java.util.List<TimeSlot> getTimeslots() {
        return this.Timeslots; 
    }

    /**
    * Sets the Timeslots.
    *
    * @param value the java.util.List<TimeSlot>
    */
    public void setTimeslots(java.util.List<TimeSlot> value) { 
        this.Timeslots = value;
        valueChanged("Timeslots", value);

    }
}