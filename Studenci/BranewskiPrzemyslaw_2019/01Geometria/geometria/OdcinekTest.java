package geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OdcinekTest {
	
	@Test
	public void shiftLeftEdgeX()
	{
		Punkt p1 = new Punkt(0, 0);
		Punkt p2 = new Punkt(1, 1);
		Odcinek segment = new Odcinek(p1, p2);
		segment.shift(1, 2);
		assertEquals(1.0, segment.fEdge.getX(), 0.001);
	}
	
	@Test
	public void shiftLeftEdgeY()
	{
		Punkt p1 = new Punkt(0, 0);
		Punkt p2 = new Punkt(1, 1);
		Odcinek segment = new Odcinek(p1, p2);
		segment.shift(1, 2);
		assertEquals(2.0, segment.fEdge.getY(), 0.001);
	}
	
	@Test
	public void shiftRightEdgeX()
	{
		Punkt p1 = new Punkt(0, 0);
		Punkt p2 = new Punkt(1, 1);
		Odcinek segment = new Odcinek(p1, p2);
		segment.shift(1, 2);
		assertEquals(2.0, segment.sEdge.getX(), 0.001);
	}
	
	@Test
	public void shiftRightEdgeY()
	{
		Punkt p1 = new Punkt(0, 0);
		Punkt p2 = new Punkt(1, 1);
		Odcinek segment = new Odcinek(p1, p2);
		segment.shift(1, 2);
		assertEquals(3.0, segment.sEdge.getY(), 0.001);
	}

	@Test
	public void pointDistanceOdcinekAsPoint() {
		
		double distance;
		Punkt p1 = new Punkt(0, 0);
		Punkt p2 = new Punkt(0, 0);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(1, 1);
		distance = segment.pointDistance(p3);
		assertEquals(-1.0, distance, 0.001);
	}

	@Test
	public void pointDistanceHorizontalLeft()
	{
		double distance;
		Punkt p1 = new Punkt(2, 2);
		Punkt p2 = new Punkt(3, 2);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(1, 2);
		distance = segment.pointDistance(p3);
		assertEquals(1.0, distance, 0.001);
	}
	
	@Test
	public void pointDistanceHorizontalRight()
	{
		double distance;
		Punkt p1 = new Punkt(2, 2);
		Punkt p2 = new Punkt(3, 2);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(4, 2);
		distance = segment.pointDistance(p3);
		assertEquals(1.0, distance, 0.001);
	}
	
	@Test
	public void pointDistanceHorizontalTop()
	{
		double distance;
		Punkt p1 = new Punkt(1, 2);
		Punkt p2 = new Punkt(3, 2);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(2, 3);
		distance = segment.pointDistance(p3);
		assertEquals(1.0, distance, 0.001);
	}
	
	@Test
	public void pointDistanceHorizontalBottom()
	{
		double distance;
		Punkt p1 = new Punkt(1, 2);
		Punkt p2 = new Punkt(3, 2);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(2, 1);
		distance = segment.pointDistance(p3);
		assertEquals(1.0, distance, 0.001);
	}
	
	@Test
	public void pointDistanceHorizontalCant()
	{
		double distance;
		Punkt p1 = new Punkt(1, 2);
		Punkt p2 = new Punkt(3, 2);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(4, 3);
		distance = segment.pointDistance(p3);
		assertEquals(1.414, distance, 0.001);
	}
	
	@Test
	public void pointDistanceVerticalLeft()
	{
		double distance;
		Punkt p1 = new Punkt(2, 2);
		Punkt p2 = new Punkt(2, 4);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(1, 3);
		distance = segment.pointDistance(p3);
		assertEquals(1.0, distance, 0.001);
	}
	
	@Test
	public void pointDistanceVerticalRight()
	{
		double distance;
		Punkt p1 = new Punkt(2, 2);
		Punkt p2 = new Punkt(2, 4);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(3, 3);
		distance = segment.pointDistance(p3);
		assertEquals(1.0, distance, 0.001);
	}
	
	@Test
	public void pointDistanceVerticalTop()
	{
		double distance;
		Punkt p1 = new Punkt(2, 2);
		Punkt p2 = new Punkt(2, 4);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(2, 5);
		distance = segment.pointDistance(p3);
		assertEquals(1.0, distance, 0.001);
	}
	
	@Test
	public void pointDistanceVerticalBottom()
	{
		double distance;
		Punkt p1 = new Punkt(2, 2);
		Punkt p2 = new Punkt(2, 4);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(2, 1);
		distance = segment.pointDistance(p3);
		assertEquals(1.0, distance, 0.001);
	}
	
	@Test
	public void pointDistanceVerticalCant()
	{
		double distance;
		Punkt p1 = new Punkt(2, 2);
		Punkt p2 = new Punkt(2, 4);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(3, 5);
		distance = segment.pointDistance(p3);
		assertEquals(1.414, distance, 0.001);
	}
	
	@Test
	public void pointDistanceOnTheSegment()
	{
		double distance;
		Punkt p1 = new Punkt(2, 2);
		Punkt p2 = new Punkt(5, 5);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(3, 3);
		distance = segment.pointDistance(p3);
		assertEquals(0.0, distance, 0.001);
	}
	
	@Test
	public void pointDistanceLeft1()
	{
		double distance;
		Punkt p1 = new Punkt(2, 2);
		Punkt p2 = new Punkt(5, 5);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(1, 3);
		distance = segment.pointDistance(p3);
		assertEquals(1.414, distance, 0.001);
	}
	
	@Test
	public void pointDistanceLeft2()
	{
		double distance;
		Punkt p1 = new Punkt(2, 2);
		Punkt p2 = new Punkt(5, 5);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(1, 2);
		distance = segment.pointDistance(p3);
		assertEquals(1.0, distance, 0.001);
	}
	
	@Test
	public void pointDistanceLeft3()
	{
		double distance;
		Punkt p1 = new Punkt(2, 2);
		Punkt p2 = new Punkt(5, 5);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(1, 1);
		distance = segment.pointDistance(p3);
		assertEquals(1.414, distance, 0.001);
	}
	
	@Test
	public void pointDistanceTop()
	{
		double distance;
		Punkt p1 = new Punkt(2, 2);
		Punkt p2 = new Punkt(5, 5);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(2, 4);
		distance = segment.pointDistance(p3);
		assertEquals(1.414, distance, 0.001);
	}
	
	@Test
	public void pointDistanceBottom()
	{
		double distance;
		Punkt p1 = new Punkt(2, 2);
		Punkt p2 = new Punkt(5, 5);
		Odcinek segment = new Odcinek(p1, p2);
		Punkt p3 = new Punkt(4, 2);
		distance = segment.pointDistance(p3);
		assertEquals(1.414, distance, 0.001);
	}
}
