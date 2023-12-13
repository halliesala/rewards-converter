public class RewardValue {
    private double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.cashValue = MILES_TO_CASH_CONVERSION_RATE * milesValue;
    }

    // RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
    public double getCashValue() {
        return this.cashValue;
    }

    // RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
    public int getMilesValue() {
        return (int) (this.cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // RewardValue must convert from miles to cash at a rate of 0.0035.
    // cash = miles * 0.0035
    // miles = floor(cash / 0.0035)

}
