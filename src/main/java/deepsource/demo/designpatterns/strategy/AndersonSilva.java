package deepsource.demo.designpatterns.strategy;

public class AndersonSilva extends AbstractFighter {
  public AndersonSilva() {
    super("Anderson Silva", new MuayThaiBehavior());
  }
}
