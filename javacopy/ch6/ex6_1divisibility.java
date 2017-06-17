class ex6_1divisibility{
  public static void main(String[] args){
    int a = 35;
    int b = 77;
    boolean answer = isDivisible(a,b);
    boolean a1 = isDivisible(35,7), a2 = isDivisible(3,37);
    System.out.println(answer);
  }
  public static boolean isDivisible(int n, int m) {
    if(n%m == 0){
      return true;
    }else{
      return false;
    }
  }
}
