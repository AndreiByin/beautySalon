package com.company;

import java.io.Serializable;

public class Employee implements Serializable {
    protected String name;
    private int age;
    protected int id;
     String position;
    protected String hiringDate;
    protected int experience;


    public Employee(String name, int age, int id, String position, String hiringDate,int experience ) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.position = position;
        this.hiringDate = hiringDate;
        this.experience = experience;

    }


}
