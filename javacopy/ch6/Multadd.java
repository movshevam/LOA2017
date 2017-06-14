class Multadd{
  public static void main(String[] args){
    double answer1 = multadd(1.0, 2.0, 3.0);
    System.out.println(answer1);

    double sin = Math.sin(degtorad(45));
    double cos = Math.cos(degtorad(45));
    double answer2 = multadd(cos, 1/2, sin);
    System.out.println(answer2);

    double ten = Math.log(10)/Math.log(10);
    double two = Math.log(2)/Math.log(10);
    double answer3 = multadd(2, ten, two);
    System.out.println(answer3);

  }
  public static double multadd(double a, double b, double c){
    return a*b + c;
  }
  public static double yikes(double x){
    double ee = Math.exp(-x);
    double square = Math.sqrt(1 - ee);
    double answer = multadd(x, ee, square);
    return answer;
  }
  public static double degtorad(double deg){
    return deg * Math.PI / 180;
  }
}
