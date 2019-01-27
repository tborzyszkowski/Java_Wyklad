package GameOfLife.Games.CounterGame;

import GameOfLife.Core.Player;
import GameOfLife.Core.State;

import java.util.ArrayList;
import java.util.List;

class CounterEnvironment extends State
{
    public Integer getI()
    {
        return i;
    }

    public void setI(Integer i)
    {
        this.i = i;
    }

    private Integer i;
    CounterEnvironment()
    {
        this.i = 0;
    }

    @Override
    protected List<Player> addPlayers()
    {
        return new ArrayList<>();
    }
}
