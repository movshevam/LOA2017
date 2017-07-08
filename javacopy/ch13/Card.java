class Card{
  //instance variables:
  int suit, rank;

  //default constructor:
  public Card(){
    this.suit = 0;    this.rank = 0;
  }

  //constructor:
  public Card(int suit, int rank){
    this.suit = suit;   this.rank = rank;
  }

  //methods:
  public static void printCard(Card c) {
    String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
    String[] ranks = {"narf", "Ace", "2", "3", "4", "5", "6",
                "7", "8","9","10","Jack","Queen","King"};

    System.out.println(ranks[c.rank] + " of " + suits[c.suit]);
  }
  //checks for equivalence of cards
  public static boolean sameCard(Card c1, Card c2){
    return(c1.suit == c2.suit && c1.rank == c2.rank);
  }

  //main method:
  public static void main(String[] args){
    Card threeOfClubs = new Card(0,3);
    printCard(threeOfClubs);
    Card card = threeOfClubs;
    if(card == threeOfClubs){
      System.out.println("card and threeOfClubs are identical");
    }
  }
}
