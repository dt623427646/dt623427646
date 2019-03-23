package gupao.prototype;

public class Client {
    public static Person getPerson(Person person) {
        Person person1 = new Person();
        person1.setName(person.getName());
        person1.setAge(person.getAge());
        person1.setCar(person.getCar());
        return person1;
    }

    public static Person ClonePerson(Person person) {
        Person person1 = null;
        try {
            person1 = person.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return person1;
    }
}
