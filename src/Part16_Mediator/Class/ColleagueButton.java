package Part16_Mediator.Class;

import Part16_Mediator.Interface.Colleague;
import Part16_Mediator.Interface.Mediator;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    // Mediator 를 설정한다.
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator 에서 활성/비활성을 지시한다.
    @Override
    public void setColleagueEnable(boolean enable) {
        setEnabled(enable);
    }
}
