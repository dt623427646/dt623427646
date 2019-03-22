package factory.abstFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        CarDriverFactory carDriverFactory = new CarDriverFactory();
        AudiCar audiCar = carDriverFactory.creatAudiCar();
        audiCar.drive();
    }
}
