package Part08_AbstractFactory.Factory;

/*
 *  HTML 하이퍼링크를 추상적으로 표현한 클래스
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
