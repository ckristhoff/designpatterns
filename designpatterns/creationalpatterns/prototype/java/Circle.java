package designpatterns.creationalpatterns.prototype.java;

public class Circle extends AShape {
  public Circle(){
    type = "Circle";
  }

  @Override
  public void draw() {
    System.out.println("Inside Circle::draw() method.");
  }
}
