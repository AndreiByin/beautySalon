package com.company;

public class Cosmetology extends Masseur {
   private String surgicalSpecialization;
   private String spaPrograms;

    public Cosmetology(String name, int age, int id, String position, String hiringDate, int experience, String education,
           String medicalExaminationDate, String qualification, String medicalEducation, String medicalExperience,
                       String surgicalSpecialization, String spaPrograms) {
        super(name, age, id, position, hiringDate, experience, education, medicalExaminationDate, qualification,
                medicalEducation, medicalExperience);
        this.surgicalSpecialization = surgicalSpecialization;
        this.spaPrograms = spaPrograms;
    }
}

