package com.company;

public class Specialist extends Employee{

   protected String education;
   protected String medicalExaminationDate;

    public Specialist(String name, int age, int id, String position, String hiringDate,
                      int experience, String education, String medicalExaminationDate) {
        super(name, age, id, position, hiringDate, experience);
        this.education = education;
        this.medicalExaminationDate = medicalExaminationDate;
    }

    public void infoSpecialist(){
        System.out.println("информация про специлиста");
    }
}
