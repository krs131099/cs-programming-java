/*
The program RandomWalkers.java that takes two integer command-line arguments
r and trials. In each of trials independent experiments, simulate a random
walk until the random walker is at Manhattan distance r from the starting point.
Print the average number of steps.

*/

public class RandomWalkers {

public static void main(String[] args) {

int x, y, r, d;
float trails;
float total = 0;
float avg = 0;
x = y = r = d=0;
int rand;
float time;
r = Integer.parseInt(args[0]);
trails = Integer.parseInt(args[1]);

time = 0;

for(int i = 1;i<=trails;i++) {

while(d<r) {
rand = (int)(Math.random()*100);

if(rand<25) {y = y+1;}

else if(rand >=25 && rand<50)  {y = y-1;}

else if(rand >=50 && rand <75) {x = x+1;}

else x = x-1;

d = Math.abs(x)+ Math.abs(y);
//System.out.println("("+x+", "+y+")");
time = time+1f;

}// end of while loop

avg+=time;


}// end of for loop

total = avg/trails;

System.out.println("average number of time steps = "+ total);
} // end of main method
} // end of class


/*
Estimating an unknown quantity by generating random samples and aggregating
the results is an example of Monte Carlo simulation—a powerful computational
technique that is used widely in statistical physics, computational finance,
and computer graphics.

*/
