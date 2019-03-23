package java.singleton.hungry;

public class HungrySingleton {
    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public HungrySingleton getInstance() {
        return singleton;
    }
}
