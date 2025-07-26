
public class Conschaining {
	int day,month,year;
	
	public Conschaining()
	{
		this(11,04,2005);
	}
	public Conschaining(int day,int month,int year)
	{
		this.day =day;
		this.month =month;
		this.year =year;
		System.out.println("day:"+day+"\nmonth:"+month+"\nyear:"+year);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conschaining c1= new Conschaining();
		Conschaining c2= new Conschaining(30,4,2003);
		

	}

}
