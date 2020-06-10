/*
The great-circle distance is the length of the shortest path between two points
(x1,y1) and (x2,y2) on the surface of a sphere, where the path is constrained
to be along the surface.

The program GreatCircle.java that takes four double command-line arguments
x1, y1, x2, and y2—the latitude and longitude (in degrees) of two points on
the surface of the earth—and prints the great-circle distance (in kilometers)
between them.


Although the Earth is not a perfect sphere, this formula is a good approximation
to the true distance.
*/

public class GreatCircle {

public static void main(String[] args) {

double r = 6371.0;
double f =  Math.toRadians(Double.parseDouble(args[0]));
double s =  Math.toRadians(Double.parseDouble(args[1]));
double t =  Math.toRadians(Double.parseDouble(args[2]));
double fo = Math.toRadians(Double.parseDouble(args[3]));


double sines = Math.pow(Math.sin((t-f)/2), 2);
double sinse = Math.pow(Math.sin((fo-s)/2), 2);
double res = Math.sqrt(sines + Math.cos(f)*Math.cos(t)*sinse);

double inner = Math.asin(res);
double d = 2*r*inner;
System.out.println(d + " kilometers");

}

}
