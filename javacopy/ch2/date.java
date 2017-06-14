class date{
  public static void main(String[] args){
    System.out.println("This prints out the date the program was made.");
    String day, month;
    int date, year;
    day = "Tuesday";
    date = 30;
    month = "May";
    year = 2017;
    System.out.println("American format:");
    System.out.print(day + ", ");
    System.out.print(month + " ");
    System.out.print(date + ", ");
    System.out.println(year);
    System.out.println("European format:\n" + day + " " + date + " " + month
      + ", " + year);
  }
}
