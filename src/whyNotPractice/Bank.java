package whyNotPractice;

import java.io.IOException;
/**
 * Class Bank with property <b>persent</b> and <b>month</b>
 * @autor FaiFai
 * @version 1.0
 */
public class Bank {
    /** Field persent*/
    private final double persent;
    /** Field month*/
    private final int month;

    /**
     *Constructor - creating new object
     * @see Bank#Bank(double, int)
     * @param persent
     * @param month
     */
    public Bank(double persent, int month) {
        this.persent = persent;
        this.month = month;
    }
    /** Function receipt field value {@link Bank#persent}*/
    public double getPersent() {
        return persent;
    }
    /** Function receipt field value {@link Bank#month}*/
    public int getMonth() {
        return month;
    }
}
