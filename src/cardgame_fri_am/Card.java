/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame_fri_am;

/**
 *
 * @author aulak
 */
public class Card {
    
    public enum Suit{
    Hearts,Diamonds,spades,clubs
    }
    public enum Value{
    ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING
    }
    
    private  Value  value;
    private Suit suit;
    
    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
    
    

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    
    
    
    
    //private int value;
    //private String suit;
    
    //public static final String[] SUITS = {"Hearts","diamonds","spades","clubs"};

    /*public Card(int value, String suit) {
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
*/
    
    
    
}
