import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        int ans = 28571; // floor(cashValue / 0.0035);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(ans, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 1000;
        double ans = 3.5; // milesValue * 0.0035
        var rewardValue = new RewardValue(milesValue);
        System.out.println(rewardValue.getCashValue());
        assertEquals(ans, rewardValue.getCashValue(), 0.0001);
    }
}
