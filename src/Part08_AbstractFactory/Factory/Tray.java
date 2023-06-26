package Part08_AbstractFactory.Factory;

import java.util.ArrayList;
import java.util.List;

/*
 *  복수의 Link나 Tray 를 모아서 한데 묶는 클래스.
 *  Tray 는 쟁반을 뜻함.
 */
public abstract class Tray extends Item {
    protected List<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
