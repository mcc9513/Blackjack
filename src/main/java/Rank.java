public enum Rank {

    ACE("Ace",11),
    KING("King",10),
    QUEEN("Queen",10),
    JACK("Jack",10),
    TEN("Ten",10),
    NINE("Nine",9),
    EIGHT("Eight",8),
    SEVEN("Seven",7),
    SIX("Six",6),
    FIVE("Five",5),
    FOUR("Four",4),
    THREE("Three",3),
    TWO("Two",2);


    final String rankName;
    final int rankValue;

   Rank(String rankName, int rankValue){
        this.rankName=rankName;
        this.rankValue=rankValue;
    }

    public String toString(){
        return rankName;
    }

}
