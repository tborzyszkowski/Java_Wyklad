package Laboratorium.karty;

public class Card implements Comparable<Card> {
    private int rank;
    private int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card o) {
        if (this.getSuit() > o.getSuit())
            return 1;
        if (this.getSuit() < o.getSuit())
            return -1;
        if(this.getRank() > o.getRank())
            return 1;
        if(this.getRank() < o.getRank())
            return -1;
        return 0;
    }
}
