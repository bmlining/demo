package deepsource.demo.designpatterns.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import deepsource.demo.designpatterns.strategy.FightingBehavior.STRIKE_TYPE;

public class TestFighters {

  @Test
  public void testStrategyPattern() {
    Fighter testFighter;

    testFighter = new AndersonSilva();
    assertEquals(STRIKE_TYPE.KICK, testFighter.fight());

    testFighter = new MBison();
    assertEquals(STRIKE_TYPE.HEAD_BUTT, testFighter.fight());
    
    testFighter = new MuhammadAli();
    assertEquals(STRIKE_TYPE.PUNCH, testFighter.fight());
  }

}
