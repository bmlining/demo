package deepsource.demo.designpatterns.observer;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestObserver {

  @Test
  public void testObserver() throws Exception {
    Sensor s = new Sensor("test");
    SensorDisplay sd = new SensorDisplay();
    s.addObserver(sd);

    SensorAggregator sa = new SensorAggregator();
    s.addObserver(sa);

    List<Integer> sensorReadings = Arrays.asList(3, -1, 9, 12, -3, -2);
    for (Integer sensorReading : sensorReadings) {
      s.updateSensor(sensorReading);
    }

    List<Number> aggregatedReadings = sa.getSensorReadings();
    Assert.assertArrayEquals(sensorReadings.toArray(),
        aggregatedReadings.toArray());
  }
}
