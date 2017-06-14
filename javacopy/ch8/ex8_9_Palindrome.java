/*
Exercise 8.9
1. Create a new program named Palindrome.java.
2. Write a method named first that takes a String and returns the first
letter, and one named last that returns the last letter.
3. Write a method named middle that takes a String and returns a substring that
contains everything except the first and last characters. Hint: read the
documentation of the substring method in the String class. Run a few tests to
make sure you understand how substring works before you try to write middle.
What happens if you invoke middle on a string that has only two letters? One
letter? No letters?
4. The usual definition of a palindrome is a word that reads the same both
forward and backward, like “otto” and “palindromeemordnilap.” An alternative
way to define a property like this is to specify a way of testing for the
property. For example, we might say, “a single letter is a palindrome, and a
two-letter word is a palindrome if the letters are the same, and any other word
is a palindrome if the first letter is the same as the last and the middle is a
palindrome.” Write a recursive method named isPalindrome that takes a String and
that returns a boolean indicating whether the word is a palindrome or not.
5. Once you have a working palindrome checker, look for ways to simplify it by reducing the number of conditions you check. Hint: it might be useful to adopt the definition that the empty string is a palindrome.
6. On a piece of paper, figure out a strategy for checking palindromes iteratively. There are several possible approaches, so make sure you have a solid plan before you start writing code.
7. Implement your strategy in a method called isPalindromeIter.

------ Not done:
8. Optional: Appendix B provides code for reading a list of words from a
file. Read a list of words and print the palindromes.

*/
class ex8_9_Palindrome {
  public static void main(String[] args) {
    String french = "bon appetit!";
    String a = "a";
    String two = "22";
    String empty = "";
    System.out.println(first(french));
    System.out.println(last(french));
    System.out.println(middle(french));
    // System.out.println(french.substring( french.indexOf(first(french)) , french.indexOf(last(french))  ));
/*
    System.out.println(isPalindrome(french));
    System.out.println(isPalindrome(a));
    System.out.println(isPalindrome(two));
    System.out.println(isPalindrome(empty));
*/
    System.out.println(isPalindromeIter("abbbbba"));
    System.out.println(isPalindromeIter("aba"));
    System.out.println(isPalindromeIter("baa"));
    /*
    these throw an out of bounds exception if method uses substring:
    System.out.println(middle(a));
    System.out.println(middle(two));
    System.out.println(middle(empty));
    */
  }
  public static char first(String s){
    if(s.length() < 1){
      System.exit(0);
    }
    return s.charAt(0);
  }
  public static char last(String s){
    int cslength = s.length() -1 ;
    return s.charAt(cslength);
  }
  public static String middle(String s){
    if(s.length() == 1){
      return "ERROR";
    }
    if(s.length() == 2){
      return "";
    }
    int cslength = s.length() - 1;
    String substr = "";
    for(int i=1; i < cslength; i++){
      substr += s.charAt(i);
    }
    String result = s.substring(1,cslength);

    return result;
  }
  public static boolean isPalindrome(String s){
    if(s.length() < 2){
      return true;
    }
    char ch1 = first(s);  int num1 = s.indexOf(ch1);
    char ch2 = last(s);   int num2 = s.indexOf(ch2);
    if(ch1 == ch2){
      if(s.length() == 2) {
        return true;
      }
      else{
        return isPalindrome(s.substring(num1, num2));
      }
    }
    else{
      return false;
    }



  }
  public static boolean isPalindromeIter(String s){
    int length = s.length();
    int i = length/2;
    int size = length/2;
    if(length < 2){
      return true;
    } //if string is 1 char or less
    if(length%2 == 0) {
      while(i > 0){
        if(check( s.charAt(size - i), s.charAt(size + i - 1)) == true){
          i--;
        } // end of check w iteration
        else{
          return false;
        } //end of else
      } // end of while
      return true;
    } //end of if //if string is even in length

    if(length%2 == 1){
      while(i > 0){
        if(check(s.charAt(size - i), s.charAt(size + i)) == true){
          i--;
        } //end of if check and iteration
        else{
          return false;
        } //end of else
      } // end of while
      return true;
    } //end of massive if //if string is odd in length

    return false;
  }
  public static boolean check(char a, char b){
    if(a == b){
      return true;
    }
    return false;
  }
}
/*

if( ch1 == ch2 ){
  if(s.length() == 2){
    return true;
  }else{
    String sbstr = s.substring(ch1, ch2 );
    return isPalindrome(sbstr);
  }
}
if(s.length() == 1){
  return true;
}
else{
  return false;
}
*/
