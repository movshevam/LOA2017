Conversions to double:
double ( 1 / 3 ) will be a double
1 / 3 will be 0.0
double 1 / 3 will be a double

arithmetic operations excluding modulus that use a double in the location with the operation of precedence give an end result of a double. 
double fiveD = 5.5;
1.0 / 3 + 4.1 + ( 5.5*10) = 0.3333333 + 4.1 + 55.0 = 59.43333333

meanwhile if above did not use doubles with operation of precedence:
int fiveI = fiveD;
fiveI will become 5
1 / 3 + 4.1 + (5 * 10) = 0 + 4.1 + 50 = 54.1

typecasting (1 / 3) as double will be 0.0
writing as double or typecasting the numerator, denominator, or both will make it equal to 0.33333

int can be automatically converted to double. int x = 5; double y = x;
double needs typecasting to be converted to int. int x = (int) y

adding a char to a double results in a double: value of char is added to the double. adding char to double ≠ char. adding char to double ≠ String.

there can be no computation between boolean and double. Compiler error.

WRONG:
1.5 + 1 / 3 + 6%5.5 will not compile because mod operators work only with ints.
MODULUS WORKS WITH FLOATING POINT NUMBERS!!!!
1.5 + 1 / 3 + 6 % 5.5 = 1.5 + 0 + 0.5 = 2.0

Conversion to integer:
double needs typecasting to be converted to an int
int x = (int) (5.0/2.0) = 2
int y = (int) 5.0 / (int) 2.0 = 2
Any other positioning of typecast gives a double.

char +*/-% int = int, without typecasting.

largest integer value: 2 147 483 647 ≈ 2 billion, 2.0x10^9
smallest integer value: -2 147 483 648
total integers ≈ 4.5x10^9 , 4.5 billion

Conversions to float:
need typecasting, like double

Conversion to short:
(short) intValue / intValue = short
(short) doubleValue / (short) intVal = short
doubleVal/ (short) intVal = COMPILER ERROR
