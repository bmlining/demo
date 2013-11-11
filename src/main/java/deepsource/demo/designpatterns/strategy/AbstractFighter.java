package deepsource.demo.designpatterns.strategy;

import deepsource.demo.designpatterns.strategy.FightingBehavior.STRIKE_TYPE;

/**
 * Base features common to every fighter
 * 
 * @author brian
 */
public abstract class AbstractFighter implements Fighter {
  private String           name;
  private FightingBehavior fb;

  /**
   * @param name
   *          name of the fighter
   * @param fb
   *          the {@link FightingBehavior} of this fighter
   */
  public AbstractFighter(String name, FightingBehavior fb) {
    this.name = name;
    this.fb = fb;
  }

  /**
   * @see deepsource.demo.designpatterns.strategy.Fighter#getName()
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * @see deepsource.demo.designpatterns.strategy.Fighter#fight()
   */
  @Override
  public STRIKE_TYPE fight() {
    return fb.doFight();
  }

  @Override
  public String toString() {
    return "Fighter { name: " + this.name + ", StrikeType: " + this.fb.doFight() + " }";
  }
}
