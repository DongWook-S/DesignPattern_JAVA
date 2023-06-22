package Adapter.ex01;

import Adapter.ex01.Class.PrintBanner;
import Adapter.ex01.Interface.Print;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
