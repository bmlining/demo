package deepsource.demo.designpatterns.strategy;

public class MuayThaiBehavior implements FightingBehavior {

  @Override
  public STRIKE_TYPE doFight() {
    return STRIKE_TYPE.KICK;
  }

}
