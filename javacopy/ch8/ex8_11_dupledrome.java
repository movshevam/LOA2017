/*
Exercise 8.11. A dupledrome is a word that contains only double letters, like
“llaammaa” or “ssaabb”. I conjecture that there are no dupledromes in common
English use. To test that conjecture, I would like a program that reads words
from the dictionary one at a time and checks them for dupledromity.
Write a method called isDupledrome that takes a String and returns a boolean
indicating whether the word is a dupledrome.
*/
class ex8_11_dupledrome{
  public static void main(String[] args) {
    System.out.println(isDupledrome("ssaabb"));
    System.out.println(isDupledrome("mama"));

  }
  public static boolean isDupledrome(String s){
    int length = s.length();
    if(length < 2 || length%2 == 1){    // if length is odd or less than 2
      return false;
    }
    int i = 0;
    while(i < length - 1){
      if(s.charAt(i) == s.charAt(i+1)){
        i = i + 2;
      }
      else{
        return false;
      }
    }
  return true;
  }
}
