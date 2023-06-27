package Part10_Strategy.Class;

import Part10_Strategy.Enum.Hand;
import Part10_Strategy.Interface.Strategy;

import java.util.Random;

public class ProStrategy implements Strategy {
    private Random random;
    private int preHandValue = 0;
    private int currentHandValue = 0;
    private int[][] history = {
            { 1, 1, 1, },
            { 1, 1, 1, },
            { 1, 1, 1, },
    };

    public ProStrategy (int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handvalue;
        if (bet < history[currentHandValue][0]) {
            handvalue = 0;
        }
        else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1;
        }
        else {
            handvalue = 2;
        }
        preHandValue = currentHandValue;
        currentHandValue = handvalue;

        return Hand.getHand(handvalue);
    }

    private int getSum(int handvalue) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[preHandValue][currentHandValue]++;
        }
        else {
            history[preHandValue][(currentHandValue + 1) % 3]++;
            history[preHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
