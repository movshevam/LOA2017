// Write a method that takes a String as an argument and that prints the letters
// backwards all on one line.
class ex8_1_printBack{
  public static void main(String[] args) {
    printBackwards("apple");
  }
  public static void printBackwards(String s){
    // "a p p l e"  length = 5
    //  0 1 2 3 4
    int i = s.length() - 1;
    while(i >= 0){
      System.out.print( s.charAt(i) );
      i--;
    }
      System.out.println("");
  }
}
