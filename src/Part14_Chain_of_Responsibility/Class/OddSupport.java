package Part14_Chain_of_Responsibility.Class;

/*
 *  홀수 번호 문제를 해결하는 클래스
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
