package Part13_Visitor.Class;

/*
 *  '방문자'를 나타내는 추상 클래스
 */

public abstract class Visitor {
    protected abstract void visit(File file);
    protected abstract void visit(Directory directory);
}
