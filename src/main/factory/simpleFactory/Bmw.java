package factory.simpleFactory;

public class Bmw implements Car{
    @Override
    public void drive() {
        System.out.println("Drive BMW");
    }
}