package deepsource.demo.designpatterns.decorator;

public class V8Package extends FeatureDecorator {

  public V8Package(Vehicle vehicle) {
    super(vehicle);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", 325 HP V8";
  }

  @Override
  public Integer getCost() {
    return super.getCost() + 1000;
  }

}
