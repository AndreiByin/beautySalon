package com.company;

import java.io.Serializable;

public class Director extends Employee implements Serializable {
    private String lastJob;
    private String homeAddress;
    private String homePhoneNumber;

    public Director(String name, int age, int id, String position, String hiringDate, int experience,
                    String lastJob, String homeAddress, String homePhoneNumber) {
        super(name, age, id, position, hiringDate, experience);
        this.lastJob = lastJob;
        this.homeAddress = homeAddress;
        this.homePhoneNumber = homePhoneNumber;
    }
}
