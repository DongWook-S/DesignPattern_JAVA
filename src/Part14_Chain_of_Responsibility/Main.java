package Part14_Chain_of_Responsibility;

import Part14_Chain_of_Responsibility.Class.*;

/*
 *  처음에는 Bob 이 열심히 하고 있지만, 해결할 수 없게 되자 Diana 가 등장한다.
 *  실행 결과에는 Alice 가 전혀 등장하지 않는다. Alice 는 모든 문제를 다 떠넘기기 때문이다.
 *  트러블 번호가 300 이상 되면, 이 프로그램에서 LimitSupport 의 인스턴스(Bob, Diana, Fred) 는 아무도 처리할 수 없게 된다.
 *  단, 300 이상이라도 홀수 번호 트러블은 OddSupport 의 인스턴스인 Elmo 가 처리해준다.
 *  SpecialSupport 의 인스턴스인 Charlie 는 트러블 번호 429번 해결 전문가로 실행 결과에서 단 한 번 얼굴을 내밀었음.
 */
public class Main {
    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);

        // 사슬 형성
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        // 다양한 트러블 발생
        for (int i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i));
        }
    }
}
