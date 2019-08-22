package whyNotPractice;

public class User {
    private final double persent;
    private final double startCapital;
    private final int numOfMonth;
    private final double additionalAmount;

    public User(double persent, double startCapital, int numOfMonth, double additionalAmount) {
        this.persent = persent;
        this.startCapital = startCapital;
        this.numOfMonth = numOfMonth;
        this.additionalAmount = additionalAmount;
    }

    public double getPersent() {
        return persent;
    }

    public double getStartCapital() {
        return startCapital;
    }

    public int getNumOfMonth() {
        return numOfMonth;
    }

    public double getAdditionalAmount() {
        return additionalAmount;
    }
}
