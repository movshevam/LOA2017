class Power{
public static void main(String[] args){
  System.out.println(power(4, 3));
}
public static double power(double x, int n){
  int i = 1;
  int result = 1;
  while( i <= n){
      result *= x;
      i++;
  }
  return result;
}
}
