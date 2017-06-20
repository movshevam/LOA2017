class ex6_10gcd{
  public static void main(String[] args){
    int r = gcd(-17,13);
    System.out.println(r);
  }
  public static int gcd(int a, int b){
    int r = 0;
    while(b!=0){
      r = a%b; ////remainder
      int temp = b;
      a = temp; //make b the value of a
      b = r; //make r the value of b and repeat
    }
    return a;
  }
}
