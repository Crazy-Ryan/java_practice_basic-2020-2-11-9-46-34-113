package com.thoughtworks;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardMachine {

    private ArrayList<Card> remainingCards;

    public CardMachine() {
    }

    public void initCardMachine() {
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

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the number of cards you want: ");
        int cardCount = scanner.nextInt();
        while (cardCount <= 0 || cardCount > remainingCards.size()) {
            System.out.println("Please input the correct number");
            cardCount = scanner.nextInt();
        }
        printPickedCards(drawCard(cardCount));
    }

    private void printPickedCards(ArrayList<Card> cardsPicked){
        for (Card card : cardsPicked){
            System.out.print(card.getSuit().getNameCN() + card.getNum().getSymbol() + " ");
        }
    }
}
