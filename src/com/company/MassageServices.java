package com.company;

public class MassageServices extends Service {
    protected String topography;
    protected String method;
    protected String typeMassage;

    public MassageServices(String serviceName, int idService, double cost, int timeForService, String topography, String method, String typeMassage) {
        super(serviceName, idService, cost, timeForService);
        this.topography = topography;
        this.method = method;
        this.typeMassage = typeMassage;
    }
}
