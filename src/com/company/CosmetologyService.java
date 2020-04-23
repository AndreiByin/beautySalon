package com.company;

public class CosmetologyService extends Service{

   protected String  usedDrug;

    public CosmetologyService(String serviceName, int idService, double cost, int timeForService,String usedDrug) {
        super(serviceName, idService, cost, timeForService);

        this.usedDrug = usedDrug;
    }
}
