package com.thoughtworks;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardMachine {

    private ArrayList<Card> remainingCards;

    public CardMachine() {
        remainingCards = new ArrayList<>();
    }

    public void init() {
        for (CardSuit cardSuit : CardSuit.values()) {
            for (CardNum cardNum : CardNum.values()) {
                remainingCards.add(new Card(cardSuit, cardNum));
            }
        }
    }

    private ArrayList<Card> drawCard(int numOfCards) {
        ArrayList<Card> cardsPicked = new ArrayList<>();
        while (numOfCards-- > 0) {
            cardsPicked.add(pickOneCard());
        }
        return cardsPicked;
    }

    private Card pickOneCard() {
        Random random = new Random();
        int cardIndex = random.nextInt(remainingCards.size());
        return remainingCards.remove(cardIndex);
    }

    private void printPickedCards(ArrayList<Card> cardsPicked) {
        System.out.println("==============================================");
        System.out.println("The card(s) randomly picked: ");
        for (Card card : cardsPicked) {
            System.out.print(card.getSuit().getNameCN() + card.getNum().getSymbol() + " ");
        }
        System.out.println();
        System.out.println("==============================================");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.print("Please input the number of cards you want: ");
        int cardCount = scanner.nextInt();
        while (cardCount <= 0 || cardCount > remainingCards.size()) {
            System.out.print("Please input the correct number: ");
            cardCount = scanner.nextInt();
        }
        printPickedCards(drawCard(cardCount));
    }
}
