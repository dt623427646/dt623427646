package java.singleton.lazy;

public class LazyDoubleCheckSingleton {
    // 保证对象可见性，防止该对象初始化后，后面的线程没有读取到最新的值
    private volatile static LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
