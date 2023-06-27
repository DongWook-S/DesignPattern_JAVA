package Part16_Mediator.Interface;

public interface Mediator {
    // Colleague 를 생성한다.
    public abstract void createColleagues();

    // Colleague 의 상태가 변화했을 때 호출된다.
    public abstract void colleagueChanged();
}
