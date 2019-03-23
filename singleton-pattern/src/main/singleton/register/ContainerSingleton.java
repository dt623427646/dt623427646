package singleton.register;

import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private static ConcurrentHashMap<String, Object> ioc = new ConcurrentHashMap();

    private ContainerSingleton() {
    }

    public static Object getInstance(String className) {

        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object o = null;
                try {
                    o = Class.forName(className).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ioc.put(className, o);
                return o;
            } else {
                return ioc.get(className);
            }
        }
    }
}
