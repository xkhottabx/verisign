package com.geico;

public class Trainee extends Associate {
    public Trainee() {
    }

    public Trainee(boolean available) {
        super(available);
    }

    public void switchToLead() {
        System.out.println("Redirecting to Lead");
    }

    public void switchToManager() {
        System.out.println("Redirecting to Manager");
    }
}
