package whyNotPractice;

import java.io.IOException;

public class Bank {
    private final double persent;
    private final int month;


    public Bank(double persent, int month) {
        this.persent = persent;
        this.month = month;
    }

    public double getPersent() {
        return persent;
    }

    public int getMonth() {
        return month;
    }
}
