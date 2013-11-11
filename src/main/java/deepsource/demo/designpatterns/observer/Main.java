package deepsource.demo.designpatterns.observer;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) throws Exception {
    Sensor s = new Sensor("test");
    SensorDisplay sd = new SensorDisplay();

    s.addObserver(sd);

    List<Integer> sensorReadings = Arrays.asList(3, -1, 9, 12, -3 - 2);
    for (Integer sensorReading : sensorReadings) {
      s.updateSensor(sensorReading);
      Thread.sleep(500);
    }
  }
}
