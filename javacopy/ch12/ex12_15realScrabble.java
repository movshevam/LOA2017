/*
Exercise 12.15. In real Scrabble, there are some blank tiles that can be used
as wild cards; that is, a blank tile can be used to represent any letter.
Think of an algorithm for canSpell that deals with wild cards. Don’t get bogged
down in details of implementation like how to represent wild cards. Just
describe the algorithm, using English, pseudocode, or Java.
*/
class ex12_15realScrabble{
  public static void main(String[] args) {
    //test a couple cases with given set
    String set = "b  a  n  k";
    String test1 = "bank";  //uses all given letters
    String test2 = "banks"; //uses all letters + 1
    System.out.println(set+"\t"+test1+"\t"+canSpell(set, test1));
    System.out.println(set+"\t"+test2+"\t"+canSpell(set, test2));
    System.out.println(set+"\t"+"anna"+"\t"+canSpell(set, "anna"));
    System.out.println(set+"\t"+"america"+"\t"+canSpell(set, "america"));
    System.out.println(set+"\t"+"elephantus"+"\t"+canSpell(set, "elephantus"));

  }
  /** Checks if a word can be spelled using a given set of letters.
    @param set - given set, in String form.
    @param test - String to check.
    @return true if test can be made from set
            false if test length is bigger than set, if set doesnt have enough
            wild cards.
    NOTE: this is a pure function
    NOTE: Fill in a histogram(distibution of all letters and wildCards)
  */
  public static boolean canSpell(String set, String test){
    set = set.toLowerCase();
    test = test.toLowerCase();
    //semi wrapper function?
    //if test is made of more letters than set, return false
    if (test.length() > set.length()) return false;
    //fillHistogram for both strings
    int[] setH = fillHistogram(set);
    int[] testH = fillHistogram(test);
    //check if setH = testH without checking SPACE elements
    //get leftover letters this way
    int leftover = 0; //letters that could be used with wildCard
    for(int i=0; i < setH.length - 1; i++){
      if(testH[i] > setH[i])
        leftover += testH[i]-setH[i]; //get remaining letters
    }
    if(leftover > setH[setH.length - 1]) return false;
    //if testH[i] > setH[i], remaining letters +=testH[i]-setH[i]
    //
    //get how many remainingLetters there are, put into function checkWildCard
    return true;
  }
  public static int[] fillHistogram(String str){
    //fill distribution of string with alphabet + wildCard space
    int[] histogram = new int[27];
    //traverse sring, update distribution:
    int indexOfLetter = 0; //index of letter in this context
    for(int i=0; i< str.length(); i++){
      if( (int) str.charAt(i) == 32) histogram[26]++;
      else
        indexOfLetter = (int) str.charAt(i) - 97;
        histogram[indexOfLetter]++;
    }
    return histogram;
  }

}
