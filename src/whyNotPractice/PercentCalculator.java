package whyNotPractice;

public class PercentCalculator {
    User user;
    Bank bank;

    public  double calculate( User user) {
        double resOfSub = 0;
        if(user.getPersent() != bank.getPersent() && user.getNumOfMonth() != bank.getMonth()) {
            throw new IllegalArgumentException("Sorry this service not supported ");
        }

        for (int i = 0; i < bank.getMonth() - 1; i++) {
            double persentCalculating = (user.getStartCapital() * user.getPersent()) / user.getNumOfMonth();
            resOfSub += persentCalculating;
            user.setStartCapital(user.getAdditionalAmount()+user.getStartCapital());
        }
        return resOfSub + user.getStartCapital();
    }
}
