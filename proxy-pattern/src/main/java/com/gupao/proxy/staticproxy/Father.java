package com.gupao.proxy.staticproxy;

import com.gupao.proxy.Person;

public class Father implements Person {

    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    @Override
    public void findLove() {
        before();
        person.findLove();
        after();
    }

    private void after() {
        System.out.println("早恋不好，儿咋");
    }

    private void before() {
        System.out.println("你想干啥子，儿咋");
    }
}
