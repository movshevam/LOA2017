/*
Exercise 11.1. In the board game Scrabble2, each tile contains a letter, which
is used to spell words, and a score, which is used to determine the value of
words.
1. Write a definition for a class named Tile that represents Scrabble tiles.
The instance variables should be a character named letter and an integer named
value.
2. Write a constructor that takes parameters named letter and value and
initializes the instance variables.
3. Write a method named printTile that takes a Tile object as a parameter and
prints the instance variables in a reader-friendly format.
4. Write a method named testTile that creates a Tile object with the letter Z
and the value 10, and then uses printTile to print the state of the object.
The point of this exercise is to practice the mechanical part of creating a new
class definition and code that tests it.

*/
class Tile{
  char letter;
  int value;
  public Tile(char letter, int value){
    this.letter = letter;
    this.value = value;
  }
  public static void printTile(Tile t){
    System.out.println("letter: " + t.letter + ", value: " + t.value);
  }
  public static void testTile(){
    Tile tile = new Tile('Z',10);
    printTile(tile);
  }
  public static void main(String[] args) {
    testTile();
  }
}
