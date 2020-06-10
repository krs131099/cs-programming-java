// import java.lang.Math;

public class RightTriangle
{
public static void main(String[] args) {

double f = Double.parseDouble(args[0]);
double s = Double.parseDouble(args[1]);
double t = Double.parseDouble(args[2]);
boolean ismet;
boolean ismetsec;
boolean ismetthird;

 boolean c = ((f>0 && s >0)  && t>0);

ismet = (t*t == f * f + s * s);
ismetsec = (s*s == f*f + t*t);
ismetthird = (f*f == s*s + t*t);

System.out.println(((ismet || ismetsec || ismetthird) && c));
}

}
