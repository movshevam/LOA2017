class printdate{
  public static void main(String[] args){
    printAmerican("Thursday", 1, "June", 2017);
    printEuropean("Thursday", 1, "June", 2017);
  }
  public static void printAmerican(String day, int date, String month, int year){
    System.out.println(day + ", " + month + " " + date + ", " + year);
  }
  public static void printEuropean(String day, int date, String month, int year){
    System.out.println(day + ", " + date + " " + month + ", " + year);
  }

}
