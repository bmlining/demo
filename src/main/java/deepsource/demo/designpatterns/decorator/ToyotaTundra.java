package deepsource.demo.designpatterns.decorator;

public class ToyotaTundra extends Vehicle {

  @Override
  public String getDescription() {

    return "Toyota Tundra";
  }

  @Override
  public Integer getCost() {
    return 20000;
  }

}
