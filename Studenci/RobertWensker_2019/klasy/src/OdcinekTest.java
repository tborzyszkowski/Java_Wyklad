import org.junit.Assert;
import org.junit.Test;

public class OdcinekTest {
    @Test
    public void prototypeConstructorResult_getX() {
        // Arrange
        double expected = 1.0;

        // Act
        Odcinek odcinek = new Odcinek(1.0, 1.0,2.0,2.0);

        // Assert
        Assert.assertEquals(1.0, odcinek.getStarting_x(), 0.001);
    }

    @Test
    public  void ODCshift_starting_x(){
        Punkt punkt1 = new Punkt(1.0,1.0);
        Punkt punkt2 = new Punkt(5.0,5.0);
        Odcinek odcinek = new Odcinek(punkt1,punkt2);
        odcinek.shift(2.0,1.0);
        Assert.assertEquals(3.0, odcinek.getStarting_x(),0.001);

    }
    @Test
    public  void ODCshift_ending_x(){
        Punkt punkt1 = new Punkt(1.0,1.0);
        Punkt punkt2 = new Punkt(5.0,5.0);
        Odcinek odcinek = new Odcinek(punkt1,punkt2);
        odcinek.shift(2.0,1.0);
        Assert.assertEquals(7.0,odcinek.getEnding_x(),0.001);

    }
    @Test
    public  void ODCshift_starting_y(){
        Punkt punkt1 = new Punkt(1.0,1.0);
        Punkt punkt2 = new Punkt(5.0,5.0);
        Odcinek odcinek = new Odcinek(punkt1,punkt2);
        odcinek.shift(2.0,1.0);
        Assert.assertEquals(2.0,odcinek.getStarting_y() ,0.001);

    }
    @Test
    public  void ODCshift_ending_y(){
        Punkt punkt1 = new Punkt(1.0,1.0);
        Punkt punkt2 = new Punkt(5.0,5.0);
        Odcinek odcinek = new Odcinek(punkt1,punkt2);
        odcinek.shift(2.0,1.0);
        Assert.assertEquals(6.0,odcinek.getEnding_y() ,0.001);

    }
    @Test
    public void ODCline1(){
        Punkt punkt1 = new Punkt(5.0,5.0);
        Punkt punkt2 = new Punkt(10.0,10.0);
        Odcinek odcinek = new Odcinek(punkt1,punkt2);
        Assert.assertEquals(5,odcinek.distance(2,1),0.0001);
    }
    @Test
    public void ODCline2(){
        Punkt punkt1 = new Punkt(5.0,5.0);
        Punkt punkt2 = new Punkt(12.0,12.0);
        Odcinek odcinek = new Odcinek(punkt1,punkt2);
        Assert.assertEquals(0,odcinek.distance(7,7),0.0001);
    }
    @Test
    public void ODCline3(){
        Punkt punkt1 = new Punkt(5.0,5.0);
        Punkt punkt2 = new Punkt(10.0,10.0);
        Odcinek odcinek = new Odcinek(punkt1,punkt2);
        Assert.assertEquals(5,odcinek.distance(13,14),0.0001);
    }
    @Test
    public void testsetSX(){
        Odcinek odcinek =  new Odcinek();
        odcinek.set(1,2,3,4);
        Assert.assertEquals(1,odcinek.getStarting_x(),0.001);
    }
    @Test
    public void testsetSY(){
        Odcinek odcinek =  new Odcinek();
        odcinek.set(1,2,3,4);
        Assert.assertEquals(2,odcinek.getStarting_y(),0.001);
    }
    @Test
    public void testsetEX(){
        Odcinek odcinek =  new Odcinek();
        odcinek.set(1,2,3,4);
        Assert.assertEquals(3,odcinek.getEnding_x(),0.001);
    }
    @Test
    public void testsetEY(){
        Odcinek odcinek =  new Odcinek();
        odcinek.set(1,2,3,4);
        Assert.assertEquals(4,odcinek.getEnding_y(),0.001);
    }
    @Test
    public void initPointsnDoublesStartingX(){
        Odcinek odcinek = new Odcinek((new Punkt(1,2)),3,4);
        Assert.assertEquals(1,odcinek.getStarting_x(),0.001);
    }
    @Test
    public void initPointsnDoublesStartingY(){
        Odcinek odcinek = new Odcinek((new Punkt(1,2)),3,4);
        Assert.assertEquals(2,odcinek.getStarting_y(),0.001);
    }
    @Test
    public void initPointsnDoublesEndingsX(){
        Odcinek odcinek = new Odcinek((new Punkt(1,2)),3,4);
        Assert.assertEquals(3,odcinek.getEnding_x(),0.001);
    }
    @Test
    public void initPointsnDoublesEndingY(){
        Odcinek odcinek = new Odcinek((new Punkt(1,2)),3,4);
        Assert.assertEquals(4,odcinek.getEnding_y(),0.001);
    }
    @Test
    public void initDoublesnPointsStartingX(){
        Odcinek odcinek = new Odcinek(1,2,(new Punkt(3,4)));
        Assert.assertEquals(1,odcinek.getStarting_x(),0.001);
    }
    @Test
    public void initDoublesnPointsStartingY(){
        Odcinek odcinek = new Odcinek(1,2,(new Punkt(3,4)));
        Assert.assertEquals(2,odcinek.getStarting_y(),0.001);
    }
    @Test
    public void initDoublesnPointsEndingX(){
        Odcinek odcinek = new Odcinek(1,2,(new Punkt(3,4)));
        Assert.assertEquals(3,odcinek.getEnding_x(),0.001);
    }
    @Test
    public void initDoublesnPointsEndingY(){
        Odcinek odcinek = new Odcinek(1,2,(new Punkt(3,4)));
        Assert.assertEquals(4,odcinek.getEnding_y(),0.001);
    }
    @Test
    public void testSetSX(){
        Odcinek odcinek = new Odcinek();
        odcinek.setStarting_x(1);
        Assert.assertEquals(1,odcinek.getStarting_x(),0.001);
    }
    @Test
    public void testSetSY(){
        Odcinek odcinek = new Odcinek();
        odcinek.setStarting_y(1);
        Assert.assertEquals(1,odcinek.getStarting_y(),0.001);
    }
    @Test
    public void testSetEX(){
        Odcinek odcinek = new Odcinek();
        odcinek.setEnding_x(1);
        Assert.assertEquals(1,odcinek.getEnding_x(),0.001);
    }
    @Test
    public void testSetEY(){
        Odcinek odcinek = new Odcinek();
        odcinek.setEnding_y(1);
        Assert.assertEquals(1,odcinek.getEnding_y(),0.001);
    }
}
