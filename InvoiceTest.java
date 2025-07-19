import java.util.Scanner;
class Invoice{
	private String part_num;
	private String part_des;
	private int quantity;
	private double price;
	private double invoice_amt;
	
	Scanner sc = new Scanner(System.in);
	public Invoice(String part_num, String part_des,int quantity,double price) {
		this.part_num=part_num;
		this.part_des=part_des;
		this.quantity=quantity;
		this.price=price;
	}
	public void setInfo() {
		 System.out.println("Enter part number  : ");
		 part_num=sc.next();
		 System.out.println("Enter part description : ");
		 part_des=sc.next();
		 System.out.println("Enter quantity : ");
		 quantity=sc.nextInt();
		 if(quantity<0) {
			 quantity=0;
		 }
		 System.out.println("Enter price : ");
		 price=sc.nextDouble();
		 if(price<0) {
			 price=0.0;
		 }
	 }
	public void getInfo() {
		 System.out.println("part number: "+part_num+" part description : "+part_des+" quantity : "+quantity+" price : "+price);
	 }
	public double getInvoiceAmt() {
		invoice_amt = quantity*price;
		return invoice_amt;
	}
	
}
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice i = new Invoice("1234","Engine",1,500);
		i.getInfo();
		i.setInfo();
		i.getInfo();
		double final_out=i.getInvoiceAmt();
		System.out.println("Invoice amount : "+final_out);
	}

}