package com.gupao.proxy.staticproxy;

public class StaticproxyTest {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
