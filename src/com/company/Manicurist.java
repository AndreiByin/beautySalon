package com.company;

import java.io.Serializable;

public class Manicurist extends Specialist implements Serializable {

    protected String manicureTools;
    protected String awards;

    public Manicurist(String name, int age, int id, String position, String hiringDate,
                      int experience, String education, String medicalExaminationDate, String manicureTools, String awards) {
        super(name, age, id, position, hiringDate, experience, education, medicalExaminationDate);
        this.manicureTools = manicureTools;
        this.awards = awards;
    }
}
