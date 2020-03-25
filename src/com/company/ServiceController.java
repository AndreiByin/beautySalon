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

          try {
              FileOutputStream fos = new FileOutputStream("c:\\temp\\writeservices");
              ObjectOutputStream oos = new ObjectOutputStream(fos);
              oos.writeObject(serviceName);
              oos.close();
          } catch (IOException e) {
              e.printStackTrace();
          }

      }
      public void WriteServices(){
    ArrayList<Service> serviceName;

          try {
              FileInputStream fis = new FileInputStream("c:\\temp\\writeservicessssss");
              ObjectInputStream ois = new ObjectInputStream(fis);
              serviceName =(ArrayList<Service>)ois.readObject();

          } catch (IOException | ClassNotFoundException e) {
              e.printStackTrace();
          }


      }
    //сохранить все сервисы из коллекции в файл
    //прочитать из файла все серсивы в коллекцию
    //метод меню контролллера
    //метод получани одного сервиса по его названию

}
