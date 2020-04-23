package com.company;

import javax.lang.model.type.ArrayType;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceController {
    private String serviceName;
    private Scanner sc;
    private ArrayList<Service> listService;

    ServiceController() {
        sc = new Scanner(System.in);
        listService = new ArrayList<Service>();
    }

    private void printAllServices() {
        for (Service record : listService) {

            System.out.println(record.serviceName);
        }

    }

    private void addService() {

        System.out.println("Нажмите 1 для добавления новой услуги маникюра \n " +
                "2 для добавления новой услуги стрижки \n" +
                "3 для добавления новой услуги массажа" +
                "4 для добавления новой услуги косметологии ");
        String choose = sc.nextLine();
        switch (choose) {
            case "1":
                System.out.println("Введите название маникюра");
                this.serviceName = sc.nextLine();
                System.out.println("введите id ");
                 int id =sc.nextInt();
                System.out.println("введите стоимость услуги");
                double cost = sc.nextDouble();
                System.out.println("введите необходимое время для процедуры");
                int timeForService = sc.nextInt();
                System.out.println("введите вид Маникюра ");
                String typesManicure = sc.nextLine();
                System.out.println("введите необходимые аксессуары для маникюра ");
                String manicureAccessories = sc.nextLine();
                listService.add(new ManicureService(serviceName,id,cost,timeForService,typesManicure,manicureAccessories));
                break;
            case "2":
                System.out.println("Введите название стрижки");
                this.serviceName = sc.nextLine();
                System.out.println("введите id ");
                id=sc.nextInt();
                System.out.println("введите стоимость услуги");
                 cost = sc.nextDouble();
                System.out.println("введите необходимое время для стрижки");
                timeForService = sc.nextInt();
                System.out.println("введите вид(женский/мужской) Стрижки ");
                String gender = sc.nextLine();
                System.out.println("введите необходимые аксессуары для Стрижки ");
                String hairdressingTypes = sc.nextLine();
                listService.add(new HairdressingService(serviceName,id,cost,timeForService,gender,hairdressingTypes));
                break;
            case "3":
                System.out.println("Введите название массажа");
                this.serviceName = sc.nextLine();
                System.out.println("введите id ");
                id=sc.nextInt();
                System.out.println("введите стоимость услуги");
                cost = sc.nextDouble();
                System.out.println("введите необходимое время для массажа");
                timeForService = sc.nextInt();
                System.out.println("введите облость проведения массажа");
                String topography = sc.nextLine();
                System.out.println("введите метод проведения массажа ");
                String method = sc.nextLine();
                System.out.println("Введите метод проведения массажа ");
                System.out.println("введите тип массажа");
                String typeMassage = sc.nextLine();
                listService.add(new MassageServices(serviceName,id,cost,timeForService,topography,method,typeMassage));
                break;
            case "4":
                System.out.println("Введите название процедуры ");
                this.serviceName = sc.nextLine();
                System.out.println("введите id ");
                id =sc.nextInt();
                System.out.println("введите стоимость услуги");
                cost = sc.nextDouble();
                System.out.println("введите необходимое время для процедуры");
                timeForService = sc.nextInt();
                System.out.println("введите необходимые препораты для процедуры ");
                String usedDrug = sc.nextLine();
                listService.add(new CosmetologyService(serviceName,id,cost,timeForService, usedDrug));

                break;
        }

    }

    private void delService() {
        System.out.println("введите название услуги для удаления");
        serviceName = sc.nextLine();
        int listSize = listService.size();
        for (int i = 0; i < listSize; i++) {

            Service element = listService.get(i);
            if (element.serviceName.equals(serviceName)) {

                listService.remove(i);
            }
        }

    }

    private void saveToFileServices() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("c:\\temp\\services");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listService);

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


    private void readFromFileServices() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("c:\\temp\\services");
            ois = new ObjectInputStream(fis);
            listService = (ArrayList<Service>) ois.readObject();


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

    private void readFromFileServices(String filePath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            listService = (ArrayList<Service>) ois.readObject();


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


    protected void getServiceMenu() {
        System.out.println("нажмите 1 для добавления услуги \n" +
                " нажмите 2 для удаления услуги \n " +
                "нажмите 3 для распечатки услуг \n" +
                " нажмите 4 для сохранения услуг \n" +
                "нажмите 5 для загрузки услуг\n");
        String choose = sc.nextLine();
        switch (choose) {
            case "1":
                addService();
                break;
            case "2":
                delService();
                break;
            case "3":
                printAllServices();
                break;
            case "4":
                saveToFileServices();
                break;
            case "5":
                readFromFileServices();
                break;
            default:
                System.out.println("не корректное значение");
        }

    }

    Service searchService(String serviceName) {
         int list;
       list= listService.size();
        for (int i = 0;i <list ;i++ ){
     Service element = listService.get(i);

     //if(element.serviceName==serviceName){

     //}
  if (element.serviceName.equals(serviceName)) {

  }
 } //как сровнить две строки посмотреть про equals


    return null;
    }


}