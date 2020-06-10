/* *****************************************************************************
 *  Name:              K R S
 *  Coursera User ID:  *******
 *  Last modified:     28/05/2020
 **************************************************************************** */

public class TrinomialDP {

  public static long trinomial(int n,int k) {
    // base conditions
  if(n ==0 && k ==0) return 1;
  if(k<-n || k>n) return 0;

  long[][] a = new long[n+1][2*n + 1];
   a[0][0] = 1;
  for(int i = 1; i< a.length;i++) {
    for(int j = 0;j<(2*i+1);j++) {
      if(j==0) a[i][j] = 1;
      else if(j==1) a[i][j] = a[i-1][j-1] + a[i-1][j];
      else a[i][j] = a[i-1][j-2] + a[i-1][j-1] + a[i-1][j];
    }
  } // outer for loop
  return a[n][n+k];

}  // trinomial mehtod

public static void main(String[] args) {
  int n = Integer.parseInt(args[0]);
  int k = Integer.parseInt(args[1]);
  StdOut.println(trinomial(n,k));
}





    }
