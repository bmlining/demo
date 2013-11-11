package deepsource.demo.designpatterns.strategy;

import deepsource.demo.designpatterns.strategy.FightingBehavior.STRIKE_TYPE;

/**
 * Interface for a Fighter.
 * 
 * @see AbstractFighter
 * @author brian
 */
public interface Fighter {

  public abstract String getName();

  public abstract STRIKE_TYPE fight();

}