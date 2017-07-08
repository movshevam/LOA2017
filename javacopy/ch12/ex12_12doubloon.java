/*
Exercise 12.12. A word is said to be a “doubloon” if every letter that appears
in the word appears exactly twice. For example, the following are all the
doubloons I found in my dictionary: Abba, Anna, appall, appearer, appeases,
arraigning, beriberi, bilabial, boob, Caucasus, coco, Dada, deed, Emmett,
Hannah, horseshoer, intestines, Isis, mama, Mimi, murmur, noon, Otto, papa,
peep, reappear, redder, sees, Shanghaiings, Toto. Write a method called
isDoubloon that returns true if the given word is a doubloon and false otherwise.
*/
class ex12_12doubloon{
  public static void main(String[] args) {
      String str = "Anna";
      System.out.println(str);
      System.out.println(isDoubloon(str));
      System.out.println(isDoubloon("Misha"));
  }
  /** Checks if every letter in string appears exactly twice.
    @param str - String
    @return true if string is a doubloon
            false if string is not a doubloon
     NOTE: str.length() is a function. histogram.length is an instance field.
           this is also a pure function.
     HOW THIS WORKS:
     1) Convert input string into lower case
     2) Find length of string: if it's odd return false
     3) Fill in a histogram with distribution of all letters. There should be
        an even number of any letter - either 0 or  2,4,6.... etc.
     4) Check if values in histogram follow above rule. If they don't,
        return false. Otherwise string is a Doubloon.
  */
  public static boolean isDoubloon(String str){
    str = str.toLowerCase();  //convert string to lower case
    int length = str.length(); //length of string.
    if(length%2 == 1) return false;  //if length is 1, only letter appears once.
    int[] histogram = fillHistogram(str); //fill array with number of occurances
                                          //of each letter of the alphabet.
    for(int i=0; i<histogram.length;i++){
      //if an alphabet letter appears not twice or never, string isn't a doubloon.
      if(histogram[i] != 2 && histogram[i] != 0) return false;
    }
    return true; //otherwise return true
  }



  /** Fills an array with number every letter in alphabet occurs in a given string.
    @param str - given string.
    @return histogram - an array with elements that represent how many of each
            letter there are.
    NOTE: this is a pure function.
    NOTE: a letter's value ranges from 97 to 122 in ASCII. Here letter 'a' has
          index of 0, letter 'z' has index of 25. histogram[letterVal]++ increments
          number of times the letter occurs. Default # is zero.
  */
  public static int[] fillHistogram(String str){
    int length = str.length(); // length of string
    int[] histogram = new int[26]; //create an array the size of an alphabet
    //go through the string and record number of times a letter appears.
    for(int i=0; i<length; i++){
      //letterVal: index value of a letter
      int letterVal = (int) str.charAt(i) - 97;  //let int value of 'a' start with 0 instead of ASCII 97.
      histogram[letterVal]++;  //increment at index of given letter.
                            //histogram[0] has # of times 'a' appears
    }
    return histogram; //return filled array.
  }




}
