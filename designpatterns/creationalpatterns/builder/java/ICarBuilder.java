package designpatterns.creationalpatterns.builder.java;

public interface ICarBuilder {
  public void setSeats(int seats);
  public void setEngine(Engine engine);
  public void setCarType(CarType carType);
}
