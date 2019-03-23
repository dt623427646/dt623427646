package java.singleton.hungry;

public class HungryStaticSingleton {
    private static final HungryStaticSingleton singleton;

    static {
        singleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return singleton;
    }
}
