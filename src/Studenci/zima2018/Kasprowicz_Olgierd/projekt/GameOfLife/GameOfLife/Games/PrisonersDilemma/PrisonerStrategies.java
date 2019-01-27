package GameOfLife.Games.PrisonersDilemma;

import GameOfLife.Utils.PayoffMatrix;

abstract class PrisonerStrategy
{
    abstract Choice choose(PayoffMatrix<Choice> matrix);
}

class RandomPrisonerStrategy extends PrisonerStrategy
{
    @Override
    Choice choose(PayoffMatrix<Choice> matrix)
    {
        return (Math.random() > 0.5)
                ? Choice.Cooperate
                : Choice.Defect;
    }
}

class SmartPrisonerStrategy extends PrisonerStrategy
{
    @Override
    Choice choose(PayoffMatrix<Choice> matrix)
    {
        return
            (matrix.getPayoff(Choice.Cooperate, Choice.Defect) +
            matrix.getPayoff(Choice.Cooperate, Choice.Defect))
            >
            (matrix.getPayoff(Choice.Defect, Choice.Cooperate) +
            matrix.getPayoff(Choice.Defect, Choice.Cooperate))
                ? Choice.Cooperate
                : Choice.Defect
            ;
    }
}

class MeanPrisonerStrategy extends PrisonerStrategy
{
    @Override
    Choice choose(PayoffMatrix<Choice> matrix)
    {
        return Choice.Defect;
    }
}

class NicePrisonerStrategy extends PrisonerStrategy
{
    @Override
    Choice choose(PayoffMatrix<Choice> matrix)
    {
        return Choice.Cooperate;
    }
}
