package Part15_Facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 *  PageMaker 클래는 Database 클래스와 HtmlWriter 클래스를 조합하여 지정한 사용자의 웹페이지를 만듬.
 */
public class PageMaker {
    private PageMaker() {

    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title(username + "'s web page");
            writer.paragraph("Welcome to " + username + "'s web page!");
            writer.paragraph("Nice to meet you!");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
