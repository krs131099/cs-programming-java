/*
Write a program GeneralizedHarmonic.java that takes two integer command-line
arguments n and r and uses a for loop to compute the nth generalized harmonic
number of order r, which is defined by the following formula:

https://coursera.cs.princeton.edu/introcs/assignments/loops/specification.php

*/

public class GeneralizedHarmonic {
public static void main(String[] args) {

int first,r;
first = Integer.parseInt(args[0]);
r = Integer.parseInt(args[1]);

double sum = 0;
for(int i = 1; i<= first; i++) {
sum = sum + (1/Math.pow(i,r));

}
System.out.println(sum);
}
}

/*
The generalized harmonic numbers are closely related to the Riemann zeta
function, which plays a central role in number theory.
*/
