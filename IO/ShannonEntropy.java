/* *****************************************************************************
 The program ShannonEntropy.java that takes a command-line integer m;
 reads a sequence of integers between 1 and m from standard input; and prints t
 he Shannon entropy to standard output, with 4 digits after the decimal point.

 **************************************************************************** */

 public class ShannonEntropy
 {
     public static void main(String[] args)
     {
         int m = Integer.parseInt(args[0]);
         int[] freq = new int[m];
         int value;
         int count = 0 ;
         double shannonEntropy = 0;
         while (!StdIn.isEmpty())
         {
           value = StdIn.readInt();
           freq[value - 1]++;
            count++ ;
         }
         for (int j = 0 ;j < m ; j++)
         {
         double p =(double) freq[j]/count;
         if (p!=0) {
             shannonEntropy = shannonEntropy +(-1.0 * p * (Math.log(p) / Math.log(2))) ;
         }

         }
         StdOut.printf("%.4f\n",shannonEntropy);
     }
 }

/*
The Shannon entropy is a measure of the rate of information produced by a
random source, such as the outcomes of flipping a fair coin or rolling a loaded
die. It is a fundamental concept in information theory and data compression.

*/
