package factory.factoryMethod;

import factory.simpleFactory.Bmw;
import factory.simpleFactory.Car;

public class BmwDriver implements Driver{
    @Override
    public Car creatCar() {
        return new Bmw();
    }
}
