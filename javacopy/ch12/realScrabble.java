class realScrabble{
  public static void main(String[] args) {
    String set = "b  a  n  k";
    String test1 = "bank";
    String test2 = "banks";
    System.out.println(set+"\t"+test1+"\t"+canSpell(set, test1));
    System.out.println(set+"\t"+test2+"\t"+canSpell(set, test2));
    System.out.println(set+"\t"+"anna"+"\t"+canSpell(set, "anna"));
    System.out.println(set+"\t"+"america"+"\t"+canSpell(set, "america"));
    System.out.println(set+"\t"+"elephantus"+"\t"+canSpell(set, "elephantus"));


  }
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
