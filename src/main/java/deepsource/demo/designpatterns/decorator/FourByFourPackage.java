package deepsource.demo.designpatterns.decorator;

public class FourByFourPackage extends FeatureDecorator {

  public FourByFourPackage(Vehicle vehicle) {
    super(vehicle);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", 4-Wheel Drive";
  }

  @Override
  public Integer getCost() {
    return super.getCost() + 6000;
  }

}
