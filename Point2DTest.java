package com.app.geometry;

import java.util.Scanner;
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
public class Point2DTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num1,num2;
		System.out.println("Enter x and y co-ordinate : ");
		num1= sc.nextDouble();
		num2= sc.nextDouble();
		Point2D P1 = new Point2D(num1,num2);
		System.out.println("Enter x and y co-ordinate for 2nd point : ");
		num1= sc.nextDouble();
		num2= sc.nextDouble();
		Point2D P2 = new Point2D(num1,num2);
		System.out.print("1st point is : ");
		P1.getInfo();
		System.out.println();
		System.out.print("2nd point is : ");
		P2.getInfo();
		System.out.println();
		boolean out = P1.equals(P2);
		if(out == true) {
			System.out.println("Two points are same !");
		}
		else {
			System.out.println("Two points are different !");
		}
		double out1 = P1.calculateDistance(P2);
		System.out.println(" Distance is : "+out1);
	}

}