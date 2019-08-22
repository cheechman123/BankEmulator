package whyNotPractice;

public class Bank {
    private double persent;
    private int month;

    public Bank(double persent, int month){
        this.persent = persent;
        this.month = month;
    }

    public static double persentCount(double startCapital, double persent, int additionalAmount, double month) {
        double resOfSub = 0;
        for (int i = 0; i < month - 1; i++) {
            double persentCalculating = (startCapital * persent) / month;
            resOfSub += persentCalculating;
            startCapital += additionalAmount;
        }
        return resOfSub + startCapital;
    }
}
