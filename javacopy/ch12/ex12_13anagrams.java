/*
Exercise 12.13. Two words are anagrams if they contain the same letters (and
the same number of each letter). For example, “stop” is an anagram of “pots”
and “allen downey” is an anagram of “well annoyed.” Write a method that takes
two Strings and returns true if the Strings are anagrams of each other.
NOT DONE:
Optional challenge: read the letters of the Strings only once.
*/
class ex12_13anagrams{
  public static void main(String[] args) {
    //Various Strings for testing:
    String a = "stop";
    String b = "pots"; //a and b are anagrams. check.
    String c = "potter"; //c starts with the same letter as b, different length
    String d = "pans";  //d starts with same letter as b, has same length
    String e = "allen downey";
    String f = "well annoyed";  //testing for SPACE character
    String g = "4+5x=7";
    String h = "5+7=4x"; //testing with numbers
    System.out.println(a+"\t"+b+"\t"+areAnagrams(a,b));
    System.out.println(b+"\t"+c+"\t"+areAnagrams(b,c));
    System.out.println(b+"\t"+d+"\t"+areAnagrams(b,d));
    System.out.println(e+"\t"+f+"\t"+areAnagrams(e,f));
    System.out.println(g+"\t"+h+"\t"+areAnagrams(g,h));



  }
  /** Checks if two strings are anagrams of each other.
    @param a - one string.
    @param b - the other string.
    @return true if both strings use the same characters, equal number of times.
            false if strings differ in length, char count doesn't match up, different chars are used.
  */
  public static boolean areAnagrams(String a, String b){
    int lengthA = a.length(); //length of first string
    int lengthB = b.length(); //length of second string
    if(lengthA != lengthB){return false;} //lengths are different return false
    int[] histogramA = fillHistogram(a); //fill histogram for first string
    int[] histogramB = fillHistogram(b); //contains # of times a char occurs.
    //check if histograms are the same using arraysAreEqual method.
    if(arraysAreEqual(histogramA, histogramB) == false)
      return false; //arrays are not the same, return false.
    return true;
  }
  /** Fills an array with # every letter, number, punctuation mark and space appears in a string.
    @param str - given string.
    @return histogram - an array where elements represent # of times a char appears.
    NOTE: this is a pure function.
    NOTE: character used on typical keyboard range from 32 to 126. This includes
          SPACE char and punctuation marks. histogram[0] contains # of times
          SPACE occurs. histogram[94] - # of times ~ appears. Includes both
          lowercase and uppercase letters.
  */
  public static int[] fillHistogram(String str){
    int length = str.length();  //String length
    int[] histogram = new int[95];  //create array of ints size 95
    //traverse though string, record # of times a char appears into histogram.
    for(int i=0; i<length; i++){
      //indexOfChar is index of given character within histogram.
      int indexOfChar = (int) str.charAt(i) - 32;  //let int value of SPACE be 0 instead of ASCII 32.
      histogram[indexOfChar]++; //increment at index of given char.
    }
    return histogram; //return filled array.
  }

  /** Check whether two arrays are equal.
    @param a - one array of ints.
    @param b - another array of ints.
    @return true if arrays are equal.
            false if arrays differ in length or have different elements.
  */
  public static boolean arraysAreEqual(int[] a, int[] b){
    int lengthA = a.length; //length of first string
    int lengthB = b.length; //length of second string
    if(lengthA != lengthB) return false; //if lengths differ, return false.
    //traverse through both arrays to check if elements are equal.
    for(int i=0; i< lengthA; i++){
      if(a[i] != b[i])
        return false;  //if elements at the same index aren't equal, return false.
    }
    return true;  //return true otherwise.
  }
}
