/*Practice with Math methods and doubles*/
class mathMethods{
  public static void main(String[] args){
    //double name = Math.method(argument(s));
    //Math methods use exclusively double types
    double root = Math.sqrt(17.0);
    double degrees = 90;

    double angle = degrees * 2 * Math.PI / 360.0;
    //Java assumes values used for trig functions are in radians
    double height = Math.sin(angle);

    int x = (int) Math.round(Math.PI * 20.0); //typecasting
    System.out.println("x is rounded off to nearest integer: " + x);




  }
}
