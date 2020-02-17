package com.thoughtworks;

public class Card {

    private CardSuit suit;
    private CardNum num;

    public Card(CardSuit suit, CardNum num) {
        this.suit = suit;
        this.num = num;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public CardNum getNum() {
        return num;
    }

}
