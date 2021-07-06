package designpatterns.creationalpatterns.prototype.java;

public class Rectangle extends AShape {
  public Rectangle(){
    type = "Rectangle";
  }

  @Override
  public void draw() {
    System.out.println("Inside Rectangle::draw() method.");
  }
}
