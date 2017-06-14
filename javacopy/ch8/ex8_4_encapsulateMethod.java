class ex8_4_encapsuleMethod{
    public static void main(String[] args){
      String s = "((3 + 7) * 2)";
      int thing = countThing(s);
    }
    //This method counts how many characters there are other than parenthesis
    public static int countThing(String s){
      int len = s.length();
      int i = 0;
      int count = 0;
      while (i < len) {
        char c = s.charAt(i);
        if ((c != '(') || (c != ')')) {
          i++;
        }
      }
    return count;
  }
}

/*
What to do: first step:
if (c == '(') {
  count++;
}
else if (c == ')') {
  count--;
}
i++;
------
What to do: second step:
*/
