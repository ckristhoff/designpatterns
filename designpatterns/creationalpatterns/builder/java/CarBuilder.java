package designpatterns.creationalpatterns.builder.java;

public class CarBuilder implements ICarBuilder {
  private int seats;
  private Engine engine;
  private CarType carType;

  @Override
  public void setSeats(int seats) {
    this.seats = seats;
  }

  @Override
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void setCarType(CarType carType) {
    this.carType = carType;
  }
  

  public Car getResult() {
    // como se debe crear un carro...
    return new Car(carType, seats, engine);
  }
}
