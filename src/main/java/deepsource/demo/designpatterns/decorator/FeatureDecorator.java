package deepsource.demo.designpatterns.decorator;

public abstract class FeatureDecorator extends Vehicle {
  private Vehicle vehicle;

  public FeatureDecorator(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public String getDescription() {
    return vehicle.getDescription();
  }

  public Integer getCost() {
    return vehicle.getCost();
  }
}
