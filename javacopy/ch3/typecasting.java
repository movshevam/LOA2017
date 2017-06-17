class typecasting{
  public static void main(String[] args) {
    System.out.println("Conversions to double: ");
    double da = (double) (1/3); System.out.println("(double) (1/3) = " + da); //da = 0.0
    double db = 1/3; System.out.println("1/3 = " + db); //db = 0.0
    double dc = 1/3.0; System.out.println("1/3.0 = " + dc); //dc = 0.33333...
    double dd = ((double) 1)/((double)3); System.out.println("((double) 1)/((double) 3) = " + dd); //dd = 0.33333...
    double de = 1.0/3; System.out.println("1.0/3 = " + de); //de = 0.33333...

    double df = (int) 'c' /9; System.out.println("(int) 'c'/9 = " + df); //df = 11.0
    double dg = 'c' / 9; System.out.println("'c'/9 = " + dg); //dg = 11.0
    double dh = 6%5.5; System.out.println("6%5.5 = " +dh); //dh = 1.0
    double di = (double) 3.33333 / 3; System.out.println("(double) 3.33333 /3 = " +di); //di = 1.11111
    double dj = 'c' + 4.0; System.out.println("'c' + 4.0 = "+dj );
    newLine();
    System.out.println("Conversions to int: ");
    //int ia = 5.0/2.0; System.out.println("5.0/2.0 = " + ia);
    //error: incompatible types: possible lossy conversion from double to int

    //int ib = (int) 5.0/2.0; System.out.println("(int) 5.0/2.0 = " + ib);
    //error: incompatible types: possible lossy conversion from double to int

    //int ic = ((int) 5.0 )/2.0; System.out.println("((int) 5.0)/2.0 = " + ic);
    //error: incompatible types: possible lossy conversion from double to int

    //int id = 5.0/((int) 2.0); System.out.println("5.0/((int) 2.0) = " + id);
    //error: incompatible types: possible lossy conversion from double to int

    //int ie = 5.0/(int) 2.0; System.out.println("5.0/(int) 2.0 = " + ie);
    //error: incompatible types: possible lossy conversion from double to int
    int ig = (int) 5.0 / (int) 2.0; System.out.println("(int) 5.0/(int) 2.0 = " + ig); //ig = 2
    int ih = 'c'/9; System.out.println("'c'/9 = " + ih); // ih = 11
    int ii = ((int) 'c') / 9; System.out.println("((int) 'c')/9 = " + ii); //ii = 11
    int ij = ((int)5.0)%((int) 2.0); System.out.println("((int) 5.0)%((int) 2.0) = " + ij); //ij = 1
    //int ik = 2147483648 * 2.0; System.out.println("2147483648 * 2.0 = " + ik);
    //error: integer number too large: 2147483648
    int il = (int) 656666L; System.out.println("(int) 656666L = " + il); //il = 656666
    //int im = 656666L; System.out.println("656666L = " + im);
    //error: incompatible types: possible lossy conversion from long to int
    byte something = 'a'; int ip = (int) something; System.out.println("(int) (byte) 'a' = " + ip);

    newLine();
    System.out.println("Conversions to float: ");
    float fa = (float) 3.3 / 3; System.out.println("(float) 3.3 /3 = " +fa); //fa = 1.1
    float fb = (float) 3.33333 / 3; System.out.println("(float) 3.33333 /3 = " +fb); //fb = 1.11111
    float fc = (float) 'c' / 9; System.out.println("(float) 'c' /9 = " + fc); //fc = 11.0
    float fd = 'c' / (float) 9; System.out.println("'c'/(float) 9 = " + fd); //fd = 11.0

    newLine();
    System.out.println("Conversions to short: ");
    short sa = (short) 65 / 5; System.out.println("(short) 65/5 = " + sa); //sa = 13
    //short sb = 65.0 / (short) 5; System.out.println("65.0/(short) 5 = " + sb);
    //error: incompatible types: possible lossy conversion from double to short
    short sc = (short) 65.0 / (short) 5; System.out.println("(short) 65.0/(short) 5 = " + sc); //sc = 13
    short sd = (short) 65.5 / (short) 5; System.out.println("(short) 65.5/(short) 5 = " + sd); //sd = 13
    short se = (short) 65.5 / 5; System.out.println("(short) 65.5/5 = " + se);  //se = 13
    short sf = (short) 32767; System.out.println("(short) 32767 = " + sf); //sf = 32767
    short sg = (short) 32768; System.out.println("(short) 32768 = " + sg); //sg = -32768
    short sh = (short) 40000; System.out.println("(short) 40000 = " + sh); //sg = -25536

    newLine();
    System.out.println("Conversions to long: ");
    long la = ((long) 65.0)/ 5; System.out.println("((long) 65.0) /5 = " + la); //la = 13
    //long lb = 65.0 / 5; System.out.println("65.0/5 = " + lb);
    //error: incompatible types: possible lossy conversion from double to long
    long lc = 65 / 5; System.out.println("65/5 = " + lc); //lc = 13

    newLine();
    System.out.println("Conversions to byte: ");
    byte ba = 'c' / 9; System.out.println("'c'/9 = " +ba); //ba = 11
    byte bb =  5/2; System.out.println("5/2 = " + bb); //bb = 2
    //byte bc = 5.0/2.0; System.out.println("5.0/2.0 = " + bc);
    //error: incompatible types: possible lossy conversion from double to byte
    byte bd = (byte) (5.0/2.0); System.out.println("(byte) (5.0/2.0) = " + bd); //bd = 2

    //byte be = 656666L; System.out.println("656666L = " + be);
    //error: incompatible types: possible lossy conversion from long to byte
    byte bf = (byte) 656666L; System.out.println("(byte) 656666L = " + bf);







  }
  public static void newLine(){
    System.out.println();
  }
}
