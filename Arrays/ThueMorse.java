/*
The Thue–Morse sequence is an infinite sequence of 0s and 1s that is
constructed by starting with 0 and successively appending the bitwise negation
 (interchange 0s and 1s) of the existing sequence.

 The Thue–Morse sequence has many fascinating properties and arises in
 graphic design and in music composition.
*/


public class ThueMorse {

  public static void main(String[] args) {

    int n = Integer.parseInt(args[0]);
    int[] grid = new int[n*n];

    for(int i = 1;i<grid.length;i++) {
      if(i%2 == 0) {  grid[i] = grid[i/2];  }

      else { grid[i] = 1-grid[i-1]; }

  } // end of for loop


  // printing the array sequence
  for(int j = 0;j<grid.length;j++) {

    if(grid[j] == 0) { System.out.print("+  ");}

    else { System.out.print("-  ");   }

    if(  (j+1)%n ==0 ) {  System.out.println();  }

  }


  }// end of main method
} // end of class
