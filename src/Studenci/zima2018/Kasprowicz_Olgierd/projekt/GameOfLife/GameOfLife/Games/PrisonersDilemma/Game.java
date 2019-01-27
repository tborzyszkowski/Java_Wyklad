package GameOfLife.Games.PrisonersDilemma;

import GameOfLife.Core.Player;
import GameOfLife.Core.Rule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game extends GameOfLife.Core.Game<Prison>
{
    @Override
    protected Prison buildEnvironment()
    {
        return new Prison();
    }

    @Override
    protected List<Rule<Prison>> setRules()
    {
        return new ArrayList<>(Arrays.asList(new GoldenRule()));
    }

    @Override
    protected void render()
    {
        StringBuilder sb = new StringBuilder();
        for (Player _p : this.environment.getPlayers())
        {
            Prisoner p = (Prisoner) _p;

            sb.append(p.getName());
            sb.append(" : ");
            sb.append(p.getScore());
            sb.append(", ");
        }

        System.out.println(sb.toString());
    }
}
