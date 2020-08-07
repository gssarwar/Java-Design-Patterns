package com.gs.structural.adapter.classobjectadopter;


/**
 * An existing class used in our system used as adaptee
 */
public class Employee {

    private String fullName;
    private String jobTitle;
    private String officeLocation;

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getOfficeLocation() {
        return officeLocation;
    }
    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

}
