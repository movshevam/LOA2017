/*
Exercise 6.3. If you are given three sticks, you may or may not be able to
arrange them in a triangle. For example, if one of the sticks is 12 inches long
and the other two are one inch long, you will not be able to get the short sticks
to meet in the middle. For any three lengths, there is a simple test to see if
it is possible to form a triangle: “If any of the three lengths is greater than
the sum of the other two, then you cannot form a triangle. Otherwise, you can.”
Write a method named isTriangle that it takes three integers as arguments, and
that returns either true or false, depending on whether you can or cannot form a
triangle from sticks with the given lengths.The point of this exercise is to use
conditional statements to write a value method.

Modification: add on functions to check if lengths make triangle right,
equilateral, or isoceles.
*/
class ex6_3triangle{
  public static void main(String[] args){
    int a = 3, b = 3, c = 3;
    System.out.println(isTriangle(a, b, c));
    System.out.println(isRight(a, b, c));
    System.out.println(isEquilateral(a, b, c));
    System.out.println(isIsoceles(a, b, c));
  }
  /* Determines if given lengths make a triangle
  */
  public static boolean isTriangle(int a, int b, int c){
    if( (a > b+c) || (b > a+c) || (c > a+b) ){
      return false;
    }else{
      return true;
    }
  }
  public static boolean isRight(int a, int b, int c){
    double asq, bsq, csq;
    asq = Math.pow(a,2);
    bsq = Math.pow(b,2);
    csq = Math.pow(c,2);

    if((asq + bsq == csq) || (asq + csq == bsq) || (csq + bsq == asq)){
      return true;
    }else{
      return false;
    }
  }
  public static boolean isEquilateral(int a, int b, int c){
    if( a == b && b == c && a == c) {
      return true;
    }else{
      return false;
    }
  }
  public static boolean isIsoceles(int a, int b, int c){
    if(( a == b && a == c) || ( b == a && b == c) || ( c == a && c == b)) {
      return true;
    }else{
      return false;
    }

  }

}
