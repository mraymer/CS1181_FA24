public class CardGame {
    public static void main(String[] args) {
        Card myCard = new Card("2", "Diamonds");
        Card yourCard = new Card(myCard);

        yourCard.setSuit("Clubs");
        System.out.println(myCard);
        System.out.println(yourCard);

        Deck myDeck = new Deck();

        Deck yourDeck = new Deck(myDeck);

        Card myFirstCard = myDeck.getFirst();
        myFirstCard.setSuit("BLAH");

        System.out.println("Done");
        
        
    }
}
