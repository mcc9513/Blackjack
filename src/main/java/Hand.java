import java.util.ArrayList;
import java.util.List;

public class Hand {

    // Declare a list to hold the cards in the hand
    private final List<Card> cards;

    // Constructor to initialize the hand
    public Hand() {
        cards = new ArrayList<>(); // Initialize the empty list
    }

    // Method to add a card to the hand
    public void addCard(Card card) {
        cards.add(card); // Add the card to the cards list
    }

    // Method to calculate the total value of the hand
    public int calculateHandValue() {
        int value = 0; // Initialize the total value
        int aces = 0; // Initialize the count of aces
        for (Card card : cards) { // Loop through each card in the hand
            switch (card.getRank()) { //switch allows different executions of the loop based on different cases
                case ACE -> {
                    value += 11; // Add 11 for an Ace
                    aces++; // Increment the ace count
                }
                case TWO -> value += 2;
                case THREE -> value += 3;
                case FOUR -> value += 4;
                case FIVE -> value += 5;
                case SIX -> value += 6;
                case SEVEN -> value += 7;
                case EIGHT -> value += 8;
                case NINE -> value += 9;
                case TEN, JACK, QUEEN, KING -> value += 10;
            }
        }
        while (value > 21 && aces > 0) { // Adjust for aces if the total value exceeds 21
            value -= 10; // Subtract 10 for each ace
            aces--; // Decrement the ace count
        }
        return value; // Return the total hand value
    }

    // Method to get the list of cards in the hand
    public List<Card> getCards() {
        return new ArrayList<>(cards); // Return a copy of the list of cards
    }
}
