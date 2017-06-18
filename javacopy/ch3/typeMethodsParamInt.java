/*Methods type void and int, using int*/
class typeMethodsParamInt{
  public static void main(String[] args){
    int a = 6;
    foo(a);
    System.out.println(a);
    int b = 5;
    a = goo(a,b);
    System.out.println(a);
    System.out.println(b);
  }
  public static void foo(int a){
    a++;
  }
  public static int goo(int a, int b){
    a = 5;
    b++;
    return a;
  }
}
