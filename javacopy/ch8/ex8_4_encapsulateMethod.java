/*Exercise 8.4. The purpose of this exercise is to review encapsulation and
generalization.
1. Encapsulate the following code fragment, transforming it into a method that
takes a String as an argument and that returns the final value of count.
2. In a sentence or two, describe what the resulting method does (without
getting into the details of how).
3. Now that you have generalized the code so that it works on any String,
what could you do to generalize it more?
*/
class ex8_4_encapsulateMethod{
    public static void main(String[] args){
      String s = "((3 + 7) * 2))";
      int thing = countThing(s);
      System.out.println(thing);
    }
    //This method determines whether an expression or string has both sides of parenthesis.
    public static int countThing(String s){
      int len = s.length();
      int i = 0;
      int count = 0;
      //look for '(' and ')'
      int location = 0;
      //HOW TO FIX THIS?????
      while(i < len){
        if(s.indexOf('(', i) >= 0){
          if(s.indexOf(')',i) >= 0){
            i++;
          }
          else{
            count++;
            i++;
          }
        }
        if(s.indexOf('(', i) == -1){
          if(s.indexOf(')',i) >= 0){
            i++;
          }
          else{
            count++;
            i++;
          }
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
*/
