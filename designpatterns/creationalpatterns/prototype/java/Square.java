package designpatterns.creationalpatterns.prototype.java;

public class Square extends AShape {
  public Square(){
    type = "Square";
  }

  @Override
  public void draw() {
    System.out.println("Inside Square::draw() method.");
  }
}
