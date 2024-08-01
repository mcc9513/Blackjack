import java.util.Scanner;


public class Player extends Person {
    Scanner input = new Scanner(System.in);
    public Player() {

        super.setName("Player");

    }
    public int placeBet(int balance) {
        int bet = 0;
        while (true) {
            try {
                System.out.println("Place your bet (must be in increments of 5): ");
                bet = input.nextInt();
                if (bet % 5 == 0 && bet <= balance) {
                    break;
                } else {
                    System.out.println("Invalid bet amount. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
            }
        }
        return bet;
    }


    public void makeDecision(Deck deck, Deck discard) {

        int  decision = 0;
        boolean getNum = true;

        while(getNum){

            try{
                System.out.println("Would you like to: 1) Hit or 2) Stand");
                decision = input.nextInt();
                getNum = false;

            }
            catch(Exception e){
                System.out.println("Invalid");
                input.next();
            }
            //we don't close the scanner, because we will need it later.
        }

        //if they decide to hit
        if (decision == 1) {
            //hit the deck using the deck and discard deck
            this.hit(deck, discard);
            //return (exit the method) if they have blackjack or busted
            if(this.getHand().calculatedValue()>20){
                return;
            }
            //if they didnt bust or get 21, allow them to decide to hit or stand again by going back to this same method
            else{
                this.makeDecision(deck, discard);
            }

            //if they type any number other than 1, we'll assume they're standing
        } else {
            System.out.println("You stand.");
        }
    }
    public boolean hasBlackjack(){
        if(this.getHand().calculatedValue() == 21){
            return true;
        }
        else{
            return false;
        }
    }



    private int currentBet;
    private int balance = 100; // Example starting balance

    public void setCurrentBet(int bet) {
        this.currentBet = bet;
    }

    public int getCurrentBet() {
        return this.currentBet;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean doubleDown() {
        System.out.println("Do you want to double down? 1) Yes 2) No");
        int decision = input.nextInt();
        return decision == 1;
    }
}