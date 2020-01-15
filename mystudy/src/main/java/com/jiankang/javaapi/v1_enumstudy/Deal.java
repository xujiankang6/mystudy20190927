package com.jiankang.javaapi.v1_enumstudy;

/*
 *@create by jiankang
 *@date 2020/1/14 time 18:14
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deal {
    public static void main(String[] args) {
        int numHands = 4;
        int cardsPerHand = 3;
        List<Card> deck = Card.newDeck();
        Collections.shuffle(deck);
        for(int i=0;i<numHands;i++){
            System.out.println(dealHand(deck,cardsPerHand));
        }
    }

    private static <E extends Comparable<E>> ArrayList<E> dealHand(List<E> deck, int n) {
        int deckSize = deck.size();
        List<E> handView = deck.subList(deckSize -n,deckSize);
        ArrayList<E> hand = new ArrayList<E>(handView);
        handView.clear();
        Collections.sort(hand);
        return hand;
    }
}
