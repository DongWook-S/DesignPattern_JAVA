package Part14_Chain_of_Responsibility.Class;

/*
 *  limit 로 지정한 번호 미만의 문제를 해결하는 클래스.
 */
public class LimitSupport extends Support {
    private int limit;  // 이 번호 미만이면 해결할 수 있다.

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        }
        else {
            return false;
        }
    }
}
