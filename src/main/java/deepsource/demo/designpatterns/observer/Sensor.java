package deepsource.demo.designpatterns.observer;

import java.util.Observable;

public class Sensor extends Observable {
  private String name;

  public Sensor(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void updateSensor(Number n) {
    setChanged();
    notifyObservers(n);
  }

}
