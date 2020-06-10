/* *****************************************************************************
  The program RevesPuzzle.java that takes an integer command-line argument n
  and prints a solution to Reve’s puzzle. Assume that the the discs are labeled
  in increasing order of size from 1 to n and that the poles are labeled A, B,
  C, and D, with A representing the starting pole and D representing the destination pole.
  
 **************************************************************************** */

public class RevesPuzzle {

  private static void hanoi(int n,char from,char to,char temp1,char temp2) {
    if(n == 0) return ;
    if(n == 1)  {
      StdOut.println("Move disc "+ n+ " from " +from +" to "+ to);
      return ;
    }

    hanoi(n-2,from,temp1,temp2,to);
    StdOut.println("Move disc "+ (n-1)+ " from " +from +" to "+ temp2);
    StdOut.println("Move disc "+ n+ " from " +from +" to "+ to);
    StdOut.println("Move disc "+ (n-1)+ " from " +temp2 +" to "+ to);
    hanoi(n-2,temp1,to,from,temp2);
  }


    public static void main(String[] args) {

      int n = Integer.parseInt(args[0]);
      hanoi(n,'A','D','B','C');

    }
}
