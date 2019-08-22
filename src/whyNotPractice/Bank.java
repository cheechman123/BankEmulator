package whyNotPractice;

import java.io.IOException;

public class Bank {
    private final double persent;
    private final int month;
    User user ;

    public Bank(double persent, int month){
        this.persent = persent;
        this.month = month;
    }

    public  double persentCount(double startCapital, double persent, int additionalAmount, double month) {
        double resOfSub = 0;
        if(this.persent != persent && this.month != month) {
            throw new IllegalArgumentException("Sorry this service not supported ");
        }
        for (int i = 0; i < month - 1; i++) {
            double persentCalculating = (startCapital * persent) / month;
            resOfSub += persentCalculating;
            startCapital += additionalAmount;
        }
        return resOfSub + startCapital;
    }
}
