/* *****************************************************************************
 * The program TrinomialBrute.java that takes two integer command-line arguments
 n and k and computes the corresponding trinomial coefficient.

 Trinomial coefficients arise in combinatorics. For example, T(n,k) is the
 number of permutations of n symbols, each of which is −1, 0, or +1, which sum
 to exactly k and T(n,k−n) is the number of different ways of randomly drawing
 k cards from two identical decks of n playing cards. 
 **************************************************************************** */

public class TrinomialBrute {

  public static long trinomial(int n,int k) {
   if((n == 0)&& (k ==0)) return 1;
   else if((k<-n) || (k>n)) return 0;
   else return trinomial(n-1,k-1)+trinomial(n-1,k) + trinomial(n-1,k+1) ;
  }

    public static void main(String[] args) {
      int n = Integer.parseInt(args[0]);
      int k = Integer.parseInt(args[1]);

      StdOut.println(trinomial(n,k));

    }
}
