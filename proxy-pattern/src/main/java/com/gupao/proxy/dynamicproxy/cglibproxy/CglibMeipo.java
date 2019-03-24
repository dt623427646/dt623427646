package com.gupao.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Tom on 2019/3/10.
 */
public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> target) throws Exception{
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o, objects);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是媒婆，美女你想要啥子样式的");
        System.out.println("配对。。。。。。");
    }

    private void after(){
        System.out.println("美女，你看哈要得不");
    }
}
