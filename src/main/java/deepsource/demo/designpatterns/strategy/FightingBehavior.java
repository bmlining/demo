package deepsource.demo.designpatterns.strategy;

/**
 * Define the interface to all behaviors for a fighting style. FOr this example,
 * we'll keep it really simple.
 * 
 * @author brian
 */
public interface FightingBehavior {
  public static enum STRIKE_TYPE {
    KICK, PUNCH, ELBOW, CHOP, HEAD_BUTT
  };

  public STRIKE_TYPE doFight();
}
