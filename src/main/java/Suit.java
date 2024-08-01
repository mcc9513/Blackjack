public enum Suit {
    //declare the suits as constants
    CLUB("Clubs"),
    DIAMOND("Diamonds"),
    HEART("Hearts"),
    SPADE("Spades");

    final String suitName;

      Suit(String suitName) {
         this.suitName=suitName;
     }

    public String toString() {
          return suitName;
    }


}
