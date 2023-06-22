package Iterator.Interface;

import java.util.Iterator;

/*
 *  Iterator<E> : 처리를 반복할 대상을 나타내는 것.
 *  이 인터페이스를 구현하는 클래스는 배열처럼 '뭔가 많이 모여 있는 것' 이른바 '집합체'가 된다.
 *  Iterator<E> 에서 E 는 타입 파라미터라는 것. 여기에 '모여 있는 것' 을 나타내는 타입을 지정.
 */
public interface Iterable<E> {
    public abstract Iterator<E> iterator();
}
