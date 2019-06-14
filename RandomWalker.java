/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker N
 *  
 *  Simulates how many steps it takes a random walker starting at the
 *  center of a circle of radius N.
 *  
 *
 *************************************************************************/

public class RandomWalker {
	
	public static void main(String [] args){
		
		int N=Integer.parseInt(args[0]);
		
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
			System.out.println("(" + x + ", " + y + ")");
		}
		System.out.println("steps = " + steps);
	}
	
}