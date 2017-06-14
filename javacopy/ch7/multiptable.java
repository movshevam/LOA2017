class multiptable{
  public static void main(String[] args){
    int i = 1;
    while(i <= 6){
      printMultiples(i);
      i++;
    }

  }
  public static void printMultiples(int n){
    int i = 1;
    while(i<=6){
      System.out.print(n*i + "   ");
      i++;
    }
    System.out.println("");
  }
}
