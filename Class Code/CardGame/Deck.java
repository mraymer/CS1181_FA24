import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};

        cards = new ArrayList<>();
        for(String currentSuit : suits){
            for(String currentRank : ranks){
                cards.add(new Card(currentRank, currentSuit));
            }
        }
    }

    // Copy Constructork
    public Deck(Deck oldDeck){
        // NOT GOOD ENOUGH:
        //this.cards = oldDeck.cards;
        
        cards = new ArrayList<>();
        for (Card currentCard : oldDeck.cards){
            this.cards.add(new Card(currentCard));
        }
    }

    public Card getFirst(){
        return cards.get(0);
    }

    public void print(){
        for (Card currentCard : cards){
            System.out.println(currentCard);
        }
    }
    
}
