package tester;

import java.util.Scanner;

import com.app.geometry.override;


class Point2D{
	private double x;
	private double y;
	Point2D(double x,double y){//parameterized constructor
		this.x=x;
		this.y=y;
	}
	@override
	public String toString() {
		return x+" + "+y+" ";
	}
	public boolean equals(Object obj) {
		Point2D p =(Point2D) obj;//downcasting
		if(obj == null) {
			return false;
		}
		else if(obj == this) {
			return true;
		}
		else if(!(obj instanceof Point2D)) {
			return false;
		}
		else if(this.x==p.x && this.y == p.y) {
			return true;
		}
		return false;
	}
	public void getInfo() {
		System.out.print(x+" + "+y);
	}
	public double calculateDistance(Object obj) {
		Point2D other = (Point2D) obj;
		double dx = other.x - this.x;
		double dy = other.y - this.y;
		double result;
		return  result =Math.sqrt( Math.pow(dx,2)+Math.pow(dy, 2) );
	}
}

public class Point2DArray {

	private static final int case1 = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int i=0;
		int size =sc.nextInt();
		Point2D[] Points=new Point2D[size];
		for(i=0;i<size;i++) {
			System.out.println("enter x and y points for"+i+" ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			Points[i]=new Point2D(x,y);
			
		}
		
		System.out.println("1. Display details of a specific point\n 2.Display x, y co-ordinates of all points\n 3.enter 2 indices for the points , validate the indices\n 4.Exit ");
		while(true)
			{
				System.out.println("enter choice");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1://Display details of a specific points
					int index;
					System.out.println("Enter index : ");
					index = sc.nextInt();
					if(index<0 && index>size) {
						System.out.println("Invalid index ! pls retry!!!");
					}
					System.out.println(Points[index-1].toString());
					break;
				case 2://Display x, y co-ordinates of all points
					for(Point2D ele : Points) {
						System.out.println(ele.toString());
					}
					break;
				case 3:// enter 2 indices for the points , validate the indices
					int i1,i2;
					System.out.println("Enter two indices !");
					i1 = sc.nextInt();
					i2 = sc.nextInt();
					boolean out = Points[i1-1].equals(Points[i2-1]);
					if(out == true) {
						System.out.println("Points are same !");
					}
					else {
						System.out.println("Points are not same !");
					}
					break;
				case 4://exit
					sc.close();
					return;
					
				default:System.out.println("Invalid choice ! ");
				break;
						
			}
		
		
	}
}

}