package deepsource.demo.designpatterns.strategy;

public class StreetFightingBehavior implements FightingBehavior {

  @Override
  public STRIKE_TYPE doFight() {
    return STRIKE_TYPE.HEAD_BUTT;
  }

}
