package com.company;


import java.util.Scanner;

public class Menu {

 protected static void run() {
        ServiceController serviceControllerObj = new ServiceController();
        UserController userControllerObj = new UserController();
        CustomerController customerControllerObj = new CustomerController();
        String choose = "0";
        while (!choose.equals("6")) {
            System.out.println("Введите \n 1 для работы с клиентами \n " +
                    "2 для работы с услугами \n " +
                    "3 для работы с сотрудниками \n" +
                    "4 для поиска услуги \n"+
                    "5 для поиска сотрудника \n "+
                    "6 для плиска клиента \n"+
                    "7 для выхода \n");
            Scanner scr = new Scanner(System.in);
            choose = scr.nextLine();

            try {
               Integer.parseInt(choose);

                switch (choose) {
                    case "1":
                        customerControllerObj.getCustomerMenu();
                        break;
                    case "2":
                        serviceControllerObj.getServiceMenu();
                        break;
                    case "3":
                        userControllerObj.getEmployeesMenu();
                        break;
                    case "4":
                        System.out.println("введите название искомого сервиса");
                        String s=scr.nextLine();

                        serviceControllerObj.searchService(s);
                        break;
                    case "5":
                        System.out.println("введите название искомого сотрудника");
                        String u = scr.nextLine();
                        userControllerObj.searchUser(u);
                        break;

                    case "6":
                        System.out.println("введите название искомого клиента");
                        String c = scr.nextLine();
                        userControllerObj.searchUser(c);
                        break;

                    case "7":

                    default:
                        System.out.println("Нет токого пункта в меню");
                }
            } catch ( NumberFormatException e) {
                System.out.println(e.getMessage());
            }

        }
    }



}
