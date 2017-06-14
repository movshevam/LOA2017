/*
Exercise 8.8. What is the output of the following program?
public class Enigma {
    public static void enigma(int x) {          //enigma(5)  // enigma(2) //enigma(1)// enigma(0)
        if (x == 0) {                           //
            return;                             //
        } else {                                //
            enigma(x/2);                        //enigma(5/2)// enigma(2/2) // enigma(1/2)
        }                                       //
        System.out.print(x%2);                  //
    }                                           //
    public static void main(String[] args) {    //
        enigma(5);                              //
        System.out.println("");                 //
    }
}
enigma(5)
|----------> enigma(2)
S.o.p(x%2)   |----------> enigma(1)
5%2 = 1      S.o.p(x%2)   |----------> enigma(0)
              2%2 =0      S.o.p(x%2)   |return
                          1%2 = 1
Output: 101

Explain in 4-5 words what the method enigma really does.
divides any number in half until you get zero, print out whether
numbers received in the process were even or odd.
*/
public class ex8_8_Enigma {
    public static void enigma(int x) {          //enigma(5)  // enigma(2) //enigma(1)// enigma(0)
        if (x == 0) {                           //
            return;                             //
        } else {                                //
            enigma(x/2);                        //enigma(5/2)// enigma(2/2) // enigma(1/2)
        }                                       //
        System.out.print(x%2);                  //
    }                                           //
    public static void main(String[] args) {    //
        enigma(5);                              //
        System.out.println("");                 //
    }
}
