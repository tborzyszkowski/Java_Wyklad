import org.junit.*;

public class OdcinekTest {

    @Test
    public void sprawdzenieXwodcinkuzpunktu() {

        Punkt newPunkt = new Punkt();
        Odcinek odcinek = new Odcinek(newPunkt,4,0);
        Assert.assertEquals(0, odcinek.pierwszy.x, 0.001);
    }
    @Test
    public void sprawdzenieYwodcinkuzpunktu() {

        Punkt newPunkt = new Punkt();
        Odcinek odcinek = new Odcinek(newPunkt,4,0);
        Assert.assertEquals(0, odcinek.pierwszy.y, 0.001);
    }
    @Test
    public void distanceodcinekpunkt1() {

        Punkt newPunkt1 = new Punkt();
        Punkt newPunkt2 = new Punkt(7,6);
        Odcinek odcinek = new Odcinek(newPunkt1,14,0);
        Assert.assertEquals(6,odcinek.pointDistance(newPunkt2), 0.001);
    }
    @Test
    public void distanceodcinekpunkt2() {

        Punkt newPunkt1 = new Punkt(-3,-2);
        Punkt newPunkt2 = new Punkt(0,-6);
        Odcinek odcinek = new Odcinek(newPunkt1,3,-2);
        Assert.assertEquals(4,odcinek.pointDistance(newPunkt2), 0.001);
    }
    @Test
    public void swiftXYtest1() {

        Punkt newPunkt1 = new Punkt();
        Punkt newPunkt2 = new Punkt(7,7);
        Odcinek odcinek = new Odcinek(newPunkt1,newPunkt2);
        odcinek.swiftXY(1,1);
        Assert.assertEquals(1,odcinek.pierwszy.x, 0.001);

    }
    @Test
    public void swiftXYtest2() {

        Punkt newPunkt1 = new Punkt();
        Punkt newPunkt2 = new Punkt(7,7);
        Odcinek odcinek = new Odcinek(newPunkt1,newPunkt2);
        odcinek.swiftXY(1,1);
        Assert.assertEquals(1,odcinek.pierwszy.y, 0.001);


    }
    @Test
    public void swiftXYtest3() {

        Punkt newPunkt1 = new Punkt();
        Punkt newPunkt2 = new Punkt(7,7);
        Odcinek odcinek = new Odcinek(newPunkt1,newPunkt2);
        odcinek.swiftXY(1,1);
        Assert.assertEquals(8,odcinek.drugi.x, 0.001);

    }
    @Test
    public void swiftXYtest4() {

        Punkt newPunkt1 = new Punkt();
        Punkt newPunkt2 = new Punkt(7,7);
        Odcinek odcinek = new Odcinek(newPunkt1,newPunkt2);
        odcinek.swiftXY(1,1);
        Assert.assertEquals(8,odcinek.drugi.y, 0.001);

    }
}
