package factory.abstFactory;

public class CarDriverFactory extends AbstarctDriver{

    @Override
    AudiCar creatAudiCar() {
        return new AudiBusCar();
    }

    @Override
    BenzCar creatBenzCar() {
        return new BenzBusCar();
    }

    @Override
    BmwCar creatBmwCar() {
        return new BmwSportCar();
    }
}
