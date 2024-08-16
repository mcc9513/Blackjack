import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    // Declare a list to hold the cards in the deck
    private final List<Card> cards;

    // Constructor to initialize the deck with all 52 cards
    public Deck() {
        cards = new ArrayList<>(); // Initialize the list
        for (Suit suit : Suit.values()) { // Loop through each suit
            for (Rank rank : Rank.values()) { // Loop through each rank
                cards.add(new Card(rank, suit)); // Add a new card to the deck for each combination of rank and suit
            }
        }
    }

    // Method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards); // Shuffle the list of cards
    }

    // Method to deal a card from the deck
    public Card dealCard() {
        if (cards.isEmpty()) { // Check if the deck is empty
            throw new IllegalStateException("No cards left in the deck"); // Throw an exception if the deck is empty
        }
        return cards.remove(0); // Remove and return the first card in the deck
    }
}
