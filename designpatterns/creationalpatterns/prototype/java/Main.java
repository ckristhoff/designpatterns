package designpatterns.creationalpatterns.prototype.java;

public class Main {
  public static void main(String[] args) {
    ShapeCache.loadCache();

    AShape clonedShape = (AShape) ShapeCache.getShape("1");
    System.out.println("Shape : " + clonedShape.getType());		

    AShape clonedShape2 = (AShape) ShapeCache.getShape("2");
    System.out.println("Shape : " + clonedShape2.getType());		

    AShape clonedShape3 = (AShape) ShapeCache.getShape("3");
    System.out.println("Shape : " + clonedShape3.getType());	
  }
}
