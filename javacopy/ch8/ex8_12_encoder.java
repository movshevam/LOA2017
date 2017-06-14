/*
1. The Captain Crunch decoder ring works by taking each letter in a string and
adding 13 to it. For example, ’a’ becomes ’n’ and ’b’ becomes ’o’. The letters
“wrap around” at the end, so ’z’ becomes ’m’.
Write a method that takes a String and that returns a new String containing the
encoded version. You should assume that the String contains upper and lower case
letters, and spaces, but no other punc- tuation. Lower case letters should be
tranformed into other lower case letters; upper into upper. You should not
encode the spaces.
2. Generalize the Captain Crunch method so that instead of adding 13 to the
letters, it adds any given amount. Now you should be able to encode things by
adding 13 and decode them by adding -13. Try it.
*/
class ex8_12_encoder{
  public static void main(String[] args) {
    System.out.println(CC("abc", 0));
    System.out.println(CC("AkMB", 1));
    System.out.println(CC("I AM", 25));
    System.out.println(CC("I am captain crunch", -13));

  }
  public static String CC(String s, int shift){
    if(shift< 0){
      shift += 26;
    }
    int length = s.length();
    String str = "";
    int i = 0;
    while(i < length){
      if( s.charAt(i) == ' '){ str += ' ';  }           // space character

      // System.out.println("before "+ (int) s.charAt(i));
      if ( (int) s.charAt(i) > 64 && (int) s.charAt(i) < 91) { //capital letters
        if( s.charAt(i) + shift > 90){
          // System.out.println("greater than 90 ");
          str+= (char) (s.charAt(i) + shift - 26);
          //i++;
        }
        else{
          // System.out.println("less than 90");
          str +=  (char)(s.charAt(i) + shift);
          // System.out.println("shift =" +shift);
          // System.out.println("string:" + str);
          //i++;
        }
      }
      // System.out.println("value of char:" + s.charAt(i));
      // System.out.println("after " + ((int) s.charAt(i)) );
      if ( (int) s.charAt(i) > 96 && (int) s.charAt(i) < 123) {
        if( s.charAt(i) + shift > 122){
          str+= (char) (s.charAt(i) + shift - 26);
          // i++;
        }
        else{
          str +=  (char)(s.charAt(i) + shift);
          // i++;
        }
      }
      // System.out.println("End of while");
      i++;
    }
    return str;
  }
}
