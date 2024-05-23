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
import java.util.Scanner;


public class CardTrick {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random1 = new Random(); // creating a random instance

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random1.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random1.nextInt(4)]);
            magicHand[i] = c;
        }

        System.out.println("Magic Hand:");
        for (Card card : magicHand) {
            System.out.println(card);
        }

        int value;
        String Suit;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Pick a card value between 1 and 13: ");
            value = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Pick a suit (Hearts, Diamonds, Spades, Clubs): ");
            Suit = scanner.nextLine();
        }

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == value && card.getSuit().equalsIgnoreCase(Suit)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The card is in the magic hand!");
        } else {
            System.out.println("The card is not in the magic hand.");
        }
    }
}
