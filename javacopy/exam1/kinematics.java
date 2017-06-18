import java.util.Scanner;
public class kinematics{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    double b = input.nextDouble();
    a = convert(a);
    b = convert(b);
    double L1 = 0.5;
    double L2 = 0.3;
    double x = L1 * Math.cos(a) + L2*Math.cos(a+b);
    double y = L1* Math.sin(a) + L2*Math.sin(a+b);
    System.out.println("("+x+", "+y+")" );

  }
  public static double convert(double degree){
    return degree / 180 * Math.PI;
  }
}
