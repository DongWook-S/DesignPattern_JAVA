package Part16_Mediator.Interface;

public interface Colleague {
    // Mediator 를 설정한다.
    public abstract void setMediator(Mediator mediator);

    // Mediator 에서 활성/비활성을 지시한다.
    public abstract void setColleagueEnable(boolean enable);
}
