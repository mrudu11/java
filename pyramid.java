
public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rows = 5; // Number of rows

	        for (int i = 1; i <= rows; i++) {
	            // Print leading spaces
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars with spaces
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }

	            // Move to next line
	            System.out.println();
	        }
	    }

	}


