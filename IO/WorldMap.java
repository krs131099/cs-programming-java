/*
The program WorldMap.java that reads boundary information of a country
(or other geographic entity) from standard input and plots the results to
standard drawing. A country consists of a set of regions
(e.g., states, provinces, or other administrative divisions), each of which
is described by a polygon.
*/

public class WorldMap {
  public static void main(String[] args) {
    int w = StdIn.readInt();
    int h = StdIn.readInt();

   StdDraw.setCanvasSize(w,h);
   StdDraw.setXscale(0,w);
   StdDraw.setYscale(0,h);
   StdDraw.enableDoubleBuffering();

   while(!StdIn.isEmpty()) {
     String s = StdIn.readString();
     int n = StdIn.readInt();
     double[] x = new double[n];
     double[] y = new double[n];
     for(int i = 0;i<n;i++){
        x[i] = StdIn.readDouble();
        y[i] = StdIn.readDouble();
     }
     //StdDraw.setPenColor(StdDraw.BLUE);
     StdDraw.polygon(x,y);
   }
   StdDraw.show();
  }
}
