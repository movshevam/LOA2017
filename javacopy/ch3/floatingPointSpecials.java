/*These create a runtime error(ArithmeticException) for dividing by zero. Compiles*/
class floatingPointSpecials{
  public static void main(String[] args) {
    float inf = 1/0;
    float neginf = -1/0;
    float negzero = -1/inf;
    float nan = 0/0;
    System.out.println(inf);
    System.out.println(neginf);
    System.out.println(negzero);
    System.out.println(nan);

  }
}
