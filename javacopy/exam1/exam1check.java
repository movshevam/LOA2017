import java.util.Scanner;
class exam1check{
  int a, b;
  double d;
  char c;
  public exam1check(){
    this.a = 0;
    this.b = 0;
    this.d = 0;
    this.c = 'a';
  }
  public exam1check(int a){
    this.a = a;
  }
  public exam1check(double d){
    this.d = d;
  }
  public exam1check(char c){
    this.c = c;
  }
  public exam1check(int a, int b){
    this.a = a;
    this.b = b;
  }
  public exam1check(int b, double d){
    this.b = b;
    this.d = d;
  }
  public exam1check(int a, char c){
    this.a = a;
    this.c = c;
  }
  public exam1check(double d, char c){
    this.d = d;
    this.c = c;
  }
  public exam1check(int a, int b, double d){
    this.a = a;
    this.b = b;
    this.d = d;
  }
  public exam1check(int a, int b, char c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public exam1check(int a, int b, double d, char c){
    this.a = a;
    this.b = b;
    this.d = d;
    this.c = c;
  }

  public static void main(String[] args) {
    int _T_R_U_E_ = 6;
    int _F_A_L_$_E_ = 5;
    int $hello = 0;

    int ____ = 5;
    //System.out.println(_F_A_L_$_E_);

    // exam1check Exam = new exam1check();
    // exam1check Exam2 = new exam1check(2);
    // exam1check Exam3 = new exam1check(2.0);
    // exam1check Exam4 = new exam1check('a');
    // exam1check Exam5 = new exam1check(2,4);
    // exam1check Exam6 = new exam1check(2,4.0);
    // exam1check Exam7 = new exam1check(2,'a');
    // exam1check Exam8 = new exam1check(2, 5, 4.0);
    // exam1check Exam9 = new exam1check(2,4,4.0, 'a');
    // exam1check Exam10 = new exam1check(4.0, 'a');
    // exam1check Exam11 = new exam1check(2,3, 'a');

    // int System.out = 66;
    // System.out.println(System.out);

    // byte kaka = 15;
    // int byaka = 15;
    // System.out.println(kaka + " "+byaka);

    // Scanner input = new Scanner(System.in);
    // int abba = input.nextInt();


    double result;
    int num1 = 4, num2 = 11, num3 = 3;
    double val1 = 3.0, val2 = 10.0, val3 = 2.0;

    //     result = num2 / num1;
//     result = val3 + num2 / num1;
//     result = num3 + val2 / num1;
// result = num2 / num3 / num1;
// result = val2 * num1 + num2 / num3;
// result = (int) (val2 * (num1 + num2) / num3);
// result = (val2 * (num1 + num2)) / num3;
// result = val2 * ((num1 + num2) / num3);
//result = num1 * num3 * 4 % num2 / val3;

  result = ++num2+- num1-+ num3++;
  // 12 + -4 -+ 3

    System.out.println("result: "+result);
    System.out.println("num2: "+ num2);
    System.out.println("num3: "+ num3);
    System.out.println(++num2+ -num1);

    int neg = -3;
    int pos = 8;
    int one = 8;
    //System.out.println(++pos+-neg); //++8+-(-3) =  9+-(-3) = 9+3 = 12
    System.out.println(pos++ +-neg); //8++ +-(-3) = 8+-(-3) = 8+3 = 11
    System.out.println(-pos); //-8
    System.out.println(+neg);
    System.out.println(-4%5); //-4
    System.out.println(-4%-5); //-4
    System.out.println(4%-5); //
    double first = 1/3;
    double second = 1/4;
    System.out.println(first%second); //Compiles: NaN : not a number





  }

}
