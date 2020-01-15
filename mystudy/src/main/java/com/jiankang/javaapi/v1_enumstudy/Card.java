package com.jiankang.javaapi.v1_enumstudy;

/*
 *@create by jiankang
 *@date 2020/1/14 time 17:29
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Card implements Comparable<Card>, Serializable {

    public enum Rank {DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, KING, ACE}

    public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES}

    private final Rank rank;
    private final Suit suit;

    public Rank rank() {
        return rank;
    }

    public Suit suit() {
        return suit;
    }

    private Card(Rank rank, Suit suit) {
        if (rank == null || suit == null) {
            throw new NullPointerException(rank + ", " + suit);
        }

        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }

    @Override
    public int compareTo(Card o) {
        int suitCompare = suit.compareTo(o.suit);
        return (suitCompare != 0 ? suitCompare : rank.compareTo(o.rank));
    }

    private static final List<Card> prototypeDeck = new ArrayList<Card>(52);

    static {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                prototypeDeck.add(new Card(rank, suit));
            }
        }
    }

    public static List<Card> newDeck() {
        return new ArrayList<Card>(prototypeDeck);
    }

}
