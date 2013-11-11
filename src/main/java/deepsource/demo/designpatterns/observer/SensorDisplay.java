package deepsource.demo.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class SensorDisplay implements Observer {

  @Override
  public void update(Observable o, Object arg) {
    if(o instanceof Sensor && arg instanceof Number) {
      Sensor s = (Sensor) o;
      Number n = (Number) arg;
      System.out.println("Sensor " +s.getName()+" was updated to: " + n);
    }
  }

}
