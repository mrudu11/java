import java.util.Scanner;

public class Raggedarray{
	public void getinfo() {
		int i, j;
		int arr[][] = new int[3][];
		arr[0]=new int[1];
		arr[1]=new int[2];
		arr[2]=new int[3];
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter elements:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j <arr[i].length ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		
		System.out.println("The  matrix is:");
		for (i = 0; i <3; i++) {
			for (j = 0; j <arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
}
	
	public static void main(String[] args) {
		Raggedarray arr = new Raggedarray();
		arr.getinfo();
	} 
	
}
