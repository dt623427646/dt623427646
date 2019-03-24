package com.gupao.proxy.dynamicproxy.jdkproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Tom on 2019/3/10.
 */
public class JDKMeipo implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(target, args);
        after();
        return o;
    }

    private void before(){
        System.out.println("我是媒婆，美女你想要啥子样式的");
        System.out.println("配对。。。。。。");
    }

    private void after(){
        System.out.println("美女，你看哈要得不");
    }
}
