package com.gupao.proxy.staticproxy;

import com.gupao.proxy.Person;

public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("我要耍朋友");
    }
}
