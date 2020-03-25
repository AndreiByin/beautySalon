package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceController {
    private   String serviceName ;
    private Scanner sc;
    private ArrayList<Service> listService;

    public ServiceController() {
        sc = new Scanner(System.in);
        listService = new ArrayList<Service>();
    }

    public void printAllServices() {
        for (Service record : listService) {

            System.out.println(record.serviceName);
        }

    }

    public void addService() {

        System.out.println("Нажмите 1 для добавления новой услуги маникюра \n 2 для добавления новой услуги стрижки \n ");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Введите название маникюра");
                serviceName = sc.nextLine();
                listService.add(new Manicure(serviceName));
                break;
            case 2:
                System.out.println("Введите название стрижки");
                serviceName = sc.nextLine();
                listService.add(new Hairdressing(serviceName));
                break;
        }

    }
     public void delService(){
         System.out.println("введите название услуги для удаления");
         serviceName = sc.nextLine();
         int listSize=listService.size();
         for (int i = 0;i<listSize;i++){

             Service element=listService.get(i);
        if (element.serviceName==serviceName){

            listService.remove(i);
        }
         }

     }
      public void SaveToFileServices(){
          FileOutputStream fos = null;
          ObjectOutputStream oos = null;
          try {
             fos = new FileOutputStream("c:\\temp\\services");
             oos =  new ObjectOutputStream(fos);
              oos.writeObject(serviceName);

          } catch (IOException e) {
              e.printStackTrace();
          }
          finally {
              try {
              oos.close();
              fos.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }

      }
      public void readFromFileServices(){
          FileInputStream fis = null;
          ObjectInputStream  ois = null;
          try {
               fis = new FileInputStream("c:\\temp\\services");
               ois = new ObjectInputStream(fis);
              listService = ( ArrayList<Service>) ois.readObject();


          } catch (IOException | ClassNotFoundException e) {
              e.printStackTrace();
          }
          finally {
              try {
              ois.close();
              fis.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }

          }


      }
    //сохранить все сервисы из коллекции в файл
    //прочитать из файла все серсивы в коллекцию
    //метод меню контролллера
    //метод получани одного сервиса по его названию

}
