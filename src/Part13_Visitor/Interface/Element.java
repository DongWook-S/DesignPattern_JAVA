package Part13_Visitor.Interface;

import Part13_Visitor.Class.Visitor;

/*
 *  방문자를 받아들이는 인터페이스
 */

public interface Element {
    public abstract void accept(Visitor v);
}
