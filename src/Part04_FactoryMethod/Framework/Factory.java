package Part04_FactoryMethod.Framework;

public abstract class Factory {

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    // 제품을 만드는 메소드
    protected abstract Product createProduct(String owner);
    // 만든 제품을 추상 메소드로 등록
    protected abstract void registerProduct(Product product);
}
