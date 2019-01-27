package GameOfLife.Core;

public abstract class Rule<E>
{
    public Rule()
    {

    }

    public abstract E apply(E state);
}
