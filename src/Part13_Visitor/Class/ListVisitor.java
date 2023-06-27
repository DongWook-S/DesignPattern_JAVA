package Part13_Visitor.Class;

public class ListVisitor extends Visitor {
    // 현재 주목하는 디렉터리 이름
    private String currentdir = "";

    // File 방문 시
    @Override
    protected void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    // Directory 방문 시
    @Override
    protected void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir += "/" + directory.getName();
        for (Entry entry : directory) {
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
