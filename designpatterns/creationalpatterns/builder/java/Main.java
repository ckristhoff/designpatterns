package designpatterns.creationalpatterns.builder.java;

public class Main {
  public static void main(String[] args) {
    CarBuilderDirector director = new CarBuilderDirector();
    CarBuilder constructor = new CarBuilder();
    director.constructSPortCar(constructor);

    Car carro = constructor.getResult();

    carro.getEngine().start();
  }
}
