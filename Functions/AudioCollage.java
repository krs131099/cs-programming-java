/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class AudioCollage {

  public static double[] amplify(double[] a, double alpha) {
   for(int i = 0;i<a.length;i++) {
     a[i] = a[i]*alpha;
   }
   return a;
  }

  public static double[] reverse(double[] a) {
    double[] b = new double[a.length];
    for(int i = a.length-1;i>=0;i--){
      b[a.length-1-i] = a[i];
    }
    return b;
  }

  public static double[] merge(double[] a, double[] b) {
    double[] c = new double[a.length+b.length];
    for(int i = 0;i<(a.length+b.length);i++){
       if(i<a.length) c[i] = a[i];
       else c[i] = b[i-a.length];
    }
    return c;
  }

  public static double[] mix(double[]a ,double[] b) {

    if(a.length>b.length) {
     for(int i = 0;i<b.length;i++) {
       a[i] = a[i] + b[i];
       if((a[i] <-1) ||(a[i]>1))  a[i] = Math.round(a[i]);
     }
     return a;
   }
  else {
       for(int i = 0;i<a.length;i++) {
         b[i] =a[i] + b[i];
       }
       return b;
     }
   }


  public static double[] changeSpeed(double[] a, double alpha) {
    int f = (int)(a.length/alpha);
    double[] arr = new double[f];
    for(int i = 0;i<f;i++) {
      arr[i] = a[(int)(i*alpha)];
    }
    return arr;
  }

    public static void main(String[] args) {
      double[] samples = StdAudio.read("beatbox.wav");
      double[] samples2 = StdAudio.read("chimes.wav");

      double alpha = 1.5;

      StdAudio.play(amplify(samples,alpha));
      StdAudio.play(reverse(samples));
      StdAudio.play(merge(samples,samples2));
      StdAudio.play(mix(samples,samples2));
      StdAudio.play(changeSpeed(samples,alpha));

    }
}
