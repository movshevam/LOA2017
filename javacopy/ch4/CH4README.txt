CH4README
Conditionals and Recursion
Topics:
The modulus operator, Conditional execution, Alternative execution, Chained
conditionals, Nested conditionals, the return statement, type conversion,
recursion, stack diagrams for recursive methods

Glossary:
•modulus: an operator that works on integers and gives the remainder when one
number is divided by another. In Java denoted with %
  ex:  2%5  =  2
       2%-5 = -3
      -2%5  =  3
      -2%-5 = -2

•conditional: a block of statements that may or may not be executed depending
on some condition.
  ex: if(i<5){
        System.out.println("I am smaller!");
      }
      if( A&&B || true){
        i = 9;
      }

•chaining: A way of joining several conditional statements in sequence.
  ex: if(/*this*/){ /*then that*/}
      if(/*this*/){ /*then that*/}
      else if(/*this*/){ /*then that*/}
      else{ /*then that*/}

•nesting: putting a conditional statement inside another conditional statement.
  ex: if( a < b){
        if(a == 0){ /*do this*/}
        /*do another thing*/
      }

•typecast: an operator that converts from one type to another. In Java, it
appears as a type name in parenthesis.
  ex: int a = (int) 4.55; the value of a is 4

•recursion: invoking the same method you are currently executing.
  ex: public static int method(int a, int b){
        if(a< b){
            int result *= method(a+1, b); //recursive call
        }
        /*more code*/
      }
•base case: condition that causes a recursive method not to make a
recursive call.
  ex: public static int method(int a, int b){
        /*code*/
        if(a>b){
          return a;
        }
      }

Exercises:
4.1: Draw stack diagram of program in §4.8 after main invokes nLines with n=4
and just before last invocation of nLines returns
4.2: Review the flow of execution in given program. Write down output and
how the program executes.
4.3: Create program that prints lyrics to song "99 Bottles of Beer".
Use of recursion and two conditional statements.
4.4: Find output of given program
4.5: Program Fermat's Last Theorem into a method.
