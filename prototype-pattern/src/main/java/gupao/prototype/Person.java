package gupao.prototype;

import gupao.prototype.Car;

import java.io.*;

public class Person implements Cloneable,Serializable {
    private String name;
    private int age;
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return deepClone(this);
    }

    private Person deepClone(Person person) {
        try {
            ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(arrayOutputStream);
            objectOutputStream.writeObject(person);

            ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(arrayInputStream);
            Person o = (Person) objectInputStream.readObject();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
