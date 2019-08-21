package whyNotPractice;

public class Main {
    public static void main(String[] args) {
      persentCount();
    }
    public static double persentCount(){
        double startCapital = 10_000.0;
        int additionalAmount = 1000;
        double persent = 0.1;
        double month = 12;
        double resOfSub = 0;
        for (int i = 0; i < 11; i++) {
            double persentCalculating = (startCapital * persent) / month;
            resOfSub += persentCalculating;
            startCapital += additionalAmount ;
        }
        System.out.println("resOfSub-" + resOfSub);
        System.out.println("deposit-" + startCapital);
        System.out.println("you'll get in the end of year -" + (resOfSub + startCapital));

        // Денис какашка
        return resOfSub + startCapital;
    }
}
