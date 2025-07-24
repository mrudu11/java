import java.util.Scanner;
class CreditLimit{
	int account_number;
	int balance;
	public int charges=0;
	int credits;
	public static int limit = 10000;
	Scanner sc = new Scanner(System.in);
	public void setAccountNumber() {
		System.out.print("Enter account number : ");
		account_number = sc.nextInt();
	}
	public void setBalance() {
		System.out.print("Enter Balance at begining : ");
		balance = sc.nextInt();
	}
	public void setCredits() {
		System.out.print("Enter credits that you have paid : ");
		credits = sc.nextInt();
		//return credits;
	}
	public void getAccountNumber() {
		System.out.print(" account_number : "+this.account_number);
	}
	public void getBalance() {
		System.out.print(" Balance : "+this.balance);
	}
	public int getcredits() {
		//System.out.print(" account number : "+this.credits);
		return this.credits;
	}
	public void getcharges() {
		System.out.print(" charges : "+this.charges);
	}
}
public class CalculatesCreditLimits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditLimit [] cost = new CreditLimit[3];
		for (int i = 0; i < 3; i++) {
		    cost[i] = new CreditLimit();
		}
		cost[0].setBalance();
		for(int i=0;i<3;i++) {
			cost[i].setAccountNumber();
			
			//cost[i].setBalance();
			cost[i].setCredits();
			int value = cost[i].getcredits();
			if(value>CreditLimit.limit) {
					cost[i].charges+=value-CreditLimit.limit;
			}
			if(i<=1) {
				cost[i+1].charges = cost[i].charges;
			}
			
			int new_balance = cost[i].balance+cost[i].charges-cost[i].credits;
			if(i<=1) {
				cost[i+1].balance = new_balance;
			}
			
		}
		for(int i=0;i<3;i++) {
			System.out.println("For "+i+" Details :");
			cost[i].getAccountNumber();
			cost[i].getBalance();
			int charge = cost[i].getcredits();
			System.out.print(" Credits : "+charge);
			cost[i].getcharges();
		}
	}

}