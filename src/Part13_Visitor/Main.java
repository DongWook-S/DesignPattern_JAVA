package Part13_Visitor;

import Part13_Visitor.Class.Directory;
import Part13_Visitor.Class.File;
import Part13_Visitor.Class.ListVisitor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");
        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        bindir.add(new File("vi", 10000));
        bindir.add(new File("lates", 20000));
        rootdir.accept(new ListVisitor());
        System.out.println();

        System.out.println("Making user entries...");
        Directory youngjin = new Directory("youngjin");
        Directory gildong = new Directory("gildong");
        Directory dojuin = new Directory("dojuin");
        usrdir.add(youngjin);
        usrdir.add(gildong);
        usrdir.add(dojuin);
        youngjin.add(new File("diary.html", 100));
        youngjin.add(new File("Composite.java", 200));
        gildong.add(new File("memo.text", 300));
        dojuin.add(new File("game.doc", 400));
        dojuin.add(new File("junk.mail", 500));
        rootdir.accept(new ListVisitor());
    }
}
