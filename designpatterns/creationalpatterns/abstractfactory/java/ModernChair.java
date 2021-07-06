package designpatterns.creationalpatterns.abstractfactory.java;

public class ModernChair implements IChair {
  @Override
  public boolean hasLegs() {
    return false;
  }

  @Override
  public void sitOn() {
    System.out.println("Sentarse en una silla moderna...");
  }
}
