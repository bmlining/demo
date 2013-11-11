package deepsource.demo.designpatterns.strategy;

public class BoxingBehavior implements FightingBehavior {

  @Override
  public STRIKE_TYPE doFight() {
    return STRIKE_TYPE.PUNCH;
  }

}
