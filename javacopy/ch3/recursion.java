class recursion{
  public static void main(String[] args){
    int n = 4;
    foo(n);
  }
  public static void foo(int n){
    while(n!=3){
      System.out.println("I am printing out " + n);
      foo(n);
    }
  }
}
