package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserController  {

    private Scanner sc;
    private ArrayList<Employee> listEmployees;
    protected String userName;


UserController(){
    sc = new Scanner(System.in);
    listEmployees = new ArrayList<Employee>();

}
private void  printEmployees()   {
    for (Employee record:listEmployees){
        System.out.println(record.name);
    }
}
private void addEmployee(){
    System.out.println("введите 1 для добавления нового мастера \n" +
            "введите 2 для добавления нового Массажиста \n"+
            "введите 3 для добавления нового Парикмахера \n "+
            "введите 4 для добавления нового Косметолога \n "+
            "введите 5 для добавления Директора \n" +
            "введите 6 для добавления нового Менеджера \n" +
            "введите 7 для добавления нового Водителя \n ");
    String choose = sc.nextLine();
    switch (choose){
        case "1":
            System.out.println("введите имя мастера");
            this.userName  = sc.nextLine();
            System.out.println("введите возраст мастера");
            int age = sc.nextInt();
            System.out.println("введите id мастера");
            int id = sc.nextInt();
            System.out.println("введите позицию мастера");
            String position = sc.nextLine();
            System.out.println("введите дату найма");
            String hiringDate = sc.nextLine();
            System.out.println("введите стаж мастера");
            int experience = sc.nextInt();
            System.out.println("введите оброзование мастера");
            String education = sc.nextLine();
            System.out.println("ввелите медицинское образование Мастера");
            String medicalExaminationDate = sc.nextLine();
            System.out.println("введите инструмент которым пользуется мастер");
            String manicureTools = sc.nextLine();
            System.out.println("введите награды мастера полученые на международных конкурсах ");
            String awards = sc.nextLine();
            listEmployees.add(new Manicurist(userName,age,id,position,hiringDate,experience,education,medicalExaminationDate,manicureTools,awards));
            break;
        case "2":
            System.out.println("введите имя масажиста");
            this.userName = sc.nextLine();
            System.out.println("введите возраст масажиста");
            age = sc.nextInt();
            System.out.println("введите id масажиста");
            id = sc.nextInt();
            System.out.println("введите позицию масажиста");
            position = sc.nextLine();
            System.out.println("введите дату найма");
            hiringDate = sc.nextLine();
            System.out.println("введите стаж масажиста");
            experience = sc.nextInt();
            System.out.println("введите оброзование масажиста");
            education = sc.nextLine();
            System.out.println("ввелите медицинское образование масажиста");
            medicalExaminationDate = sc.nextLine();
            System.out.println("введите квалификацию масажиста ");
            String qualification = sc.nextLine();
            System.out.println("введите медицинское образование масажиста ");
            String medicalEducation = sc.nextLine();
            System.out.println("введите медицинское опыт масажиста");
            String medicalExperience = sc.nextLine();

            listEmployees.add(new Masseur(userName,age,id,position,hiringDate,experience,education,medicalExaminationDate,
                    qualification, medicalEducation, medicalExperience));
            break;
        case "3":
            System.out.println("введите имя Парикхмахера");
            this.userName = sc.nextLine();
            System.out.println("введите возраст парикхмахера");
            age = sc.nextInt();
            System.out.println("введите id парикхмахера");
            id = sc.nextInt();
            System.out.println("введите позицию парикхмахера");
            position = sc.nextLine();
            System.out.println("введите дату найма");
            hiringDate = sc.nextLine();
            System.out.println("введите стаж парикхмахера");
            experience = sc.nextInt();
            System.out.println("введите оброзование парикхмахера");
            education = sc.nextLine();
            System.out.println("ввелите медицинское образование парикхмахера");
            medicalExaminationDate = sc.nextLine();
            System.out.println("введите специализацию парикхмахера ");
            String specialization = sc.nextLine();
            System.out.println("введите категорию парикхмахера ");
            int category  = sc.nextInt();
            listEmployees.add(new Hairdressing(userName,age,id,position,hiringDate,experience,education,medicalExaminationDate,specialization,category));
        case "4":
            System.out.println("введите имя Косметолога");
            this.userName = sc.nextLine();
            System.out.println("введите возраст Косметолога");
            age = sc.nextInt();
            System.out.println("введите id Косметолога");
            id = sc.nextInt();
            System.out.println("введите позицию Косметолога");
            position = sc.nextLine();
            System.out.println("введите дату найма");
            hiringDate = sc.nextLine();
            System.out.println("введите стаж Косметолога");
            experience = sc.nextInt();
            System.out.println("введите оброзование Косметолога");
            education = sc.nextLine();
            System.out.println("ввелите медицинское образование Косметолога");
            medicalExaminationDate = sc.nextLine();
            System.out.println("введите квалификацию Косметолога");
            qualification = sc.nextLine();
            System.out.println("введите медицинское образование Косметолога ");
            medicalEducation = sc.nextLine();
            System.out.println("введите медицинское опыт Косметолога");
            medicalExperience = sc.nextLine();
            System.out.println("введите хирургическую специализацию Косметолога");
            String surgicalSpecialization = sc.nextLine();
            System.out.println("введите знание спа програмы");
            String spaPrograms = sc.nextLine();

            listEmployees.add(new Cosmetology(userName,age,id,position,hiringDate,experience,education,medicalExaminationDate,
                    qualification,medicalEducation,medicalExperience,surgicalSpecialization,spaPrograms));
            break;
        case "5":
            System.out.println("введите имя директора");
            this.userName = sc.nextLine();
            System.out.println("введите возраст директора");
            age = sc.nextInt();
            System.out.println("введите id директора");
            id = sc.nextInt();
            System.out.println("введите позицию директора");
            position = sc.nextLine();
            System.out.println("введите дату найма");
            hiringDate = sc.nextLine();
            System.out.println("введите стаж директора");
            experience = sc.nextInt();
            System.out.println("введите прошлое место работы");
            String lastJob = sc.nextLine();
            System.out.println("введите домашний адрес");
            String homeAddress = sc.nextLine();
            System.out.println("введите домашний номер телефона");
            String homePhoneNumber = sc.nextLine();

            listEmployees.add(new Director(userName,age,id,position,hiringDate,experience,lastJob,homeAddress,homePhoneNumber));
            break;
        case "6":
            System.out.println("введите данные менеджера");
            this.userName = sc.nextLine();
            System.out.println("введите возраст менеджера");
            age = sc.nextInt();
            System.out.println("введите id менеджера");
            id = sc.nextInt();
            System.out.println("введите позицию менеджера");
            position = sc.nextLine();
            System.out.println("введите дату найма менеджера");
            hiringDate = sc.nextLine();
            System.out.println("введите стаж менеджера");
            experience = sc.nextInt();
            System.out.println("введите количество лет опыта менеджера в продажах");
            String salesExperience = sc.nextLine();
            System.out.println("введите номер телефона менеджера");
            String phoneNumber = sc.nextLine();
                listEmployees.add(new SalesManager(userName,age,id,position,hiringDate,experience,salesExperience,phoneNumber));
                break;
        case "7":
            System.out.println("введите имя нового водителя");
            this.userName = sc.nextLine();
            System.out.println("введите возраст водителя");
            age = sc.nextInt();
            System.out.println("введите id водителя");
            id = sc.nextInt();
            System.out.println("введите категорию водителя");
            position = sc.nextLine();
            System.out.println("введите дату найма водителя");
            hiringDate = sc.nextLine();
            System.out.println("Введите стаж управления  водителя ");
            experience = sc.nextInt();
            System.out.println("введите категории имеющиеся у  водителя");
            String drivingCategories = sc.nextLine();
            System.out.println("введите результаты теста на наркотики");
            String drugTest = sc.nextLine();

            listEmployees.add(new Driver(userName,age,id,position,hiringDate,experience,drivingCategories,drugTest));
            break;
    }

}
private void dellEmployee(){
   userName = sc.nextLine();
    int listSize = listEmployees.size();
    for (int i = 0; i <listSize;i++){
        Employee elements = listEmployees.get(i);
        if (elements.name.equals(userName)){
            listEmployees.remove(i);

        }

    }

}
    private void saveToFileNameUser(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("c:\\temp\\nameUser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listEmployees);
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                oos.close();
                fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    private void readFromFileNameUser(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("c:\\temp\\nameUser");
            ois = new ObjectInputStream(fis);

                listEmployees = (ArrayList<Employee>) ois.readObject();


        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    void getEmployeesMenu(){
        System.out.println("нажмите 1 для добавления сотрудника   \n" +
                " нажмите 2 для удаления сотрудника  \n " +
                "нажмите 3 для распечатки сотрудника  \n" +
                " нажмите 4 для сохранения списка сотрудников  \n" +
                "нажмите 5 для загрузки списка сотрудников \n" );

        String choose = sc.nextLine();
        switch (choose){
            case "1":
                addEmployee();
                break;
            case "2":
                dellEmployee();
                break;
            case "3":
                printEmployees();
                break;
            case "4":
                saveToFileNameUser();
                break;
            case "5":
                readFromFileNameUser();
                break;
            default:
                System.out.println("не корректное значение ");
        }

    }
    Employee searchUser(String userName) {
        int list;
        list = listEmployees.size();
        for (int i = 0; i < list; i++) {
            Employee element = listEmployees.get(i);


            if (element.name.equals(userName)) {

            }
        }
    return null;
    }
}
