package factory.abstFactory;

public class AudiBusCar implements AudiCar{
    @Override
    public void drive() {
        System.out.println("AudiBusCar");
    }
}
