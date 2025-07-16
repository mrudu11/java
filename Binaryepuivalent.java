import java.util.Scanner;
public class Binaryepuivalent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int n;
			System.out.println("enter num");
			Scanner sc = new Scanner(System.in);
			
			n = sc.nextInt();
			String str =Integer.toBinaryString(n);
			String str1 =Integer.toOctalString(n);
			String str2 =Integer.toHexString(n);
			
			System.out.println("Binary:"+str);
			System.out.println("Octal:"+str1);
			System.out.println("Hex:"+str2);

		
	}

}
