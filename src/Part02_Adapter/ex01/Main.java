package Part02_Adapter.ex01;

import Part02_Adapter.ex01.Class.PrintBanner;
import Part02_Adapter.ex01.Interface.Print;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
