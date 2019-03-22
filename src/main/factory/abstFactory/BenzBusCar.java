package factory.abstFactory;

public class BenzBusCar implements BenzCar{
    @Override
    public void drive() {
        System.out.println("BenzBusCar");
    }
}
