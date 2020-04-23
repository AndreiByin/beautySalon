package com.company;

import java.io.Serializable;

public class SalesManager extends Employee implements Serializable {
    protected String salesExperience;
    protected String phoneNumber;

    public SalesManager(String name, int age, int id, String position,
                        String hiringDate, int experience, String salesExperience, String phoneNumber) {
        super(name, age, id, position, hiringDate, experience);
        this.salesExperience = salesExperience;
        this.phoneNumber = phoneNumber;
    }
}
