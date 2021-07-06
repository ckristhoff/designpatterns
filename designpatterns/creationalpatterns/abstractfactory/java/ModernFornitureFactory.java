package designpatterns.creationalpatterns.abstractfactory.java;

public class ModernFornitureFactory implements IFornitureFactory {
  @Override
  public IChair createChair() {
    return new ModernChair();
  }
}
