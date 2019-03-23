package factory.simpleFactory;

public class SimpleCarFactory {
    public Car creatCar(String name){
        Car car = null;
        if ("benz".equals(name)){
            car = new Benz();
        }else if ("bwm".equals(name)){
            car =  new Bmw();
        }
        return car;
    }
}
