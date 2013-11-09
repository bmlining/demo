package deepsource.demo.designpatterns.strategy;

public class MBison extends AbstractFighter {
  public MBison() {
    super("M Bison", new StreetFightingBehavior());
  }
}
