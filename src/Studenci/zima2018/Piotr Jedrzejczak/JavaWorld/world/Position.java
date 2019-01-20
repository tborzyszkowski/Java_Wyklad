package world;

public class Position {
	
	private int x;
	private int y;
	
	public Position(Position position) {
		this.x = position.x;
		this.y = position.y;
	}
	
	public Position(int x,  int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
    
	public boolean equals(Object object) {
		Position pos = (Position) object;
		if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        if (this.x != pos.x) {
            return false;
        }
        if (this.y != pos.y) {
            return false;
        }
        return true;
	}
}
