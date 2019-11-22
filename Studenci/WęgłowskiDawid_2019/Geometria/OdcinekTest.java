import static org.junit.Assert.*;
import org.junit.*;

public class OdcinekTest
{

	@Test
	public void testShiftSegmentAX()
	{
		Punkt a = new Punkt(0, 0);
		Punkt b = new Punkt(5, 2.5);
		Odcinek AB = new Odcinek(a, b);
		AB.shiftSegment(2.3, 4.3);
		assertEquals(2.3, AB.getAX(), 0.001);
	}

	@Test
	public void testShiftSegmentAY()
	{
		Punkt a = new Punkt(0, 0);
		Punkt b = new Punkt(5, 2.5);
		Odcinek AB = new Odcinek(a, b);
		AB.shiftSegment(2.3, 4.3);
		assertEquals(4.3, AB.getAY(), 0.001);
	}

	@Test
	public void testShiftSegmentBX()
	{
		Punkt a = new Punkt(0, 0);
		Punkt b = new Punkt(5, 2.5);
		Odcinek AB = new Odcinek(a, b);
		AB.shiftSegment(2.3, 4.3);
		assertEquals(7.3, AB.getBX(), 0.001);
	}

	@Test
	public void testShiftSegmentBY()
	{
		Punkt a = new Punkt(0, 0);
		Punkt b = new Punkt(5, 2.5);
		Odcinek AB = new Odcinek(a, b);
		AB.shiftSegment(2.3, 4.3);
		assertEquals(6.8, AB.getBY(), 0.001);
	}

	@Test
	public void testGetPointDistanceSegmentIsPoint()
	{
		double distance;
		Punkt a = new Punkt(0, 0);
		Punkt b = new Punkt(0, 0);
		Punkt c = new Punkt(1, 1);
		Odcinek odcinek = new Odcinek(a, b);
		distance = odcinek.getPointDistance(c);
		assertEquals(-1.0, distance, 0.001);
	}

	@Test
	public void testGetPointDistance()
	{
		double distance;
		Punkt a = new Punkt(0, 0);
		Punkt b = new Punkt(3, 5);
		Punkt c = new Punkt(10, 5);
		Odcinek odcinek = new Odcinek(a, b);
		distance = odcinek.getPointDistance(c);
		assertEquals(7.0, distance, 0.001);
	}
}