package whyNotPractice;

/**
 * Class User with property <b>persent</b>,<b>startCapital</b>,<b>numOfMonth</b>,<b>additionalAmount</b>
 * @autor FaiFai
 * @version 1.0
 */
public class User {
    /** Field persent*/
    private final double persent;
    /** Field startCapital*/
    private double startCapital;
    /** Field numOfMonth*/
    private final int numOfMonth;
    /** Field additionalAmount*/
    private final double additionalAmount;

    /**
     *Constructor - creating new object
     * @see User#User(double, double, int, double)
     * @param persent
     * @param startCapital
     * @param numOfMonth
     * @param additionalAmount
     */
    public User(double persent, double startCapital, int numOfMonth, double additionalAmount) {
        this.persent = persent;
        this.startCapital = startCapital;
        this.numOfMonth = numOfMonth;
        this.additionalAmount = additionalAmount;
    }
    /** Function receipt field value {@link User#persent}*/
    public double getPersent() {
        return persent;
    }
    /** Function receipt field value {@link User#startCapital}*/
    public double getStartCapital() {
        return startCapital;
    }
    /** Function to set start capital value {@link User#startCapital}*/
    public void setStartCapital(double startCapital){
        this.startCapital = startCapital;
    }
    /** Function receipt field value {@link User#numOfMonth}*/
    public int getNumOfMonth() {
        return numOfMonth;
    }
    /** Function receipt field value {@link User#additionalAmount}*/
    public double getAdditionalAmount() {
        return additionalAmount;
    }
}
