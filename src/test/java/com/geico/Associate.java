package com.geico;


public abstract class Associate {


    private boolean available;

    public Associate() {
    }

    public Associate(boolean available) {
        this.available = available;
    }


    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
