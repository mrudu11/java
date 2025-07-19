import java.util.Scanner;
class Date{
	
	private int day;
	private int month;
	private int year;
	Scanner sc = new Scanner(System.in);
	
	Date(){
		this(11,04,2005);
}
	Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void getinfo(){
		System.out.println("day:"+day+"month:"+month+"year:"+year);
	}
	public void setinfo() {
		System.out.println("enter day:");
		day =sc.nextInt();
		System.out.println("enter month:");
		month =sc.nextInt();
		System.out.println("enter year:");
		year =sc.nextInt();
	}
	public void displayDate() {
		System.out.println(day+"/"+month+"/:"+year);
	}
}
	
	class DateTest {
		
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Date d=new Date();
	Date d1=new Date(30,04,2003);
	d.getinfo();
	d.setinfo();
	d.getinfo();
	d.displayDate();

	}
}


