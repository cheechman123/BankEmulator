package whyNotPractice;

public class Main {
    public static void main(String[] args) {
        System.out.println(persentCount(10000, 0.1, 1000, 12));
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
