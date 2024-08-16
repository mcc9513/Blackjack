import java.util.List;

// Dealer class inherits from Person
public class Dealer extends Person {

    // Constructor to initialize the dealer with a name
    public Dealer(String name) {
        super(name); // Call the constructor of the superclass (Person) to set name
    }

    // Method for the dealer to deal cards to a list of players
    public void dealCards(List<Player> players, Deck deck) {
        for (Player player : players) { // Loop through each player in the players list
            player.addCardToHand(deck.dealCard()); // Add one card to the hand of each player
        }
    }

    // Method for the dealer to reveal the first card in their hand
    public Card revealFirstCard() {
        return getHand().getCards().get(0); // Return the first card in the dealer's hand
    }
}
