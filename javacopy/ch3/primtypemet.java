class primtypemet{
  public static void main(String[] args){
    int a = 6;
    foo(a);
    System.out.println(a);
    a = goo(a);
    System.out.println(a);
  }
  public static void foo(int a){
    a++;
  }
  public static int goo(int a){
    a = 5;
    return a;
  }
}
