/*
The program DiscreteDistribution.java that takes an integer command-line
argument m,followed by a sequence of positive integer command-line arguments
a1,a2,…,an, and prints m random indices (separated by whitespace), choosing
each index i with probability proportional to ai.

In probability theory, this is known as sampling from a discrete distribution.
*/

public class DiscreteDistribution {

  public static void main(String[] args) {

    int m = Integer.parseInt(args[0]);
    int[] a = new int[args.length-1];
    int[] sum = new int[args.length];


  for (int i = 0;i<args.length-1;i++) {
    a[i] = Integer.parseInt(args[i+1]);
  }

  for(int k = 1;k<sum.length;k++) {
    sum[k]=sum[k-1]+a[k-1];
  }

  int c = 1;

  while(c<=m) {
  int ran = (int)((Math.random())*(sum[sum.length-1]-1));

     for(int j = 0;j<sum.length-1;j++) {

       if(ran>=sum[j] && ran<sum[j+1] ) {
         System.out.print((j+1) +" ");
         break;
       }
     } // end of for loop

     c+=1;

    }
     System.out.println();

  } // end of main method

} // end of class
