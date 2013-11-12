package deepsource.demo.designpatterns.decorator;

public class LeatherPackage extends FeatureDecorator {

  public LeatherPackage(Vehicle vehicle) {
    super(vehicle);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Leather Seats";
  }

  @Override
  public Integer getCost() {
    return super.getCost() + 2000;
  }

}
