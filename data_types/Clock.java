/* *****************************************************************************
 *The data type Clock.java that represents time on a 24-hour clock,
 such as 00:00, 13:30, or 23:59. Time is measured in hours (00–23) and minutes (00–59).
 **************************************************************************** */

public class Clock {
    private int h, m;

    public Clock(int h, int m) {
        if ((h < 0 || h > 23) || (m < 0 || m > 59)) {
            throw new IllegalArgumentException(
                    " The range of H is 0-23 & range of M should be 0-59.");
        }
        this.h = h;
        this.m = m;
    }

    public Clock(String s) {
        //this.s = s;
        if ((s.length() != 5) || (s.charAt(2) != ':')) {
            throw new IllegalArgumentException(" Invalid time. format should be HH:MM ");
        }
        int hour = Integer.parseInt(s.substring(0, 2));
        int min = Integer.parseInt(s.substring(3));
        if ((hour < 0 || hour > 23) || (min < 0 || min > 59)) {
            throw new IllegalArgumentException(
                    " The range of H is 0-23 & range of M should be 0-59.");

        }
        this.h = hour;
        this.m = min;
    }


    public boolean isEarlierThan(Clock that) {
        if (this.h < that.h) return true;
        if ((this.h == that.h) && (this.m < that.m)) return true;
        else return false;
    }

    public void toc(int delta) {
        if (delta < 0) throw new IllegalArgumentException(" Delta should be positive.");

        // int rem = delta % 60;
        // int mul = delta / 60;
        h = h + (delta / 60);
        if (m + (delta / 60) > 59) {
            h = h + 1;
            m = m + delta / 60 - 60;
        }
        else m = m + delta / 60;

        // rem =

    }
/*
    public void toc(int delta) {
        if (delta < 0) throw new IllegalArgumentException(" Delta shuld be positive.");
        if ((int) (delta / 60) > 0) {

        }
    }   */

    public void tic() {
        if (m < 59) m = m + 1;
        else {
            if (h < 24) {
                h = h + 1;
                m = 0;
            }
            else {
                h = 0;
                m = 0;
            }
        }
    }

    public String toString() {
        if ((h >= 0 && h < 10) && (m >= 0 && m < 10)) return "0" + h + ":0" + m;
        if (h < 10) return "0" + h + ":" + m;
        if (m < 10) return h + ":0" + m;
        else return h + ":" + m;
    }

    public static void main(String[] args) {

        Clock c1 = new Clock(10, 30);
        Clock c2 = new Clock("09:30");
        Clock c3 = new Clock(05, 30);
        StdOut.println("first clock : " + c1.toString());
        StdOut.println("Second Clock : " + c2.toString());
        StdOut.println("third clock : " + c3.toString());

        StdOut.println(
                "is first clock is earlier than third clock ? " + c1.isEarlierThan(c3));
        StdOut.println(
                "is second clock is earlier than third clock ? " + c2.isEarlierThan(c3));
        c1.tic();
        StdOut.println("Tic function for first clock - " + c1.toString());
        c2.toc(35);
        StdOut.println("Toc 35 minutes to second clock - " + c2.toString());


    }
}
