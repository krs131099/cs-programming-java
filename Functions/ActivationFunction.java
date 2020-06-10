/* *****************************************************************************
 The program ActivationFunction.java to compute various activation functions
 that arise in neural networks. An activation function is a function that maps
 real numbers into a desired range, such as between 0 and 1 or between –1 and +1.
 
 **************************************************************************** */


public class ActivationFunction {


      public static double heaviside(double x) {
        if(Double.isNaN(x)) return Double.NaN;
        if(x <0.0) return 0.0;
        else if(x>0.0) return 1;
        else return 0.5;
      }

      public static double sigmoid(double x) {
        if(Double.isNaN(x)) return Double.NaN;
        return 1.0/(1.0+Math.exp(-x)) ;

      }

      public static double tanh(double x) {
        if(Double.isNaN(x)) return Double.NaN;
        return (Math.exp(x)-Math.exp(-x))/(Math.exp(x)+Math.exp(-x)) ;

      }


      public static double softsign(double x) {
        if(Double.isNaN(x)) return Double.NaN;
      return x/(1+Math.abs(x)) ;
      }

      public static double sqnl(double x) {
        if(Double.isNaN(x)) return Double.NaN;
        if(x<=-2) return -1;
        if (x>-2 && x<0) return x + x*x/4  ;
        if (x>=0 && x<2) return x- x*x/4 ;
        return 1 ;
      }

      public static void main(String[] args) {

        double i = Double.parseDouble(args[0]);

        StdOut.println("heaviside("+i+") = " + heaviside(i));
        StdOut.println("sigmoid("+i+") = " + sigmoid(i));
        StdOut.println("tanh("+i+") = "+tanh(i));
        StdOut.println("softsign("+i+") = "+ softsign(i));
        StdOut.println("sqnl("+i+") = "+sqnl(i));

      } // end of main method

}// end of class
