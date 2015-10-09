// Write an expression  that computes the difference of the variables  endingTime and startingTime.

endingTime - startingTime

// Given  an integer  variable  bridgePlayers, write a statement  that increases  the value  of that variable  by 4.

// The expression to the right of "=" is first calculated and then the answer is placed in the variable to the left of the "='
// The net result is that the variable bridgePlayers is increased by 4

bridgePlayers = bridgePlayers + 4;

// Given  an integer  variable  drivingAge that has already  been declared , write a statement  that assigns  the value  17 to drivingAge.
drivingAge = 17;

// Given  two integer  variables  oldRecord and newRecord, write a statement  that gives newRecord the same value  that oldRecord has.

newRecord = oldRecord;

// Given  two integer  variables  matricAge and gradAge, write a statement  that gives gradAge a value  that is 4 more than the value  of matricAge.

gradAge = matricAge + 4;


// Declare an integer variable cardsInHand and initialize it to 13.
int cardsInHand = 13;

// Given  the variable  pricePerCase, write an expression  corresponding to the price of a dozen cases.
pricePerCase*12

// Given  the variables  taxablePurchases and taxFreePurchases (already  declared  and assigned  values ), write an expression  corresponding to the total amount purchased.
taxablePurchases + taxFreePurchases

// Write an expression  that computes the remainder of the variable  principal when divided by the variable  divisor. (Assume  both are type  int .)


// Instructor Notes:
// In Java integer division operates as follows:
// 17 / 5    gives 3 since 5 goes into 3 times with 2 left over
// 17 % 5  gives 2, which is the remainder, which is the amount left over when dividing 17 by 5

principal % divisor

// Write an expression  that computes the average of the values  12 and 40.


// Instructor Notes:
// In the expression  12 + 40 / 2  the division is done before addition, so the answer is 12 + 20 or 32
// If you want the 12 + 40 to be divided by 2, the 12 + 40 must be placed inside (         ) so that + is done first

(12 + 40)/2

// Write an expression  that computes the integer  average of the int  variables  exam1 and exam2 (both declared  and assigned  values ).

(exam1 + exam2)/2

// Given  an integer  variable  profits, write a statement  that increases  the value  of that variable  by a factor of 10.


// Instructor Notes:
// Increasing a varaiable by a factor means to multiply.  profits * 10 is profits increased by a fact of 10
// To increase profits we need the assignment operator =
// profits = profits * 10;   is the needed statement
// In Java the above statement is also written in short hand notation   profits *= 10;

 profits *= 10;


// Write an expression  that evaluates  to true  if the value  of the integer  variable  numberOfPrizes is divisible (with no remainder) by the integer  variable  numberOfParticipants. Assume  that numberOfParticipants is not zero.

numberOfPrizes % numberOfParticipants == 0;

// Write a statement  that increases  the value  of the int  variable  total by the value  of the int  variable  amount. That is, add the value  of amount to total and assign  the result to total.

total += amount;

// Declare  two double  variables , one named  length with a value  of 3.5 and the other named  width with a value  of 1.55.

// http://stackoverflow.com/questions/6319727/what-exactly-does-double-mean-in-java
// http://www.homeandlearn.co.uk/java/double_variables.html

double length = 3.5;
double width = 1.55;




// Supplemental BlueJay Material
// assignment and declaration


integer x;
Error: cannot find symbol -   class integer
y
Error: cannot find symbol -   variable y
int y;
Note: Codepad variables are automatically initialized
 in the same way as instance fields.
y
0   (int)
int x;
int my age;
Error: ';' expected
int my_age;
my_age
0   (int)
int age = 123456;
int b = 123,456;
Error: <identifier> expected
bool c;
Error: cannot find symbol -   class bool
boolean d;
d
false   (boolean)
int 2Small;
Error: not a statement

int jccc.edu
Error: ';' expected
double e f;
Error: ';' expected
double g, g;
Error: g is already defined
g
Error: cannot find symbol -   variable g
double e f
Error: ';' expected
double g, h;
g
0.0   (double)
h
0.0   (double)



// math calculations


5 + 7 * 3
26   (int)
(5 + 7) * 3
36   (int)
14/5
2   (int)
15/5
3   (int)
16/5
3   (int)
14%5
4   (int)
15%5
0   (int)
16%5
1   (int)
2 + 1234
1236   (int)
2 + 1,234
Error: not a statement
2*(123 + 456)
1158   (int)
2(123+456)
Error: not a statement
12/5
2   (int)
12.0/5.0
2.4   (double)
12/5.0
2.4   (double)
12/0.5
24.0   (double)



// Math Functions

Math.sqrt(5)
2.23606797749979   (double)
sqrt(8)
Error: cannot find symbol -   method sqrt(int)
Math.pow(5,6)
15625.0   (double)
Math.pow(5,-6)
6.4E-5   (double)
Math.pow(34567,34)
2.0629915433321927E154   (double)



// Wrong or no answers

Math.sqrt(-7)
NaN   (double)
Math.pow(12345678,123456)
Infinity   (double)


// using the integer class methods

Integer.MAX_VALUE  
2147483647   (int)
Integer.MIN_VALUE + 1  
-2147483647   (int)
Integer.SIZE     
32   (int)
Integer.toBinaryString(85)
"1010101"   (String)


// assignment operator


int t = 7
Error: ';' expected
int t = 7;
t
7   (int)
t += 12
19   (int)



