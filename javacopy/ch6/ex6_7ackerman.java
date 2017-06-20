/*
Exercise 6.7. The purpose of this exercise is to translate a recursive definition
into a Java method. The Ackerman function is defined for non-negative integers as
follows:
A(m,n) = / n+1      if m =0
        { A(m-1, 1) if m>0 and n=0
        \ A(m-1, A(m,n-1)) if m>0 and n>0
Write a method called ack that takes two ints as parameters and that computes
and returns the value of the Ackerman function.
Test your implementation of Ackerman by invoking it from main and printing the
return value.
WARNING: the return value gets very big very quickly. You should try it only for
small values of m and n (not bigger than 2).
*/
class ex6_7ackerman{
  public static void main(String[] args){
    int answer = ack(5,5);
    System.out.println(answer);
  }
  public static int ack(int m, int n){
    if( m == 0){          //first line of defintion
      return n + 1;
    }if( m > 0 && n == 0){  //second line of definition
      return ack(m-1, 1);
    }if(m > 0 && n > 0){  //third line of definition
      int temp = ack(m, n-1);
      return ack(m-1, temp);
    }else{
      return -1;
    }
  }
}
