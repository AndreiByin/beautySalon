package com.company;

public class ManicureService extends Service{
    protected String typesManicure;
    protected String manicureAccessories;

    public ManicureService(String serviceName, int idService, double cost, int timeForService, String typesManicure, String manicureAccessories) {
        super(serviceName, idService, cost, timeForService);
        this.typesManicure = typesManicure;
        this.manicureAccessories = manicureAccessories;
    }
}
