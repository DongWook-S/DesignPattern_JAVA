package Part08_AbstractFactory.ListFactory;

import Part08_AbstractFactory.Factory.Factory;
import Part08_AbstractFactory.Factory.Link;
import Part08_AbstractFactory.Factory.Page;
import Part08_AbstractFactory.Factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
