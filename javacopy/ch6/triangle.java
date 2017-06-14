class triangle{
  public static void main(String[] args){
    int a = 3, b = 3, c = 3;
    System.out.println(isTriangle(a, b, c));
    System.out.println(isRight(a, b, c));
    System.out.println(isEquilateral(a, b, c));
    System.out.println(isIsoceles(a, b, c));
  }
  public static boolean isTriangle(int a, int b, int c){
    if( (a > b+c) || (b > a+c) || (c > a+b) ){
      return false;
    }else{
      return true;
    }
  }
  public static boolean isRight(int a, int b, int c){
    double asq, bsq, csq;
    asq = Math.pow(a,2);
    bsq = Math.pow(b,2);
    csq = Math.pow(c,2);

    if((asq + bsq == csq) || (asq + csq == bsq) || (csq + bsq == asq)){
      return true;
    }else{
      return false;
    }
  }
  public static boolean isEquilateral(int a, int b, int c){
    if( a == b && b == c && a == c) {
      return true;
    }else{
      return false;
    }
  }
  public static boolean isIsoceles(int a, int b, int c){
    if(( a == b && a == c) || ( b == a && b == c) || ( c == a && c == b)) {
      return true;
    }else{
      return false;
    }

  }

}
