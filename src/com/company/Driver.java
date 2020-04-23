package com.company;

import java.io.Serializable;

public class Driver extends Employee implements Serializable {
    protected String drivingCategories;
    protected String drugTest;

    public Driver(String name, int age, int id, String position, String hiringDate, int experience,
                  String drivingCategories, String drugTest) {
        super(name, age, id, position, hiringDate, experience);
        this.drivingCategories = drivingCategories;
        this.drugTest = drugTest;
    }
}
