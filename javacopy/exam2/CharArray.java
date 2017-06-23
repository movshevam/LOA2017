class CharArray{
  public static void main(String[] args) {
    String s = "ward";
    String r= reverse(s);
    System.out.println(r);
  }
  public static String reverse(String str){
    char[] chars = str.toCharArray();
    int last = str.length() - 1;
    for(int i=0; i<str.length()/2; i++){
      char temp = chars[i];
      chars[i] = chars[last-i];
      chars[last-i] = temp;
    }
    return new String(chars);
  }
}
