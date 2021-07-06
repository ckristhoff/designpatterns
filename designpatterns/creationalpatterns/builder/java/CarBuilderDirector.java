package designpatterns.creationalpatterns.builder.java;

public class CarBuilderDirector {
  public void constructSPortCar(ICarBuilder builder) {
    builder.setCarType(CarType.SPORT_CAR);
    builder.setSeats(2);
    builder.setEngine(new Engine(16));
  }

  public void constructCityCar(ICarBuilder builder) {
    builder.setCarType(CarType.CITY_CAR);
    builder.setSeats(4);
    builder.setEngine(new Engine(4));
  }
}
