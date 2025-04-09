package com.xworkz.internal;

public class Occupation {
    private String name;
    private String industry;
    private String experience;
    private String salary;
    private String workLocation;

    void setName(String name) {
        this.name = name;
    }

    void setIndustry(String industry) {
        this.industry = industry;
    }

    void setExperience(String experience) {
        this.experience = experience;
    }

    void setSalary(String salary) {
        this.salary = salary;
    }

    void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getName() {
        return this.name;
    }

    public String getIndustry() {
        return this.industry;
    }

    public String getExperience() {
        return this.experience;
    }

    public String getSalary() {
        return this.salary;
    }

    public String getWorkLocation() {
        return this.workLocation;
    }

}
