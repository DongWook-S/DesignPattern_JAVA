package Part08_AbstractFactory.DivFactory;

import Part08_AbstractFactory.Factory.Factory;
import Part08_AbstractFactory.Factory.Link;
import Part08_AbstractFactory.Factory.Page;
import Part08_AbstractFactory.Factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}
