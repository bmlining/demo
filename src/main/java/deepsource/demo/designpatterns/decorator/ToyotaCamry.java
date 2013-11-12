package deepsource.demo.designpatterns.decorator;

public class ToyotaCamry extends Vehicle {
  @Override
  public String getDescription() {
    return "Toyota Camry";
  }

  @Override
  public Integer getCost() {
    return 18000;
  }
}
