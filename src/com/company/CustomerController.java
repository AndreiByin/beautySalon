package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {
    private Scanner sc;
    private ArrayList<Customer> ListCustomer;
    protected String customerName;

    CustomerController(){
        sc = new Scanner(System.in);
        ListCustomer = new ArrayList<Customer>();
 }
 private void printCustomer() {
     for (Customer record:ListCustomer){
         System.out.println(record);
     }
 }
 public void addCustomer(){

     System.out.println("Введите имя нового клиента ");
    this.customerName = sc.nextLine();
     System.out.println("это женщина или мусчина");
     String gender = sc.nextLine();
     System.out.println("возрост клиента ");
     int age = sc.nextInt();
     System.out.println("введите номер телефона ");
     String phoneNumber = sc.nextLine();
     System.out.println("дата регистрации");
     String dateRecording = sc.nextLine();
    ListCustomer.add(new Customer(customerName,gender,age,phoneNumber,dateRecording));
 }
 private void delCustomer(){
     System.out.println("введите имя клиента");
     customerName = sc.nextLine();
     int listSize = ListCustomer.size();
     for (int x = 0; x<listSize;x++){
         Customer element = ListCustomer.get(x);
         if (element.name.equals(customerName)){
             ListCustomer.remove(x);
         }
     }
 }
    private void saveToFileCustomer() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("c:\\temp\\customer");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(ListCustomer);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    private void readFromFileCustomer() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("c:\\temp\\customer");
            ois = new ObjectInputStream(fis);
            ListCustomer = (ArrayList<Customer>) ois.readObject();


        } catch (IOException | ClassNotFoundException e) {
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

    private void readFromFileCustomer(String filePath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            ListCustomer = (ArrayList<Customer>) ois.readObject();


        } catch (IOException | ClassNotFoundException e) {
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
    protected void getCustomerMenu() {
        System.out.println("нажмите 1 для добавления клиента \n" +
                " нажмите 2 для удаления клиента \n " +
                "нажмите 3 для распечатки клиента \n" +
                " нажмите 4 для сохранения клиента \n" +
                "нажмите 5 для загрузки клиента\n");
        String choose = sc.nextLine();
        switch (choose) {
            case "1":
                addCustomer();
                break;
            case "2":
                delCustomer();
                break;
            case "3":
                printCustomer();
                break;
            case "4":
                saveToFileCustomer();
                break;
            case "5":
                readFromFileCustomer();
                break;
            default:
                System.out.println("не корректное значение");
        }

    }
    Service searchCustomer(String customerName) {
        int list;
        list= ListCustomer.size();
        for (int i = 0;i <list ;i++ ){
            Customer element = ListCustomer.get(i);


            if (element.name.equals(customerName)) {

            }
        }


        return null;
    }

}
