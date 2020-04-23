package com.company;

import java.io.Serializable;

public class Service implements Serializable {

    protected String serviceName;
    private int idService;
    private double cost;
    private int timeForService;

    public Service(String serviceName, int idService, double cost, int timeForService) {
        this.serviceName = serviceName;
        this.idService = idService;
        this.cost = cost;
        this.timeForService = timeForService;
    }
}
