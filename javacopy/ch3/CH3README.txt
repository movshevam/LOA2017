CH3README
Void methods
Topics:
Floating-point, Converting from double to int, math methods, composition,
adding new methods, parameters and arguments, stack diagrams, methods with
multiple parameters, methods that return values

Glossary:
•initialization: statement declares a new variable and assigns a value
to it at the same time.
  ex: int a = 5;
      String b = "beta";
      Scanner input = new Scanner(System.in);

•floating-point: type of variable or value that can contain fraction and
integers. double and float.
  ex: double pi = 3.14;

•class: a named collection of methods.
  ex: Math class contains useful computation methods
      System class contains System.out.println();
      Hello , NewLine, FileName are all classes

•method: a named sequence of statements that perform a useful function.
Methods may or may not take parameters, and may or may not return a value.

•parameter: variables that contain values and have types.
  ex: public static void(int param1, int param2){
        /*code*/
      }
      param1 and param2 are parameters type int.

•argument: a value that you provide when you invoke a method. Value must have
the same type as the corresponding parameters. This is the value you will use
in this method.
  ex: method(arg1, arg2); arg1 and arg2 are arguments

•frame: a structure (gray box in stack diagrams) that contains a method's
parameters and variables.
  ex: public static void main(String[] args){
        int a = 5;
      }
      frame:______
      main |  a [5]
            ------
•invoke: cause a method to execute. Call.
