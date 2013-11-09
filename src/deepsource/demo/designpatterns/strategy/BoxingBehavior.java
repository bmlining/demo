package deepsource.demo.designpatterns.strategy;

public class BoxingBehavior implements FightingBehavior {

  @Override
  public STRIKE_TYPE doFight() {
    System.out.println(" Boxing Fight!");
    return STRIKE_TYPE.PUNCH;
  }

}
