/*
Exercise 8.3. Encapsulate the code in Section 8.7 in a method named
countLetters, and generalize it so that it accepts the string and the letter
as arguments.
Then rewrite the method so that it uses indexOf to locate the a’s, rather than
 checking the characters one by one.
*/
class ex8_3_countLetters{
  public static void main(String[] args){
    countLettersCA("Mississippi", 's');
    countLettersIO("Durian badly stinks", 'a');
    // System.out.println();
  }
  public static void countLettersCA(String s, char a){
    int length = s.length();  //string
    int count = 0;

    int index = 0;
    //traverse through string to find char a
    while(index < length){
      if (s.charAt(index) == a){
        count++;
      }
      index++;
    }
    System.out.println(count);
  }
  //count letters using indexOf
  public static void countLettersIO(String s, char a){
    int length = s.length();
    int count = 0;

    int index = 0;
    int location  = 0;
    while(index < length){
      if( s.indexOf(a, index) == -1){
        break;
      }else{
        location = s.indexOf(a, index);
        index = location + 1;
        count++;
      }
    }
    System.out.println(count);
  }
}
