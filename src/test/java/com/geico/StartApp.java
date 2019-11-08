package com.geico;

public class StartApp {

    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();
        //associates put their availability
        callCenter.trainee1.setAvailable(false);
        callCenter.trainee2.setAvailable(false);
        callCenter.trainee3.setAvailable(true);
        callCenter.trainee4.setAvailable(false);
        callCenter.trainee5.setAvailable(false);
        callCenter.lead.setAvailable(true);

        System.out.println("CALL...");

        callCenter.getCallHandler();


    }
}
