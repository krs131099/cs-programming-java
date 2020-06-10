/* *****************************************************************************
  The program Divisors.java to compute the greatest common divisor and related
  functions on integers:
 **************************************************************************** */

public class Divisors {

  public static int gcd(int a, int b) {
    if((a==0)&&(b==0)) return 0;
    int c,remainder;
    c = Math.abs(a);
    remainder = Math.abs(b);
    while(remainder!=0) {
    int temp  = c;
    c = remainder;
    remainder = temp%remainder;
    }
    return c;
  }

  public static int lcm(int a,int b) {
    if((a==0)&(b==0)) return 0;
    return (Math.abs(a)*Math.abs(b))/gcd(a,b) ;
  }

  public static boolean areRelativelyPrime(int a , int b) {
      return (gcd(a,b) ==1) ;

  }

  public static int totient(int n) {
    int count = 0;
    if(n<=0) return 0;
    for(int i = 0;i<n;i++) {
      if(areRelativelyPrime(n,i)) count++;
    }
    return count;
  }


    public static void main(String[] args) {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);

      StdOut.println("gcd("+a+", "+b+") = "+gcd(a,b));
      StdOut.println("lcm("+a+", "+b+") = "+lcm(a,b));
      StdOut.println("areRelativelyPrime("+a+", "+b+") = "+areRelativelyPrime(a,b));
      StdOut.println("totient("+a+ ") = " +totient(a));
      StdOut.println("totient("+b+") = "+totient(b));


    }
}

/*
The greatest common divisor and least common multiple functions arise in a
variety of applications, including reducing fractions, modular arithmetic,
and cryptography. Euler’s totient function plays an important role in number
theory, including Euler’s theorem and cyclotomic polynomials.
*/
