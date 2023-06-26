package Part08_AbstractFactory.Factory;

/*
 *  Link 와 Tray 를 동일시 하기 위한 클래스
 */

public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
