package com.company;


import java.util.Scanner;

public class Menu {

    public static void run() {
        int choise = 0;
        while (choise!=3) {
            System.out.println("Введите \n 1 для работы с клиентами \n 2 для работы с услугами \n 3 для выхода \n");
            Scanner scr = new Scanner(System.in);
             choise = scr.nextInt();
            switch (choise){
                case 1:
                System.out.println("Клиенты");
                break;
                case 2:
                    System.out.println("Услуги");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Нет токого пункта в меню");
            }

        }
    }
}
