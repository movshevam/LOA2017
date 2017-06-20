CH7README
Iteration and Loops
Topics:
Multiple assignment, while statement, printing tables, two-dimensional tables,
encapsulation and generalization, local variables.

Glossary:
•loop: a statement that gets executed while a condition holds
  ex: while(a < 0){
        a++;
        System.out.println(a);
      }
•infinite loop: a loop whose condition is always true
  ex: while(a > 0){
        System.out.println(a);
      }
•body: statements inside the loop
  ex: a++; System.out.println(a);
•iteration: one execution of the loop (executing all the code in the body and
the condition once)
  ex: int i = 3;      //one iteration:
      while(i < 6){   // 3 < 6 == true
        i++;          //3++ means i = 4
      }
•encapsulate: to divide a large program into components and isolate the
components from each other. Components = methods. Isolation works with
local variables.
  ex: public static void method(int param){
        String str == "";
        char letter = (char) param;
        str += letter;
      }
      public static char function(int param){
            char letter = (char) param + 5;
            return letter;
      }

•local variable: variable that is declared inside a method and exists solely
within it. They don't exist outside the method and can't be accessed outside.
In the above example char letter is a local variable in both functions. It's
not the same.

•generalize: to replace something unnecessary specific (constant value) with
something general(variable or parameter). Makes code more versatile and
likely to be reused. Sometimes easier to write.
  ex: above code generalized: //substitute 5 with parameter increment
     public static char function(int param, int increment){
        char letter = (char) param + increment;
        return letter;
     }
•program development: a process/procedure for writing programs. We have seen:
  incremental development: in steps
  encapsulation and generalization: making parts of main code into reusable
  methods

Exercises:
7.1: Figure out output of given code and value of n.
7.2: Calculate an approximation of square root of a double.
Problems I had:
    1) wrong order of loop body caused iteration to happen only once.
    2) Confusion:
       x0 = x1;
       x1 = something new;
       but get the same answer
       temp = x1;
       x0 = temp;
       x1 = something new;
7.3: Create iterative version of power method from 6.9.
Use of iteration.
7.4: Create iterative version of factorial method from 6.8
Use of iteration.
