package Part12_Decorator.Class;

/*
 *  '장식틀'을 나타내는 추상 클래스
 *  상속에 의해 장식틀은 내용물과 동일한 메소드를 갖게 된다.
 */
public abstract class Border extends Display {
    protected Display display;          // 이 장식틀이 감싸는 '내용물'

    public Border(Display display) {    // 인스턴스 생성 시 '내용물'을 인수로 지정
        this.display = display;
    }
}
