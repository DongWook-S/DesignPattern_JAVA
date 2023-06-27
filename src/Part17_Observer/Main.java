package Part17_Observer;

import Part17_Observer.Class.DigitObserver;
import Part17_Observer.Class.GraphObserver;
import Part17_Observer.Class.NumberGenerator;
import Part17_Observer.Class.RandomNumberGenerator;
import Part17_Observer.Interface.Observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
