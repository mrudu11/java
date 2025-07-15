import java.util.Scanner;
public class Ass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			double num,num1,sum;
			System.out.println(" Enter two numbers : ");
			if(sc.hasNextDouble()) {
				num = sc.nextDouble();
				if(sc.hasNextDouble())
				{
					num1 = sc.nextDouble();
					sum = (num+num1)/2;
					System.out.println(" Average of two double numbers is : "+sum);
				}
				
			}
			
			
			else {
				System.out.println(" Entered numbers are not double !");
			
		}
	}

}
