/*
Exercise 12.11. Write a method called letterHist that takes a String as a
parameter and that returns a histogram of the letters in the String. The
zeroeth element of the histogram should contain the number of a’s in the
String (upper and lower case); the 25th element should contain the number
of z’s. Your solution should only traverse the String once.
*/
class ex12_11LetterHist{
  public static void main(String[] args) {
    String input = "Abracadabra";
    input = input.toLowerCase();
    int[] histogram = letterHist(input);
    // char letter = 0+97;
    // System.out.println("letter="+letter);
    for(int i=0; i<26; i++){
      char letter = (char)(i + 97);
      System.out.println(letter+"\t"+histogram[i]);
    }
  }
  public static int[] letterHist(String str){
    int[] histogram = new int[26];
    int count =0;
    for(int i=0; i<str.length();i++){
      char letter = str.charAt(i);
      int index = (int)letter - 97;
      //System.out.println(letter);
      histogram[index]++;
    }
    return histogram;
  }
}
