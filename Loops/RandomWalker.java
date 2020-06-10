/*
A Java programmer begins walking aimlessly. At each time step,
she takes one step in a random direction (either north, east, south, or west),
each with probability 25%. She stops once she is at Manhattan distance r from
the starting point. How many steps will the random walker take?
This process is known as a two-dimensional random walk.

 The program RandomWalker.java that takes an integer command-line argument r
 and simulates the motion of a random walk until the random walker is at
 Manhattan distance r from the starting point. Print the coordinates at each
 step of the walk (including the starting and ending points), treating the
 starting point as (0, 0). Also, print the total number of steps taken.

*/


public class RandomWalker {

public static void main(String[] args) {

int x, y, r, d;
x = y = r = d=0;
int rand,time;
r = Integer.parseInt(args[0]);
time = 0;
System.out.println("(0, 0)");
while(d<r) {
rand = (int)(Math.random()*100);

if(rand<25) {y = y+1;}

else if(rand >=25 && rand<50)  {y = y-1;}

else if(rand >=50 && rand <75) {x = x+1;}

else x = x-1;

d = Math.abs(x)+ Math.abs(y);
System.out.println("("+x+", "+y+")");
time = time+1;
}
System.out.println("steps = "+time);
}

}

/*
This process is a discrete version of a natural phenomenon known as Brownian
motion.It serves as a scientific model for an astonishing range of physical
processes from the dispersion of ink flowing in water, to the formation of
polymer chains in chemistry, to cascades of neurons firing in the brain.
*/
