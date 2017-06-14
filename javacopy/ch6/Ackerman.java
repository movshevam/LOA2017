class Ackerman{
  public static void main(String[] args){
    int answer = ack(1,1);
    System.out.println(answer);
  }
  public static int ack(int m, int n){
    if( m == 0){
      return n + 1;
    }if( m > 0 && n == 0){
      return ack(m-1, 1);
    }if(m > 0 && n > 0){
      int temp = ack(m, n-1);
      return ack(m-1, temp);
    }else{
      return -1;
    }
  }
}
