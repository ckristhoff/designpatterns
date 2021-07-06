package designpatterns.creationalpatterns.factorymethod.java;

public class CommercialPlan extends APlan{
  @Override
  public void getRate(){
    rate = 7.50;
  }
}
