package com.gupao.proxy.dynamicproxy.cglibproxy;

import com.gupao.proxy.Person;
import com.gupao.proxy.dynamicproxy.jdkproxy.Girl;
import com.gupao.proxy.dynamicproxy.jdkproxy.JDKMeipo;

import java.lang.reflect.Method;

/**
 * Created by Tom on 2019/3/10.
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        try {

            Person instance = (Person) new CglibMeipo().getInstance(Girl.class);
            instance.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
