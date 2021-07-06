package designpatterns.creationalpatterns.builder.java;

public class Engine {
  private int cilinders;

  public Engine(int cilinders) {
    this.cilinders = cilinders;
  }

  public void start() {
    System.out.println("Motor encendido.... rum rum rum");
  }

  public void halt() {
    System.out.println("Motor apagado....");
  }
}
