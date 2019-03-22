package factory.factoryMethod;

import factory.simpleFactory.Benz;
import factory.simpleFactory.Car;

public class BenzDriver implements Driver{
    @Override
    public Car creatCar() {
        return new Benz();
    }
}
