class floatpoint{
  public static void main(String[] args) {
    double pi = 3.14159; //Initialization
    double y = 1; //technically illegal but Java allows it
    double a = 1/3; //integer division
    double b = 1/3.0;
    double c = 1.0/3.0;
    double d = (double) 1/3; //typecasting has precedence
    double e = (double) 1 / (double) 3;
    double f = 1.0 /3;
    System.out.println("1/3 = " + a + "\n"
      + "1/3.0 = " + b + "\n"
      + "1.0/3.0 = " + c + "\n"
      + "(double) 1/3 = " + d + "\n"
      + "(double) 1 / (double) 3 = " + e + "\n"
      + "1.0 /3 = " + f + "\n");

  }
}
