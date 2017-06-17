8 primitive data types:
boolean: 						false	1 bit
char: 16-bit Unicode characters, 	\u0000	16 bits
arithmetic types:
	integer types:
integer types represent signed numbers
	• byte: 					           0		   8 bits	(-128, 127)       ≈ 250
	• short: 				          	 0		  16 bits	(-32 768, 32 767) ≈ 60 thousand
	• int: -2,-1,0,1,2	    		 0		  32 bits		                ≈ 2.25 billion
	• long: -2L,-1L,0L,1L,2L		 0		  64 bits	(-9x10^18,9x10^18)≈ 1.8x10^37
	floating-point types:
	•float: -1.23e-100f, .3f,	   0.0		32 bits	(3.4x10^38, 1.4x10^-45)
	•double: 1.23456e300d, 1e1d	 0.0		64 bits	10^308, 10^-324  far far more
	e,E = exponent, 10^
	f,F = float differentiates from double.
	1.23e30 = 1.23x10^30   <= double
	1.23e30f = 1.23x10^30f <= float

 some of the least significant digits of the value may be lost by the conversion.
 This can happen when converting an int or long to a float or double. The
 floating-point types have a larger range than the integer types, so any int or
 long can be represented by a float or double. However, the floating-point types
 are approximations of numbers and cannot always hold as many significant digits
 as the integer types.


Strings are references to an instance of class String
