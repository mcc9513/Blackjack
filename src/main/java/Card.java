public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit){
        this.rank=rank;
        this.suit=suit;
    }
    public Card(Card card){
        this.rank = card.getRank();
        this.suit = card.getSuit();
    }

    public int getValue(){
        return rank.rankValue;
    }
    public Rank getRank(){
        return rank;
    }
    public Suit getSuit(){
        return suit;
    }
    @Override
    public String toString(){
        return (rank + " of " + suit + " with a value of " + this.getValue());
    }


}