package whyNotPractice;
/**
 * Class PercentCalculator with property <b>user</b> and <b>bank</b>
 * @autor FaiFai
 * @version 1.0
 */
public class PercentCalculator {
    /** Object of class User - user*/
    User user;
    /** Object of class Bank - bank*/
    Bank bank;

    /**
     * Method calculate user's deposit , and check what tariff user want with tariff witch bank can offed
     * @param user
     * @return
     */
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
