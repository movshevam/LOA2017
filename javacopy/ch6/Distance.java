class Distance{
  public static void main(String[] args){
    distance(0.1, 0.1, 0.0, 5.0);
  }
  public static void distance(double x1, double y1, double x2, double y2){
    double a = x2 - x1;
    double b = y2 - y1;
    double sumsq = sumSquares(a, b);
    double answer = Math.sqrt(sumsq);
    System.out.println(answer);

  }
  public static double sumSquares(double a, double b){
    double asq = Math.pow(a,2);
    double bsq = Math.pow(b,2);
    return asq + bsq;
  }
}
