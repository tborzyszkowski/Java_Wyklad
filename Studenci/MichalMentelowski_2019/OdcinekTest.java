package faktpkt;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OdcinekTest {

  @Test
  void shift() {}

  @Test
  void pointDistance() {
  Odcinek odcinek = new Odcinek(0,4,4,4);
  Punkt abc = new Punkt(4,0);
    Assert.assertEquals(odcinek.pointDistance(abc),4,0);
  }

  @Test
  void length() {
    Odcinek odcinek = new Odcinek(5, 5, 10, 10);
    double dlugosc = odcinek.dlugoscOdcinka();
    Assert.assertEquals(Math.sqrt(5), dlugosc, 0);
  }
}