/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ColorHSB {

    private final int h, s, b;

    public ColorHSB(int h, int s, int b) {
        if ((h < 0 || h > 359) || (s < 0 || s > 100) || (b < 0 || b > 100)) {
            throw new IllegalArgumentException(
                    " The hue range is 0-359. Saturation range is 0-100. Brightness range is 0-100");
        }

        this.h = h;
        this.s = s;
        this.b = b;

    }  // constructor

    public String toString() {
        return "(" + h + ", " + s + ", " + b + ")";
    } // toString method

    public boolean isGrayscale() {
        return (s == 0 || b == 0);
    }  // isGrayscale method

    public int distanceSquaredTo(ColorHSB that) {
        if (that == null) throw new IllegalArgumentException(" the input should not be null");
        return (int) (Math.min(Math.pow((this.h - that.h), 2),
                               Math.pow((360 - Math.abs((this.h - that.h))), 2))
                + Math.pow((this.s - that.s), 2) + Math.pow((this.b - that.b), 2));
    } // distanceSquared method


    public static void main(String[] args) {
        int h = Integer.parseInt(args[0]);
        int s = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        int least = 0;
        int lh = 0;
        int ls = 0;
        int lb = 0;
        String ln = null;
        int iter = 0;

        ColorHSB c = new ColorHSB(h, s, b);
        boolean result = c.isGrayscale();

        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int h1 = StdIn.readInt();
            int s1 = StdIn.readInt();
            int b1 = StdIn.readInt();

            ColorHSB c1 = new ColorHSB(h1, s1, b1);
            int dist = c.distanceSquaredTo(c1);
            if (least == 0) least = dist;
            if ((dist < least) || (iter == 0)) {
                least = dist;
                lh = h1;
                ls = s1;
                lb = b1;
                ln = name;
            }
            iter++;
        } // end of whole loop
        ColorHSB small = new ColorHSB(lh, ls, lb);
        // pritn the closest color.
        StdOut.println(ln + " " + small.toString());

    } // end of main method

}  // end of class
