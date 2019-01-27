package GameOfLife.Core;

import java.util.List;

public abstract class Game<E extends State>
{
    private List<Rule<E>> rules;
    protected E environment;

    protected Game()
    {
        this.environment = this.buildEnvironment();
        this.rules = this.setRules();
    }

    public void next()
    {
        for (Rule<E> rule : rules)
        {
            this.environment = rule.apply(this.environment);
        }

        this.render();
    }

    abstract protected E buildEnvironment();
    abstract protected List<Rule<E>> setRules();
    abstract protected void render();
}
