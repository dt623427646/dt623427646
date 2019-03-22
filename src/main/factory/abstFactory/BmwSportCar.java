package factory.abstFactory;

public class BmwSportCar implements BmwCar{
    @Override
    public void drive() {
        System.out.println("BmwSportCar");
    }
}
