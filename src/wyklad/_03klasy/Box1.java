package wyklad._03klasy;

class Box1 {
	private double width;
	private double height;
	private double depth;

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

	public boolean equals(Object o) {
		Box1 box = (Box1) o;
		if (this.getWidth() == box.getWidth() && this.getHeight() == box.getHeight() && this.getDepth() == box.getDepth())
			return true;
		else
			return false;
	}
}
