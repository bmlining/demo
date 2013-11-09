package deepsource.demo.designpatterns.strategy;

public class MuayThaiBehavior implements FightingBehavior {

  @Override
  public STRIKE_TYPE doFight() {
    System.out.println(" MuiTie Fight!");
    return STRIKE_TYPE.KICK;
  }

}
