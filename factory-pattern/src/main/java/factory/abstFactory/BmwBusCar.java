package factory.abstFactory;

public class BmwBusCar implements BmwCar{
    @Override
    public void drive() {
        System.out.println("BmwBusCar");
    }
}
