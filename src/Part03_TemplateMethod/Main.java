package Part03_TemplateMethod;

import Part03_TemplateMethod.Class.AbstractDisplay;
import Part03_TemplateMethod.Class.CharDisplay;
import Part03_TemplateMethod.Class.StringDisplay;

public class Main {
    public static void main(String[] args) {
        // 'H' 를 가진 CharDisplay 인스턴스를 하나 만든다
        AbstractDisplay d1 = new CharDisplay('H');

        // "Hello, world." 를 가진 StringDisplay 인스턴스를 하나 만든다.
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        /*
         *  d1, d2 모두 같은 AbstractDisplay 의 하위 클래스의 인스턴스 이므로
         *  상속한 display 메소드를 호출할 수 있다.
         *  실제 동작은 CharDisplay 나 StringDisplay 클래스에서 정해진다.
         */
        d1.display();
        d2.display();
    }
}
