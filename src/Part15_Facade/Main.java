package Part15_Facade;

import Part15_Facade.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("test@example.com", "welcome.html");
    }
}
