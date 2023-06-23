package Part05_Singleton.Class;

public class Singleton {
    private static Singleton singleton = new Singleton();

    public Singleton() {
        System.out.println("인스턴스를 생성 했습니다.");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
