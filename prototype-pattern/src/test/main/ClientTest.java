package main;

import gupao.prototype.Car;
import gupao.prototype.Client;
import gupao.prototype.Person;

public class ClientTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("dengtao");
        person.setAge(18);
        person.setCar(new Car());

        //简单工厂
        Person person1 = Client.getPerson(person);
        System.out.println(person1.getCar() == person.getCar());

        //深拷贝
        Person person2 = Client.ClonePerson(person);
        System.out.println(person2.getCar() == person.getCar());

    }
}
