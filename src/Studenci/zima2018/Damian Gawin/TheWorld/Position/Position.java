package Position;
import java.util.Objects;

public class Position
{
    private Integer x;
    private Integer y;

    public Position(Integer x, Integer y)
    {
        this.x = x;
        this.y = y;
    }

    public Integer getX()
    {
        return x;
    }

    public Integer getY()
    {
        return y;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Position))
            return false;
        if (this == o)
            return true;

        Position position;
        position = (Position) o;
        return Objects.equals(getX(), position.getX()) &&
                Objects.equals(getY(), position.getY());
    }

    @Override
    public String toString()
    {
        return "Position " +
                "x = " + x +
                ", y = " + y;
    }
}
