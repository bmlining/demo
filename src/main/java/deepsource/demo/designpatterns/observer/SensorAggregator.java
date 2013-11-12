package deepsource.demo.designpatterns.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class SensorAggregator implements Observer {
  public List<Number> sensorReadings = new LinkedList<>();
  
  @Override
  public void update(Observable o, Object arg) {
    if(o instanceof Sensor && arg instanceof Number) {
      Sensor s = (Sensor) o;
      Number n = (Number) arg;
      sensorReadings.add(n);
    }
  }

  public List<Number> getSensorReadings() {
    return sensorReadings;
  }
}
