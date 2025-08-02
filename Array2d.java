import java.util.Scanner;

public class Array2d {
	public void getinfo() {
		int i, j;
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter elements:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		
		System.out.println("The  matrix is:");
		for (i = 0; i <3; i++) {
			for (j = 0; j <3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		 System.out.println("Element at row 2, column 1: " + arr[2][1]);

	}
	
	public static void main(String[] args) {
		Array2d arr = new Array2d();
		arr.getinfo();
	} 
	
}
