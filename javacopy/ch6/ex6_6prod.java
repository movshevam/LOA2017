/*
1. Draw a stack diagram showing the state of the program just before the last
instance of prod completes. What is the output of this program?
main |          |     24
prod | m[1] n[4]|     return 6*4
prod | m[1] n[3]|     return 2*3
prod | m[1] n[2]|     return 1*2
prod | m[1] n[1]|     return 1

Output: 24
2. Explain in a few words what prod does.
computes is how many ways n things can be sorted in m places.
Assumes m is less than n, otherwise will go on forever.
3. Rewrite prod without using the temporary variables recurse and
result.
*/
class ex6_6prod{
  public static void main(String[] args) {
        System.out.println(prod(4, 7));
    }
    public static int prod(int m, int n) {
      if (m == n) {
        return n;
      } else {
        return n * prod(m,n-1); //part 3
      }
    }
}
