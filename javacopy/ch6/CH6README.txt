CH6 README:
Topics:
Return Values, Program Development, Composition, Overloading, Boolean
expressions, Logical operators, Boolean methods, More recursion,Leap of
Faith, One more example


Glossary:

•return type: part of method declaration that shows what type of value
the method returns.
  ex: void, int[], char, double[][], String

•return value: value provided as result of invoking the method:
  ex: int returnVal = method(parameter1, parameter2);

•dead code: part of program that can never be executed because a return
statement is before it. This way the method is left before reaching this
code.
  ex: /* …code… */
      return value;
      int dead = value*5;

•scaffolding: Code that is used during program development but is not
part of the final version.
  ex: int temp = 5*3;
      System.out.println("temp: "+ temp); //scaffolding here and vv
      int a = temp * anothermethod(temp);
      System.out.println("value of another method "+anothermethod(temp));

•void: a return type that indicates a void method. Method doesn't return
a value, usually prints result to screen or to file.
  ex: public static void printThis(String this){
        System.out.println(this);
      }

•overloading: having more than one method with the same name but different
parameters. When you invoke one, Java differentiates by parameters.
  ex: multiple constructors:
      public ClassName(){
        this.variable = 0;
      }
      public ClassName(int var){
        this.variable = var;
      }

•boolean: a type of variable that contains only two values - true and false
  ex: boolean thisIsWrittenInEnglish = true;

•conditional operator: an operator that compares two values and produces a
boolean that indicates relationship between operands:
  ex:   <   >   ==  <=    >=

•logical operator: an operator that combines boolean values and produces
boolean values.
  ex: (1<2) && (2>1) returns false
      &&    ||    !

Exercises:
6.1: take two integers and check if they one is divisible by the other.
I used mod.
6.2: make function that multiplies two parameters and adds third one. Use
this method to solve three math problems.
My mistakes here:
    1) Math.log() calculates with base e. To get to base 10, divide:
    Math.log(x)/Math.log(10);
    2) log(x*y) = log(x) + log(y). This is important because log(20)=log(2*10)
    Thus, log(10) + log(20) = log(10) + log(10) + log(2);
6.3: Check if three lines can form a triangle.
Use of conditional and logical operators
6.4: find output of given program.
My mistakes:
    1) didn't do/lost solution
    2) know definitions of words used: frabjous = joyful
6.5: write a method that calculates distance between two coordinates.
My mistakes:
    1) length is called a vector, and it can start from origin.
    (basic linear algebra)
6.6: Draw stack diagram of given program and find output. Explain what
the program does. Rewrite a method without using temporary variables.
My mistakes:
    1) lost solution/start but didn't finish
    2) prod computes n!/(m-1)! not n!/m! because m is used
    3) 1! == 0! so check with m > 1
6.7: Program the Ackerman function.
Use of recursion
6.8: Print a string character per line forwards and backwards, print whole
string backwards.
6.9: Write a method that raises a double x to an int power and returns
result. Optional challenge: make method more efficient when power is even.
Use of recursion.
6.10: Write a method that calculates the greatest common divisor of two
integers using Euclid's algorithm.
My mistakes:
    1) Never started it/skipped it
    2) a = b; b = r; makes a = r. Use int temp to store value of b.
