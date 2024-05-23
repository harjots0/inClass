/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 *
 * @author acer
  * @modifier HarjotSingh - 991731364
 */
class Card {
    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    private int value;
    private String suit;

    public Card() {
    }

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
