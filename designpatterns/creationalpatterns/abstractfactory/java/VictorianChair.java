package designpatterns.creationalpatterns.abstractfactory.java;

public class VictorianChair implements IChair {
  @Override
  public boolean hasLegs() {
    return true;
  }

  @Override
  public void sitOn() {
    System.out.println("Sentando en una silla victoriana...");
  }
}
