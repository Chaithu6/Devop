package com.ebugtracker.customer.constants;

import com.ebugtracker.customer.exceptions.InvalidBugPriorityException;

public enum BugPriority {
    LOW,MEDIUM,HIGH;
    public static BugPriority toEnum(String priority){
        BugPriority [] priorityList=BugPriority.values();
        for(BugPriority item:priorityList){
            String name=item.name();
            if (priority.equalsIgnoreCase(name)) {
                return item;
            }
        }
        throw new InvalidBugPriorityException("Invalid Bug Priority "+priority);
    }
}
