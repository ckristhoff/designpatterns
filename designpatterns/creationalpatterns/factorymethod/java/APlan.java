package designpatterns.creationalpatterns.factorymethod.java;

public abstract class APlan {
  protected double rate;

  abstract void getRate();

  public void calculateBill(int units) {
    System.out.println(units * rate);
  }
}
