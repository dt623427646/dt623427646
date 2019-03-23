package factory.factoryMethod;

import factory.simpleFactory.Car;

public class FactoryMethodTest {
    public static void main(String[] args) {
        BenzDriver driver = new BenzDriver();
        Car car = driver.creatCar();
        car.drive();
    }
}
