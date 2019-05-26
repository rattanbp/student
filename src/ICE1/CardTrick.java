
package ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
           c.setValue((int)(Math.random()*13+1));
           c.setSuit(Card.SUITS[(int)(Math.random()*3+0)]);
           magicHand[i] =c;
        }
        System.out.println("Enter card and suit");
        int a = in.nextInt();
        String b =in.nextLine();
       
        for (int i=0; i<magicHand.length; i++)
        {
            if(magicHand[i].getValue()==a&& magicHand[i].getSuit()==b)
            {
                System.out.println("You are Lucky");
            }
            else
                System.out.println("Try Again");
        }
        
           
            
        
        

    }
 
    }

    

