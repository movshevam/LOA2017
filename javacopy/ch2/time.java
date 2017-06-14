class time{
  public static void main(String[] args){
    System.out.println("This prints out the approximate time this was made.");
    int hour, minute, second;
    hour = 22;  minute = 48;  second = 13;
    hour = 23; minute = 43; second = 30;
    System.out.println("Number of seconds since midnight: ");
    int num_sec = hour * 60 * 60 + minute * 60 + second;
    //varaibles used in a computation but never printed are
    //intermediate or temporary variables
    System.out.println(num_sec);

    System.out.println("Number of seconds remaining in the day: ");
    int tot_sec = 24*60*60;
    System.out.println(tot_sec - num_sec);

    System.out.println("Percentage of day that has passed: ");
    System.out.println( (num_sec*100/tot_sec));

  }
}
