package com.company;

import java.io.Serializable;

public class Customer implements Serializable {
   protected String name;
   protected String gender;
    private int age;
    private String phoneNumber;
    protected String dateRecording;

    public Customer(String name, String gender, int age, String phoneNumber, String dateRecording) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.dateRecording = dateRecording;
    }
}
