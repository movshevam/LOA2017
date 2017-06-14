class variables {
  public static void main(String[] args){
    System.out.println("variable names should start with a letter" +
      " and must not have the same name as the keywords.");
    /*
    String 1ten = "1ten";
    String &cow = "&cow";
    String -hers = "-hers";
    int 8ight = 8;
    */
    int five = 5;
    System.out.println(five);
    //System.out.println(1ten + " " + &cow + " " + -hers + " " + 8ight);
    String String3 = "String3";
    System.out.println(String3);
    //declaring a varible: create a named storage location
    //assignment to a variable: give it a value/meaning.

    int hour, minute;
    hour = 11; minute = 59;
    System.out.print("The current time is: ");
    System.out.print(hour);
    System.out.print(":");
    System.out.print(minute);
    System.out.println(".");
    //this can also be printed out like so: vv But above is common
    System.out.println("The current time is: " + hour + ":" + minute + ".");
  }
}
