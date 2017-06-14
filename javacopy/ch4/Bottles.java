class Bottles{
  public static void main(String[] args){
    int n = 4;
    printLine(n);
  }
  public static void printLine(int n){
    if(n >= 0){
      if(n == 0){
        System.out.println("No bottles of beer on the wall, no bottles of beer,"
        + " ya’ can’t take one down, ya’ can’t pass it around, ’cause there are"
        + " no more bottles of beer on the wall!");
      }
      else{
        System.out.println(n + " bottles of beer on the wall, " + n + " bottles of beer, ya' take "
        + "one down, ya pass it arounf," + (n-1) + " bottles of beer on the wall.");
        n--;
        printLine(n);
      }
    } //giant if
  }
}
