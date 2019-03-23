package factory.abstFactory;

public class BenzSportCar implements BenzCar{
    @Override
    public void drive() {
        System.out.println("BenzSportCar");
    }
}
