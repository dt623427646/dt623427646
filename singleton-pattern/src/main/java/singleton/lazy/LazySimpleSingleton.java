package java.singleton.lazy;

public class LazySimpleSingleton {
    private static LazySimpleSingleton singleton = null;

    private LazySimpleSingleton() {
    }

    public LazySimpleSingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySimpleSingleton();
        }
        return singleton;
    }
}
