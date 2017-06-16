/*Integer operators*/
class int_operators {
  public static void main(String[] args){
    int hour, minute;
    hour = 11;
    minute = 59;
    System.out.print("Number of minutes since midnight: ");
    System.out.println(hour*60 + minute);
    System.out.print("Fraction of the hour that has passed: ");
    System.out.println(minute/60);
    System.out.print("Percentage of the hour that has passed: ");
    System.out.println(minute*100/60);
    //Integer division always rounds down
    System.out.println("2/2 = " + 2/2);
    System.out.println("1/2 = " + 1/2);
    //Multiplication and division have precedence over addition and subtraction
    //operators with the same precedence are evaluated left to right
  }
}
