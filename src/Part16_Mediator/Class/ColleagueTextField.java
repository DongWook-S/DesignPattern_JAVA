package Part16_Mediator.Class;

import Part16_Mediator.Interface.Colleague;
import Part16_Mediator.Interface.Mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/*
 *  textValueChanged  메소드로 파악하고 싶기 때문에 만듬.
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    // Mediator 를 설정한다.
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // mediator 에서 활성/비활성을 지시한다.
    @Override
    public void setColleagueEnable(boolean enabled) {
        setEnabled(enabled);
        // 활성/비활성에 맞게 배경색을 변경한다.
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        // 문자열이 바뀌면 Mediator에 알린다.
        mediator.colleagueChanged();
    }
}
