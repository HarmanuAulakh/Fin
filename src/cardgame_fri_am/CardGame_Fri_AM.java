/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame_fri_am;

import java.util.Random;
import java.util.Scanner;
 
import cardgame_fri_am.Card.Value;
import cardgame_fri_am.Card.Suit;

/**
 *
 * @author aulak
 */
public class CardGame_Fri_AM {
    
    
    public static void main(String [] args){
        
        
        
        Card[] card = CardHandGenerator.generatHand(7);
    //array for 7 cards thisone is for carHand generator
    /* Card [] hand = new Card[7];
    
    Random random = new Random();
    
   
    
    for(int i =0;i<hand.length;i++){
        
        Value value =  Card.Value.values()[random.nextInt(13)];
        //int value = random.nextInt(13)+1;
        
        Suit suit = Card.Suit.values() [random.nextInt(4)];
        //String suit = Card.SUITS[random.nextInt(4)];
        Card card = new Card(value,suit);
        hand[i]=card;
        
    }
    */
    
    /*
            for(Card card : hand){
        System.out.println(card.getValue()+" "+card.getSuit());
    }*/
    
    Scanner input = new Scanner(System.in);
    
    //System.out.println("enter the value form 1 to 13");
    
    System.out.println("Enter the value");
    
    for(int i =0; i<Card.Value.values().length;i++){
        
        System.out.println(i + ":" +Card.Value.values() [i]);
    
    }
    
    int valuePos = input.nextInt();
    //int value = input.nextInt();
    
    System.out.println("Pick a suit for user guess card");
    
    for(int i=0;i<Card.Suit.values().length;i++){
        
        System.out.println(i + ":" +Card.Suit.values() [i]);
    
    }
    
    
    
    
   /* for(int i=0;i<Card.SUITS.length;i++){
        
        System.out.println(i + ":" +Card.SUITS[i]);
    
    }*/
    
    System.out.println("Pick a suit for user guess card");
    
    int suitPos = input.nextInt();
   // int suit = input.nextInt();
   
   
     Card userGuess = new Card(Card.Value.values()[valuePos], Card.Suit.values()[suitPos]);
    //Card userGuess = new Card(value,Card.SUITS[suit]);
    
    // check if user is one of the hand from the cards
    
    boolean match = false;
    
    for(Card card : hand){

        if(card.getValue()== userGuess.getValue() && card.getSuit()==(userGuess.getSuit())){
            
            match=true;
            break;
            
        }
        
        
       
            
    
    }
    
     if(match){
        System.out.println("you win");
        }
        
        else{
        System.out.println("you lose"
                + "");
        }
    
    
    }}
        /*
        if(card.getValue()== userGuess.getValue() && card.getSuit().equals(userGuess.getSuit())){
            
            match=true;
            break;
            
        }
        
        
       
            
    
    }
    
     if(match){
        System.out.println("you win");
        }
        
        else{
        System.out.println("you lose"
                + "");
        }
    
    
    }}
*/