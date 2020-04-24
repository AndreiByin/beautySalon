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
 private void addCustomer(){

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

}
