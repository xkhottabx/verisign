package com.geico;


public class Customer {


    private int reasonForACall;

    public Customer() {
    }

    public Customer(int reasonForACall) {
        this.reasonForACall = reasonForACall;
    }

    public int getReasonForACall() {
        return reasonForACall;
    }

    public void setReasonForACall(int reasonForACall) {
        this.reasonForACall = reasonForACall;
    }
}
