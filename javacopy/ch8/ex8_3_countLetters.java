class ex8_3_countLetters{
  public static void main(String[] args){
    countLettersCA("Mississippi", 's');
    countLettersIO("Mississippi", 's');
    // System.out.println();
  }
  public static void countLettersCA(String s, char a){
    int length = s.length();
    int count = 0;

    int index = 0;
    while(index < length){
      if (s.charAt(index) == a){
        count++;
      }
      index++;
    }
    System.out.println(count);
  }
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
