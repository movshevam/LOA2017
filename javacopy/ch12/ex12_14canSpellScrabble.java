/*
Exercise 12.14. In Scrabble each player has a set of tiles with letters on them,
and the object of the game is to use those letters to spell words. The scoring
system is complicated, but longer words are usually worth more than shorter
words. Imagine you are given your set of tiles as a String, like "quijibo" and
you are given another String to test, like "jib". Write a method called canSpell
that takes two Strings and returns true if the set of tiles can be used to spell
the word. You might have more than one tile with the same letter, but you can
only use each tile once.
NOT DONE:
Optional challenge: read the letters of the Strings only once.
*/
class ex12_14canSpellScrabble{
  public static void main(String[] args) {
    //tests with various words from a given set of tiles
    String setOfTiles = "quijibo";
    String test1 = "jib"; //this uses letters from set
    String test2 = "iib"; //this also uses letters from set
    String test3 = "bog"; //this uses a letter outside of set
    String test4 = "quijiboo"; //this is longer than set
    System.out.println(setOfTiles+"\t\t"+test1+"\t"+canSpell(setOfTiles, test1));
    System.out.println(setOfTiles+"\t\t"+test2+"\t"+canSpell(setOfTiles, test2));
    System.out.println(setOfTiles+"\t\t"+test3+"\t"+canSpell(setOfTiles, test3));
    System.out.println(setOfTiles+"\t\t"+test4+"\t"+canSpell(setOfTiles, test4));

  }
  /** Finds if a word can be made using only the chars in a set of tiles.
    @param set - String that contains a set of tiles(letters).
    @param test - String that is tested.
    @return true if test can be spelled using letters from set.
            false if test has more letters or uses other letters.
  */
  public static boolean canSpell(String set, String test){
    set = set.toLowerCase();  //convert set string to lowercase
    test = test.toLowerCase();//convert test string to lowercase
    int lengthS = set.length(); //# of letters in set
    int lengthT = test.length(); //length of test string.
    if ( lengthT > lengthS ) //if test string is longer than set string
      return false;          //then you can't make test out of set.
    int[] setH  = fillHistogram(set); //shows distribution of letters in set
    int[] testH = fillHistogram(test);//shows distribution of letters in test
    //traverse set Histogram, check if # of a given letter in test is less than
    //or equal to # of that letter in set.
    for(int i=0; i < setH.length; i++){
      if( testH[i] > setH[i]) //if test string uses letter with index i more
        return false;         //than total of that letter in the set, fail test.
    }
    return true;
  }

  /** Fill an array with a given string's distribution of letters.
    @param str - given string
    @return histogram - an array with elements that represent how many of each
            letter there are.
    NOTE: this is a pure function
    NOTE: a letter's value ranges from 97 to 122 in ASCII. Here letter 'a' has
          index of 0, letter 'z' has index of 25. histogram[index]++ increments
          number of times the letter occurs. Default # is zero.
  */
  public static int[] fillHistogram(String str){
    int length = str.length();  //length of string
    int[] histogram = new int[26];  //create array to hold distribution.
    //traverse through string and update distribution of letters.
    int indexOfLetter = 0; //index value of a letter.
    for(int i=0; i< length; i++){
      //char 'a' index is 0 instead of ASCII 97
      indexOfLetter = (int) str.charAt(i) - 97;
      histogram[indexOfLetter]++; //increment at index of given letter
    }
    return histogram;
  }
}
