package Part04_FactoryMethod;

import Part04_FactoryMethod.Class.IDCardFactory;
import Part04_FactoryMethod.Framework.Factory;
import Part04_FactoryMethod.Framework.Product;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");

        card1.use();
        card2.use();
        card3.use();
    }
}
