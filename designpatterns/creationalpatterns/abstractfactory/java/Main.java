package designpatterns.creationalpatterns.abstractfactory.java;

public class Main {
  public static void main(String[] args) {
    IFornitureFactory factory;

    // crear muebles victorianos
    factory = new VictorianFornitureFactory(); // inicialización de la fábrica
    IChair victorianChair = factory.createChair();
    victorianChair.sitOn();

    // crear muebles modernos
    factory = new ModernFornitureFactory();
    IChair modernChair = factory.createChair();
    modernChair.sitOn();
  }
}
