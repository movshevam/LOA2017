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
  }
  public static boolean isDoubloon(String str){
    str = str.toLowerCase();
    int length = str.length();
    if(length%2 == 1) return false;
    int[] histogram = fillHistogram(str);
    for(int i=0; i<histogram.length();i++){
      if(histogram[i] > 2) return false;
      if(histogram[i] < 2) return false;
    }
    return true;
  }

  public static int[] fillHistogram(String str){
    str = str.toLowerCase();
    int length = str.length();
    int[] histogram = new int[26];
  //   // for(int i=0; i<length; i++){
  //   //   int letter = (int) str.charAt(i) - 97;
  //   //   histogram[index]++;
  //   // }
    return histogram;
  }

}
