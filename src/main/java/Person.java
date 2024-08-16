// Declare Person as abstract
public abstract class Person {

    // Declare the instance variables for name and hand
    private final String name;
    private final Hand hand;

    // Constructor to initialize the person's name and hand
    public Person(String name) {
        this.name = name; // Set the name
        this.hand = new Hand(); // Create a new hand
    }

    // Method to get the person's name
    public String getName() {
        return name;
    }

    // Method to get the person's hand
    public Hand getHand() {
        return hand;
    }

    // Method to get the value of the person's hand
    public int getHandValue() {
        return hand.calculateHandValue();
    }

    // Method to add a card to the person's hand
    public void addCardToHand(Card card) {
        hand.addCard(card); 
    }
}
