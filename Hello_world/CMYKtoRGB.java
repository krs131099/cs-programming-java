//import java.lang.Math;
public class CMYKtoRGB {
public static void main(String[] args) {
double c = Double.parseDouble(args[0]);
double m = Double.parseDouble(args[1]);
double y = Double.parseDouble(args[2]);
double k = Double.parseDouble(args[3]);


double r, g, b, w;
w = 1-k;
r = 255*w*(1-c);
g = 255*w*(1-m);
b = 255*w*(1-y);
System.out.println(" red = "+(int)r);
System.out.println(" green = "+(int)g);
System.out.println(" blue = "+(int)b);
}
}
