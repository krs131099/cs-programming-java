/* *****************************************************************************
 * The  program RecursiveSquares.java that takes an integer command-line argument
   n and plots a recursive square pattern of order n.
 **************************************************************************** */

public class RecursiveSquares {

  /* method to draq square at given location
  input parameters must be in double varibles
  */
  public static void drawSquare(double x,double y,double length) {

    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
    StdDraw.filledSquare(x,y,length/2);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.square(x,y,length/2);
  }

  public static void draw(int n,double x,double y,double length) {
   // if the input argument is zero then nothing returned.
    if(n == 0) return;

    //drawSquare(x,y,length);
    // x1 = left side of x
    // x2 = right side of x
    // y1 = top side of y
    // y2 = bottom side of y
    double x1 = x-length/2;
    double y1 = y- length/2;
    double x2 = x + length/2;
    double y2 = y+ length/2;

    draw(n-1,x1,y2,length/2);
    draw(n-1,x2,y2,length/2);
    drawSquare(x,y,length);
    draw(n-1,x1,y1,length/2);
    draw(n-1,x2,y1,length/2);

  }

    public static void main(String[] args) {
      int n = Integer.parseInt(args[0]);
      draw(n,0.5,0.5,0.5);

    } // end of main method
} // end of class.
