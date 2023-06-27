package Part17_Observer.Interface;

import Part17_Observer.Class.NumberGenerator;

public interface Observer {
    public abstract void update(NumberGenerator generator);
}
