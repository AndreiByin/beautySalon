package com.company;

public class HairdressingService extends Service {
        protected String gender;
        protected String hairdressingTypes;

    public HairdressingService(String serviceName, int idService, double cost, int timeForService, String gender, String hairdressingTypes) {
        super(serviceName, idService, cost, timeForService);
        this.gender = gender;
        this.hairdressingTypes = hairdressingTypes;
    }
}
