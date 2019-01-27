package GameOfLife.Games.PrisonersDilemma;

import GameOfLife.Core.Player;
import GameOfLife.Utils.PayoffMatrix;

class Prisoner extends Player
{
    private int score;
    private String name;
    private final PrisonerStrategy strategy;

    void submitScore(int score, Choice opponentsChoice, String opponentsName)
    {
        this.score += score;
    }

    Prisoner(String name, PrisonerStrategy strategy)
    {
        this.name = name;
        this.score = 0;
        this.strategy = strategy;
    }

    Choice ask(PayoffMatrix<Choice> matrix, String opponentName)
    {
        return strategy.choose(matrix);
    }

    String getName()
    {
        return name;
    }

    int getScore()
    {
        return score;
    }
}
