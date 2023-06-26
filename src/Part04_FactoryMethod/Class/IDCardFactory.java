package Part04_FactoryMethod.Class;

import Part04_FactoryMethod.framework.Factory;
import Part04_FactoryMethod.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록 했습니다.");
    }
}
