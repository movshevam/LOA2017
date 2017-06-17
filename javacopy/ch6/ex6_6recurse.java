/*
Exercise 6.8. 1. Create a program called Recurse.java and type in the following
methods:
// first: returns the first character of the given String
         public static char first(String s) {
            return s.charAt(0);
         }
         // last: returns a new String that contains all but the
         // first letter of the given String
         public static String rest(String s) {
             return s.substring(1, s.length());
         }
         // length: returns the length of the given String
         public static int length(String s) {
             return s.length();

2. Write some code in main that tests each of these methods. Make sure they work,
and make sure you understand what they do.
3. Write a method called printString that takes a String as a parameter and that
prints the letters of the String, one on each line. It should be a void method.
4. Write a method called printBackward that does the same thing as printString
but that prints the String backward (one character per line).
5. Write a method called reverseString that takes a String as a parameter and
that returns a new String as a return value. The new String should contain the 
same letters as the parameter, but in reverse order. For example, the output of
the following code
         String backwards = reverseString("Allen Downey");
         System.out.println(backwards);
should be
yenwoD nellA
*/
class ex6_6recurse{
  public static void main(String[] args) {
    String str = "Bures-sur-Yevette";
    System.out.println(first(str));
    System.out.println(rest(str));
    System.out.println(length(str));
    printString(str);
    printBackward(str);
    System.out.println(reverseString(str));

  }
  /* Returns the first character of the given String.*/
  public static char first(String s){
    return s.charAt(0);
  }
  /* Returns a new String that contains all but the first letter of given string.*/
  public static String rest(String s){
    return s.substring(1,s.length());
  }
  /* Returns the length of the given string.*/
  public static int length(String s){
    return s.length();
  }
  /* Prints the letters of the string, one on each line.
    @param s - the string.
  */
  public static void printString(String s){
    int i =0;
    int length = length(s);
    while(i < length){
      System.out.println(first(s));
      s = rest(s);
      i++;
    }
  }
  /* Print string backwards one character per line
    @param s - string
  */
  public static void printBackward(String s){
    String str = "";
    int length = s.length();
    int i=1;
    while(i <= length){
      str+= s.charAt(length - i);
      i++;
    }
    i = 0;
    while(i < length){
      System.out.println(first(str));
      str = rest(str);
      i++;
    }
  }
  /*
  */
  public static String reverseString(String s){
    String str = "";
    int length = s.length();
    int i=1;
    while(i <= length){
      str+= s.charAt(length - i);
      i++;
    }
    return str;
  }
}
