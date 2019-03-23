package singleton.lazy;

public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {
    }

    public static LazyInnerClassSingleton getInstance() {
        return InnerSingletonHold.singleton;
    }

    static class InnerSingletonHold {
        private static final LazyInnerClassSingleton singleton = new LazyInnerClassSingleton();
    }
}
