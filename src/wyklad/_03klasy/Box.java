package wyklad._03klasy;

import java.util.Objects;

public class Box {
	private double width = 0;
	private double height = 0;
	private double depth = 0;

	public Box(double width, double height, double depth) {
		this.setDim(3 * width, height, depth);
	}

	public Box() {
		this(0, 0, 0);
	}

	public Box(int n) {
		this(n, n, n);
	}

	public Box(int width, int height, int depth) {
		this(2.0 * width, height, depth);
	}

	public Box(int width, double height, double depth) {
		this(4.0 * width, height, depth);
	}

	public Box(int width, int height, double depth) {
		this(5.0 * width, height, depth);
	}

	public void setDim(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
	public double volume(){
		return height * width * depth;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Box)) return false;

		Box box = (Box) o;

		if (Double.compare(box.width, width) != 0) return false;
		if (Double.compare(box.height, height) != 0) return false;
		return Double.compare(box.depth, depth) == 0;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		temp = Double.doubleToLongBits(width);
		result = (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(height);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(depth);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
}
