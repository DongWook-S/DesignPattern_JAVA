package Part04_FactoryMethod.framework;

/*
 *  제품을 표현하는 클래스
 *  구체적인 use 의 구현은 모두 Product 의 하위 클래스에 맡기고 있음
 *  이 프레임워크에서는 '무엇이든 use 할 수 있는(사용할 수 있는) 것'을 제품으로 규정
 */
public abstract class Product {
    public abstract void use();
}
