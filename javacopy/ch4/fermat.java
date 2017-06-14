class fermat{
  public static void main(String[] args) {
    checkFermat(3,4,5,2);
  }
  public static void checkFermat(int a, int b, int c, int n){
      double sum = Math.pow(a,n)+Math.pow(b,n);
      double square = Math.pow(c,n);
      if(sum == square && n!= 2){
        System.out.println("Holy smokes, Fermat was wrong!");
      }
      else{
        System.out.println("No, that doesn’t work.");
      }
  }
}
