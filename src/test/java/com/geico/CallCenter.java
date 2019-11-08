package com.geico;

import java.util.*;


public class CallCenter {

    protected Trainee trainee1 = new Trainee(false);
    protected Trainee trainee2 = new Trainee(false);
    protected Trainee trainee3 = new Trainee(false);
    protected Trainee trainee4 = new Trainee(false);
    protected Trainee trainee5 = new Trainee(false);
    protected Lead lead = new Lead();
    protected Manager manager = new Manager();

    private List<Associate> associates = new ArrayList<>();
    private Map<Integer, String> reasonsForACall = new HashMap<>();


    public List<Associate> getAssociates() {
        Trainee trainee01 = (Trainee) trainee1;
        associates.add(trainee1);
        associates.add(trainee2);
        associates.add(trainee3);
        associates.add(trainee4);
        associates.add(trainee5);
        associates.add(lead);
        associates.add(manager);
        return associates;
    }


    public Map<Integer, String> getReasonsForACall() {
        reasonsForACall.put(1, "Billing and Payment");
        reasonsForACall.put(2, "Claims");
        reasonsForACall.put(3, "Discounts");
        reasonsForACall.put(4, "Policy");
        reasonsForACall.put(5, "General Help");
        reasonsForACall.put(6, "Personal questions");
        return reasonsForACall;
    }


    public void getCallHandler() {
        List<Associate> associatesList = getAssociates();
        boolean traineeIsAvailable = false;
        int traineeNumber = 0;
        for (int i = 0; i < getAssociates().size(); i++) {
            Associate associate = associatesList.get(i);
            if (associate instanceof Trainee && associate.isAvailable() == true) {
                traineeNumber = i + 1;
                System.out.println("Trainee #" + traineeNumber + " received a call");
                traineeIsAvailable = true;
                break;
            } else if (i > 4 && traineeIsAvailable == false) {
                System.out.println("Sorry, all operators are busy at this time.");
                System.exit(0);
            }
        }

        Trainee traineeOnline = null;

        switch (traineeNumber) {
            case 1:
                traineeOnline = trainee1;
                break;
            case 2:
                traineeOnline = trainee2;
                break;
            case 3:
                traineeOnline = trainee3;
                break;
            case 4:
                traineeOnline = trainee4;
                break;
            case 5:
                traineeOnline = trainee5;
                break;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select a reason for a call, enter digit from 1 to 6:");

        int number = scanner.nextInt();

        while (number < 1 || number > 6) {
            System.out.println("Invalid number. Please try again:");
            number = scanner.nextInt();
        }

        System.out.println("Number  " + number);


        System.out.println("Reason: " + getReasonsForACall().get(number));


        if (number == 6 && lead.isAvailable() == true) {
            traineeOnline.switchToLead();
        } else if (number == 6 && lead.isAvailable() == false) {
            traineeOnline.switchToManager();
        } else {
            System.out.println("Trainee is proceeding a call.");
        }


    }


}


