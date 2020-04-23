package com.company;

import java.io.Serializable;

public class Hairdressing extends Specialist implements Serializable {
   protected String specialization;
   protected int category;

    public Hairdressing(String name, int age, int id, String position, String hiringDate,
                        int experience, String education, String medicalExaminationDate, String specialization, int category) {
        super(name, age, id, position, hiringDate, experience, education, medicalExaminationDate);
        this.specialization = specialization;
        this.category = category;
    }
    @Override
    public  void infoSpecialist() {
        System.out.println("информация про Парикхмахер ");
    }
}


