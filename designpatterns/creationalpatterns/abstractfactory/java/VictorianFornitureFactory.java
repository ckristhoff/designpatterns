package designpatterns.creationalpatterns.abstractfactory.java;

public class VictorianFornitureFactory implements IFornitureFactory {
  @Override
  public IChair createChair() {
    return new VictorianChair();
  }
}
