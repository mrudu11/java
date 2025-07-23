import java.util.Scanner;

public class Calculates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double milesPerDay = sc.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = sc.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = sc.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFees = sc.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = sc.nextDouble();

      
        double gallonsUsed = milesPerDay / milesPerGallon;
        double fuelCost = gallonsUsed * costPerGallon;

      
        double totalCost = fuelCost + parkingFees + tolls;

      
        System.out.printf("Your total60 daily driving cost is:₹%.2f\n", totalCost);

        sc.close();
    }
}
