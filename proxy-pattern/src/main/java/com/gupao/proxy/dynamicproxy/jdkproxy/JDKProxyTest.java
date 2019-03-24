package com.gupao.proxy.dynamicproxy.jdkproxy;

import com.gupao.proxy.Person;

import java.lang.reflect.Method;

/**
 * Created by Tom on 2019/3/10.
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {

//            Person person = (Person) new JDKMeipo().getInstance(new Girl());
//            person.findLove();

            Object obj = new JDKMeipo().getInstance(new Girl());
            Method findLove = obj.getClass().getMethod("findLove", null);
            findLove.invoke(obj,null);

        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
