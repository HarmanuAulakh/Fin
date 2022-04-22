/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame_fri_am;

import cardgame_fri_am.Card.Suit;
import cardgame_fri_am.Card.Value;
import java.util.Random;

/**
 *
 * @author aulak
 */
public class CardHandGenerator {
    
    public static  Card [] generatHand(int numCards){
        
        
           Card [] hand = new Card[numCards];
    
         Random random = new Random();
    
   
    
    for(int i =0;i<hand.length;i++){
        
        Value value =  Card.Value.values()[random.nextInt(13)];
        //int value = random.nextInt(13)+1;
        
        Suit suit = Card.Suit.values() [random.nextInt(4)];
        //String suit = Card.SUITS[random.nextInt(4)];
        Card card = new Card(value,suit);
        hand[i]=card;
        
        
    
    }
    return hand;
    
    }

    
        
    }

        
     