import java.util.Scanner;
class loancalc{
	public static void main(String[] args){
    System.out.println("hello");
    Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		int years = input.nextInt();
		double annRate = input.nextDouble();
		double moRate = monthlyRate(annRate);
		double moPay = monthlyPayment(amount,moRate, years);
		System.out.println(moPay);
		double totalPay = moPay * 12 * years;
		System.out.println(totalPay);
	}
	public static double monthlyRate(double rate){
		return rate/12;
	}
	public static double monthlyPayment(double amount, double rate, int years){
		double num = amount * rate;
    double temp = 1 / Math.pow(1+rate, years*12);
		double denum = 1 - temp;
		return num / denum ;
	}
}
