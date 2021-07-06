package designpatterns.creationalpatterns.singleton.java;

public class Main {
  public static void main(String[] args) {
    // constructor ilegal
    // SingleObject object = new SingleObject();

    // recuperar un objeto
    Singleton object = Singleton.getInstance();

    object.showMessage();
  }
}
