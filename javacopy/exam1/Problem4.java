public class Problem4{
  public static int mystery(int a, int b) {
    int m=(a+b)/2;
    return m;
  }
  public static void main(String[] args)
{
int a = 1;
int b = 5;
int m = 6;
m = mystery(a,b);
System.out.println(m);
b = mystery(a,m-1);
    System.out.println(b);
    a = mystery(m+1, b);
    System.out.println(a);
  }
}
