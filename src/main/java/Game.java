// Import necessary packages
import java.util.ArrayList;
import java.util.List;

// Declare the Game class
public class Game {

    // Declare the instance variables for players, dealer, and deck
    private final List<Player> players;
    private final Dealer dealer;
    private final Deck deck;

    // Constructor to initialize the game with a dealer and a deck
    public Game(Dealer dealer) {
        this.players = new ArrayList<>(); // Initialize the list of players
        this.dealer = dealer; // Set the dealer
        this.deck = new Deck(); // Create a new deck
        this.deck.shuffle(); // Shuffle the deck
    }

    // Method to add a player to the game
    public void addPlayer(Player player) {
        players.add(player); // Add the player to the list of players
    }

    // Method to start the game by dealing cards
    public void startGame() {
        dealer.dealCards(players, deck); // The dealer deals cards to all players
        dealer.dealCards(List.of(dealer), deck); // The dealer deals cards to themselves
    }

    // Method to determine the winner based on the highest hand value
    public Player determineWinner() {
        Player winner = players.get(0); // Assume the first player is the winner initially
        for (Player player : players) { // Loop through each player
            if (player.getHandValue() > winner.getHandValue()) { // Compare hand values
                winner = player; // Update the winner if the current player has a higher hand value
            }
        }
        return winner; // Return the winner
    }
}
