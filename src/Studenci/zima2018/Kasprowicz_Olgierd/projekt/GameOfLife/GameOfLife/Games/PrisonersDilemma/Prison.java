package GameOfLife.Games.PrisonersDilemma;

import GameOfLife.Core.State;
import GameOfLife.Core.Player;
import GameOfLife.Utils.PayoffMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Choice
{
    Cooperate,
    Defect,
}

class Prison extends State
{

    final PayoffMatrix<Choice> matrix;

    Prison()
    {
        this.matrix = new PayoffMatrix<>();
        this.matrix
            .addPayoff(Choice.Cooperate, Choice.Cooperate, 2)
            .addPayoff(Choice.Defect, Choice.Defect, 1)
            .addPayoff(Choice.Defect, Choice.Cooperate, 3)
            .addPayoff(Choice.Cooperate, Choice.Defect, 0)
        ;
    }

    @Override
    protected List<Player> addPlayers()
    {
        return new ArrayList<>(Arrays.asList(
            new Prisoner("Nico", new NicePrisonerStrategy()),
            new Prisoner("Nate", new NicePrisonerStrategy()),
            new Prisoner("Matt", new MeanPrisonerStrategy()),
            new Prisoner("Max", new MeanPrisonerStrategy()),
            new Prisoner("Randy", new RandomPrisonerStrategy()),
            new Prisoner("Robert", new RandomPrisonerStrategy()),
            new Prisoner("Sam", new SmartPrisonerStrategy()),
            new Prisoner("Simon", new SmartPrisonerStrategy()),
            new Copycat("Calvin"),
            new Copycat("Cedric")
        ));

    }
}
