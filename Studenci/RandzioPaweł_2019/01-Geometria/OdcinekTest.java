import org.junit.Assert;
import org.junit.jupiter.api.Test;

class OdcinekTest {

    @Test
    void shift() {
        Odcinek odc = new Odcinek(0.0, 0.0, 4.0, 4.0);
        odc.shift(1.0,2.5);
        Assert.assertEquals(1.0, odc.Ax, 0.0001);
        Assert.assertEquals(5.0, odc.Bx, 0.0001);
        Assert.assertEquals(2.5, odc.Ay, 0.0001);
        Assert.assertEquals(6.5, odc.By, 0.0001);
    }

    @Test
    void pointDistance() {
        Odcinek odc = new Odcinek(1.0,3.4,2.2,5.5);
        Punkt p = new Punkt();
        Assert.assertEquals((Math.abs(((odc.By-odc.Ay)/(odc.Bx-odc.Ax))*p.x-p.y+((odc.Bx*odc.Ay-odc.Ax*odc.By)/(odc.Bx-odc.Ax))))/Math.sqrt(Math.pow((odc.By-odc.Ay)/(odc.Bx-odc.Ax),2)+1),odc.pointDistance(p),0.0001);
    }
}