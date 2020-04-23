package com.company;

public class Masseur extends Specialist {
    protected String qualification;
    protected String medicalEducation;
    protected String medicalExperience;

    public Masseur(String name, int age, int id, String position, String hiringDate, int experience, String education,
                   String medicalExaminationDate, String qualification, String medicalEducation, String medicalExperience) {
        super(name, age, id, position, hiringDate, experience, education, medicalExaminationDate);
        this.qualification = qualification;
        this.medicalEducation = medicalEducation;
        this.medicalExperience = medicalExperience;
    }
@Override
    public void infoSpecialist() {
        System.out.println("информация про Массажера");
/* void show(){

        System.out.println(name);
        System.out.println(getAge());
    }

    */
    }
}
