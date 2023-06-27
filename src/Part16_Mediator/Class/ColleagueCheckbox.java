package Part16_Mediator.Class;

import Part16_Mediator.Interface.Colleague;
import Part16_Mediator.Interface.Mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;

    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
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

    @Override
    public void itemStateChanged(ItemEvent e) {
        // 상태가 변화하면 Mediator 에 알린다.
        mediator.colleagueChanged();
    }
}
