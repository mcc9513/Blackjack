// Import necessary packages
import java.util.Objects; //called with Objects.requireNonNull() and Objects.hash, equals() also comes from this class

public class Card {

    // Declare the instance variables for rank and suit
    private final Rank rank; //declared final so that after creation its value cannot be changed
    private final Suit suit;

    // Constructor to initialize rank and suit of card
    public Card(Rank rank, Suit suit) {
        this.rank = Objects.requireNonNull(rank); // Ensure that rank is not null
        this.suit = Objects.requireNonNull(suit); // Ensure that suit is not null
    }

    // Getter method to retrieve the rank of the card
    public Rank getRank() {
        return rank;
    }

    // Getter method to retrieve the suit of the card
    public Suit getSuit() {
        return suit;
    }

    // Override the toString method to provide a string representation of the card
    @Override
    public String toString() {
        return rank + " of " + suit; // e.g., "Ace of Spades"
    }

    // Override the equals method to compare two Card objects for equality
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // If the two references (this and o) are pointing to the same object, they are equal
        if (o == null || getClass() != o.getClass()) return false; // getClass(): Refers to the runtime class of this. 'o.getClass()': Refers to the runtime class of the object o.
        Card card = (Card) o; // Cast the object to a Card
        return rank == card.rank && suit == card.suit; // If both the rank and suit are the same for this and card, the method returns true
    }

    // Override the hashCode method to generate a hash code for the card
    @Override
    public int hashCode() { //hashcode is is a derived value computed based on the object's state (i.e., its fields)
        return Objects.hash(rank, suit); // combines the hash codes of provided arguments (rank and suit) into a single hash code
    }
}
