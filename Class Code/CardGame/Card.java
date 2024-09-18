public class Card {
    private String rank;
    private String suit;

    // Parameterized constructor
    public Card(String rank, String suit){
        this.setRank(rank);
        this.setSuit(suit);
    }

    // Copy constructor
    public Card(Card copyMe){
        this.setRank(copyMe.getRank());
        this.setSuit(copyMe.getSuit());
    }

    public String getRank(){
        return rank;
    };

    public void setRank(String rank){
        // ERROR CHECKING
        this.rank = rank;
    }

    public String getSuit(){
        return suit;
    }

    public void setSuit(String suit){
        // ERROR CHECKING
        this.suit = suit;
    }

    public String toString(){
        return rank + " of " + suit;
    }
}