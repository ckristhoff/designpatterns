package designpatterns.creationalpatterns.builder.java;

public class Car {
  private CarType carType;
  private int seats;
  private Engine engine;

  public Car(CarType carType, int seats, Engine engine) {
    this.carType = carType;
    this.seats = seats;
    this.engine = engine;
  }

  public CarType getCarType() {
    return carType;
  }

  public Engine getEngine() {
    return engine;
  }

  public int getSeats() {
    return seats;
  }
}
