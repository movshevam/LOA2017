/*
Exercise 8.10. A word is said to be “abecedarian” if the letters in the word
appear in alphabetical order. For example, the following are all 6-letter
English abecedarian words.
abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, behint, beknow, bijoux,
biopsy, cestuy, chintz, deflux, dehors, dehort, deinos, diluvy, dimpsy

1. Describe a process for checking whether a given word (String) is abecedarian,
 assuming that the word contains only lower-case letters. Your process can be
 iterative or recursive.
  --> see methods isAbecedarianI for iterative process and
  isAbecedarianR for recursive process.
2. Implement your process in a method called isAbecedarian.
*/
class ex8_10_abecedarian{
  public static void main(String[] args) {
    System.out.println(isAbecedarianI("entropy"));
    System.out.println(isAbecedarianI("abcdefgH"));
    System.out.println(isAbecedarianI("abcdeeeH"));
    System.out.println();
    System.out.println(isAbecedarianR("entropy"));
    System.out.println(isAbecedarianR("abcdefgH"));
    System.out.println(isAbecedarianR("abcdeeeH"));


  }
  public static boolean isAbecedarianI(String s){
    s = s.toLowerCase();
    int length = s.length();
    if(length < 2){
      return true;
    }
    int i = 0;
    while(i < length - 1){
      if(s.charAt(i) > s.charAt(i+1)){
        return false;
      }
      i++;
    }
    return true;
  }
  public static boolean isAbecedarianR(String s){
    s = s.toLowerCase();
    int length = s.length();
    int i = 0;
    if(length < 2) {
      return true;
    }
    if(s.charAt(i) <= s.charAt(i+1)){
      return isAbecedarianR(s.substring(i+1));
    }
    return false;
  }
}
