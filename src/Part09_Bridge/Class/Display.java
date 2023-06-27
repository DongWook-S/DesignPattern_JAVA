package Part09_Bridge.Class;

/*
 *  추상적인 '무엇인가'를 표시하는 것. '기능의 클래스 계층' 최상위에 있는 클래스
 */
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
