// Lab12bvst.java     This is the Student-Starting file. 
// This version is implemented with "Dynamic Arrays"
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on 
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.



import java.util.ArrayList;

public class Lab12bst
{
    public static void main(String[] args)
    {   
        Deck deck = new Deck();
        System.out.println(deck);
    }
}


class Deck 
{
    private ArrayList<Card> cards;
    private int size;

    public Deck() 
    {
        size = 52;
        cards = new ArrayList<Card>();
        
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};
        int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,11};
        
        for(String currentSuit: suits)
        {
            for(int i = 0; i < ranks.length; i++)
            {
                cards.add(new Card(currentSuit, ranks[i], values[i]));
            }
        }
    }
    
    /**
     * Returns the string version of the Deck, which is a listing of all cards in the deck on new lines
     * @return String The string version of the Deck
     */
    public String toString()
    {
        String output = "";
        
        for(Card currentCard: cards)
            output += currentCard.toString() + "\n";
        
        return output;
    }
}
