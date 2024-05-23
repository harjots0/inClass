/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author acer
 * @modifier HarjotSingh - 991731364
 */
import java.util.Random;

public class CardTrick {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random1 = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random1.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random1.nextInt(4)]);
            magicHand[i] = c;
        }

        Card luckyCard = new Card(1, "Spades");
        System.out.println("The lucky card is: " + luckyCard.getValue() + " of " + luckyCard.getSuit());

        boolean found = false;
        for (Card card : magicHand) {
            System.out.println(card);
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
            }
        }

        if (found) {
            System.out.println("Congratulations! The lucky card is in the magic hand!");
        } else {
            System.out.println("Sorry! The lucky card is not in the magic hand.");
        }
    }
}