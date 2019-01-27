package GameOfLife.Games.PrisonersDilemma;

import GameOfLife.Core.Rule;
import GameOfLife.Utils.PayoffMatrix;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GoldenRule extends Rule<Prison>
{
    @Override
    public Prison apply(Prison state)
    {
        PayoffMatrix<Choice> m = state.matrix;
        List<Prisoner> prisoners = state.getPlayers()
            .stream()
            .map(p -> (Prisoner) p)
            .collect(Collectors.toList());

        powerSet(prisoners)
                .stream()
                .filter(l -> l.size() == 2)
                .forEach(duelers -> this.apply(duelers, m));

        return state;
    }

    private void apply(List<Prisoner> duelers, PayoffMatrix<Choice> m)
    {
        Prisoner a = duelers.get(0);
        Prisoner b = duelers.get(1);

        Choice aChoice = a.ask(m, b.getName());
        Choice bChoice = b.ask(m, a.getName());

        a.submitScore(m.getPayoff(aChoice, bChoice), bChoice, b.getName());
        b.submitScore(m.getPayoff(bChoice, aChoice), aChoice, a.getName());
    }

    // copied from: https://stackoverflow.com/a/1670871/9134286
    // and adjusted
    // this should be part of the standard library really...
    private static <T> List<List<T>> powerSet(final List<T> originalSet)
    {
        ArrayList<List<T>> sets = new ArrayList<>();
        if (originalSet.isEmpty()) {
            sets.add(new ArrayList<>());
            return sets;
        }
        List<T> list = new ArrayList<>(originalSet);
        T head = list.get(0);
        List<T> rest = new ArrayList<>(list.subList(1, list.size()));
        for (List<T> set : powerSet(rest)) {
            List<T> newSet = new ArrayList<>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
}
