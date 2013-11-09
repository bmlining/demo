package deepsource.demo.designpatterns.strategy;

public class StreetFightingBehavior implements FightingBehavior {

  @Override
  public STRIKE_TYPE doFight() {
    System.out.println(" Street Fight!");
    return STRIKE_TYPE.HEAD_BUTT;
  }

}
