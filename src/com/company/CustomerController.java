package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {
    private Scanner sc;
    private ArrayList<Customer> ListCustomer;
    private String customerName;

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
     System.out.println("Введите нового клиента для добавления");
     customerName = sc.nextLine();
     ListCustomer.add(null);
 }

}
