/*
 Minesweeper is a 1960s era video game played on an m-by-n grid of cells.
 The goal is to deduce which cells contain hidden mines using clues about
 the number of mines in neighboring cells.

 The program Minesweeper.java that takes three integer command-line arguments
 m, n, and k and prints an m-by-n grid of cells with k mines, using asterisks
 for mines and integers for the neighboring mine counts
 (with two space characters between each cell).

*/

public class Minesweeper {

  public static void main(String[] args) {
    // m stores the row
    int m = Integer.parseInt(args[0]);
    // n stores the columns
    int n = Integer.parseInt(args[1]);
    // k stores the number of mines to be generated
    int k = Integer.parseInt(args[2]);

    // boolean grid to represent mines
    boolean[][] grid = new boolean[m][n];
    // num stores the boundaries of the mines
    int[][] num = new int[m+2][n+2];
    int count = 1;


    while(count<=k) {

       int rand = (int)(Math.random()*(m-1));
       int rand2 = (int)(Math.random()*(n-1));

       if(grid[rand][rand2] != true) {
       grid[rand][rand2] = true;

       // update the boundaries of the mine;
       num[rand+1+1][rand2+1]++; // right
       num[rand+1-1][rand2+1]++; // left
       num[rand+1][rand2+1+1]++; // upper
       num[rand+1][rand2+1-1]++;// lower
       num[rand+1-1][rand2+1+1]++; // upper left
       num[rand+1+1][rand2+1+1]++; // upper right
       num[rand+1-1][rand2+1-1]++; // lower left
       num[rand+1+1][rand2+1-1]++; // lower right

       count++;
     } //if statement


   }//  end-while loop



     // print- Minesweeper
     for(int i = 1;i<=m;i++) {

     for(int j =1;j<=n;j++) {

       if(grid[i-1][j-1] == true) { System.out.print("*  ");  }
       else {  System.out.print(num[i][j]+"  ");  }

     } // inner for loop
     System.out.println();
   }// outer for loop


  } // end of main method
}  // end of class
