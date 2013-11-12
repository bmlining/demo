package deepsource.demo.designpatterns.decorator;

public class DvdPackage extends FeatureDecorator {

  public DvdPackage(Vehicle vehicle) {
    super(vehicle);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Dvd Player";
  }

  @Override
  public Integer getCost() {
    return super.getCost() + 1000;
  }

}
