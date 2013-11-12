package deepsource.demo.designpatterns.decorator;


import org.junit.Assert;
import org.junit.Test;

public class TestVehicleDecorator {

  @Test
  public void testVehicleDecorator() {
    Vehicle v = new ToyotaCamry();
    v = new DvdPackage(v);
    v = new LeatherPackage(v);
    
    Assert.assertEquals(21000, v.getCost().intValue());
    
    v = new ToyotaTundra();
    v = new FourByFourPackage(v);
    v = new V8Package(v);
    v = new LeatherPackage(v);
    
    Assert.assertEquals(29000, v.getCost().intValue());
  }
}