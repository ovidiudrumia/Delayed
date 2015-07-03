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
        if(hoursDelayed == 0) {
            return "Nice...";
        } else if (hoursDelayed == 1) {
            return "Ah well...";
        } else if(hoursDelayed == 2){
            return "Annoying...";
        } else if(hoursDelayed == 3) {
            return "Burn it!";
        } else {
            throw new RuntimeException();
        }
    }
}
