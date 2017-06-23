class BooleanExpressions{
  public static void main(String[] args) {
    boolean b = false;
    if(!b){
      System.out.println("This line should always be printed");
    }
    if(b){
      System.out.println("This line should never be printed when b is false");
    }
    if(b = true){
      System.out.println("This line will always be printed since you set b to true");
    }
    if(b == true){
      System.out.println("This line will be printed if b == true");
    }

  }
}
