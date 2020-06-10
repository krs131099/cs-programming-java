/*
The program BandMatrix.java that takes two integer command-line arguments n
and width and prints an n-by-n pattern like the ones below, with a zero (0)
for each element whose distance from the main diagonal is strictly more than
width, and an asterisk (*) for each entry that is not, and two spaces between
each 0 or *.

*/

public class BandMatrix {
public static void main(String[] args) {

int n, width;
n= Integer.parseInt(args[0]);
width = Integer.parseInt(args[1]);

//the abs value is positive and when the conditon is reached to zero, print *
for(int i = 0; i<n;i++) {

for(int j = 0; j<n;j++) {

if(Math.abs(i-j)<=width) {System.out.print("*  ");}

else {System.out.print("0  ");}


} System.out.println(); }
}
}

/*
Band matrices are matrices whose nonzero entries are restricted to a diagonal
band. They arise frequently in numerical linear algebra.
*/
