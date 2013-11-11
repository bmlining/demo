package deepsource.demo.designpatterns.strategy;

import static org.junit.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import deepsource.demo.designpatterns.strategy.FightingBehavior.STRIKE_TYPE;

public class TestFighters {
  private Log log = LogFactory.getLog(TestFighters.class);

  @Test
  public void testStrategyPattern() {
    Fighter testFighter;

    testFighter = new AndersonSilva();
    assertEquals(STRIKE_TYPE.KICK, testFighter.fight());
    log.info(testFighter);
    
    testFighter = new MBison();
    assertEquals(STRIKE_TYPE.HEAD_BUTT, testFighter.fight());
    log.info(testFighter);
    
    testFighter = new MuhammadAli();
    assertEquals(STRIKE_TYPE.PUNCH, testFighter.fight());
    log.info(testFighter);
  }

}
