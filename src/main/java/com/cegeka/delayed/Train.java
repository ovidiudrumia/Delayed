package com.cegeka.delayed;

public class Train {
    private int hoursDelayed;

    public Train(int hoursDelayed) {
        this.hoursDelayed = hoursDelayed;
    }

    public int getHoursDelayed() {
        return hoursDelayed;
    }

    public String customerSatisfaction() {
        return "Nice...";
    }
}
