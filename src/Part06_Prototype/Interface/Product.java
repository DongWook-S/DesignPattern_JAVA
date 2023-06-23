package Part06_Prototype.Interface;

/*
 *  이 인터페이스를 구현하는 클래스의 인스턴스는 clone 메소드를 사용해서 자동으로 복제
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy();
}
