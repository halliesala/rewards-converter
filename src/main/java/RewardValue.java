public class RewardValue {
    private double cashValue;
    private int milesValue;

    // RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (this.cashValue / 0.0035);
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = 0.0035 * this.milesValue;
    }

    // RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
    public double getCashValue() {
        return this.cashValue;
    }

    // RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
    public int getMilesValue() {
        return this.milesValue;
    }

    // RewardValue must convert from miles to cash at a rate of 0.0035.
    // cash = miles * 0.0035
    // miles = floor(cash / 0.0035)

}
