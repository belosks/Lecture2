/*************************************************************************
 *  Compilation:  javac RandomWalkers.java
 *  Execution:    java RandomWalkers N trials
 *  
 *  In each of trials independent experiments, simulate a random walk until the random walker is at Manhattan distance r from the starting point. 
 *  Print the average number of steps.
 *  
 *
 *************************************************************************/

public class RandomWalkers {
	
	public static void main(String [] args){
		
		int N=Integer.parseInt(args[0]);
		int trials=Integer.parseInt(args[1]);
		
		double average=0;
		
		for (int i=0; i<=trials; i++){
		
			int x = 0, y = 0;
			int steps = 0;
			double r;
		
			while ((Math.abs(x) + Math.abs(y))!=N) {
				steps++;
				r = Math.random();
				if      (r <= 0.25) ++x;
				else if (r <= 0.50) --x;
				else if (r <= 0.75) ++y;
				else if (r <= 1.00) --y;
			}
		average+=steps;
	}
		System.out.println("average number of steps = " + average/trials);
	}
	
}