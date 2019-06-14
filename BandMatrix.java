/******************************************************************************
 *  Compilation:  javac BandMatrix.java
 *  Execution:    java BandMatrix  n width
 *  
 *  Prints out an n-by-n matrix  with a zero (0) for each element whose distance
 * from the main diagonal is strictly more than width, and an asterisk (*) for each entry that is not, and two spaces between each 0 or *.
 *
 *  % java Triangle
 *  * * * * * * 
 *  . * * * * *
 *  . . * * * *
 *  . . . * * *
 *  . . . . * *
 *  . . . . . *
 *
 ******************************************************************************/



public class BandMatrix {
	
	public static void main(String [] args) {
		
		int n=Integer.parseInt(args[0]);
		int width=Integer.parseInt(args[1]);
		
		// loop n times, one for each row
        for (int i=0; i< n; i++) {
            // loop width times, one for each collom
			for ( int j =0; j <n; j++ ) {
                if ( Math.abs(i-j)<=width) System.out.print("* ");
                else            System.out.print("0 ");
            }
            
			// print a new line
           System.out.println();
	}
  }

	
}