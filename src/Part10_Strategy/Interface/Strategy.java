package Part10_Strategy.Interface;

import Part10_Strategy.Enum.Hand;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
