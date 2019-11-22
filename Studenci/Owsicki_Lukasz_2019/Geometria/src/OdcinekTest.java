import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class OdcinekTest {

	@Test
	void testShiftX1() {
		Odcinek odcinek = new Odcinek(1.0, 1.0, 2.0, 2.0);
        odcinek.shift(5.0, 1.0);
        Assert.assertEquals(6.0, odcinek.getx1(), 0.001);
	}
	
	@Test
	void testShiftX2() {
		Odcinek odcinek = new Odcinek(1.0, 1.0, 4.0, 2.0);
        odcinek.shift(2.0, 1.0);
        Assert.assertEquals(6.0, odcinek.getx2(), 0.001);
	}
	@Test
	void testShiftY1() {
		Odcinek odcinek = new Odcinek(1.0, 3.0, 2.0, 2.0);
        odcinek.shift(1.0, 3.0);
        Assert.assertEquals(6.0, odcinek.gety1(), 0.001);
	}
	
	@Test
	void testShiftY2() {
		Odcinek odcinek = new Odcinek(2.0, 1.0, 2.0, 4.0);
        odcinek.shift(1.0, 2.0);
        Assert.assertEquals(6.0, odcinek.gety2(), 0.001);
	}


}

