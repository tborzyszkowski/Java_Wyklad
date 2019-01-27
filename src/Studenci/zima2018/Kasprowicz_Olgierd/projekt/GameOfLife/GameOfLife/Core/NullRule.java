package GameOfLife.Core;

public class NullRule<Environment extends State> extends Rule<Environment>
{
    @Override
    public Environment apply(Environment state)
    {
        return state;
    }
}
