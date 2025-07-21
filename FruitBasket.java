package com.app.fruits;

import java.util.Scanner;
abstract class Fruits{
	 String color;
	 double weight;
	 String name;
	 boolean isfresh = true;
	 public abstract String taste();
	 public String getName() {
			return "Name : "+this.name;
		}
}
class Fruit extends Fruits{
	public String taste() {
		return "no specific taste";
	}
	public String toString() {
		return "color : "+color+" Weight : "+weight+" name : "+name+" is that fruit fresh : "+isfresh;
	}
	
}
class Apple extends Fruits{
	public Apple(String color,double weight,String name,boolean isfresh){
		this.color=color;
		this.weight=weight;
		this.name=name;
		this.isfresh=isfresh;
	}
	public String taste() {
		return "Sweet n sour";
	}
	public String toString() {
		return "color : "+color+" Weight : "+weight+" name : "+name+" is that fruit fresh : "+isfresh;
	}
}
class Mango extends Fruits{
	public Mango(String color,double weight,String name,boolean isfresh){
		this.color=color;
		this.weight=weight;
		this.name=name;
		this.isfresh=isfresh;
	}
	public String taste() {
		return "Sweet";
	}
	public String toString() {
		return "color : "+color+" Weight : "+weight+" name : "+name+" is that fruit fresh : "+isfresh;
	}
}
class Orange extends Fruits{
	public Orange(String color,double weight,String name,boolean isfresh){
		this.color=color;
		this.weight=weight;
		this.name=name;
		this.isfresh=isfresh;
	} 
	public String taste() {
		return "Sour";
	}
	public String toString() {
		return "color : "+color+" Weight : "+weight+" name : "+name+" is that fruit fresh : "+isfresh;
	}
}
public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("0.Exit ");
		System.out.println("1.Add Mango ");
		System.out.println("2.Add Orange ");
		System.out.println("3.Add Apple ");
		System.out.println("4.Display names of all fruits in the  ");
		System.out.println("5.Display names,color and weight,taste of the fruits in the basket :   ");
		System.out.println("6.Make fruit as stale  ");
		System.out.println("7.Display taste of all stale ");
		System.out.println("enter size");
		int size=sc.nextInt();
		
		Fruits [] basket = new Fruits[size];
		int counter=0;
		while(true) {
			System.out.println("Enter choice : ");
			int ch = sc.nextInt();
			switch(ch) {
				case 0 : sc.close();
				return;
				case 1 : if(counter < 5) {
						Fruits f = new Mango("yellow",2,"Mango",true);//upcasting
						basket[counter] = f;
						counter++;
					}
				break;
				case 2 : if(counter < 5) {
					Fruits f = new Orange("Orange",3,"Orange",true);
					basket[counter] = f;
					counter++;
				}
				break;
				case 3 : if(counter < 5) {
					Fruits f = new Apple("red",4,"Apple",true);
					basket[counter] = f;
					counter++;
				}
				break;
				case 4:for(Fruits ele:basket) {
					if(ele == null) {
						break;
					}
					System.out.println(ele.getName());
				}
				break;
				case 5 : for(Fruits ele:basket) {
					if(ele == null) {
						break;
					}
					System.out.println(ele.toString());
				}
				break;
				case 6:System.out.print("Enter index : ");
					int index = sc.nextInt();
					basket[index-1].isfresh = false;
					System.out.println("Fruit at given index is stale!");
					break;
				case 7:
					for(Fruits ele:basket) {
						if(ele == null) {
							break;
						}
						if(ele.isfresh == false) {
							System.out.println(ele.taste());
						}
					}
				break;
				default: System.out.println("please enter valid choice!");
			}
		}
}

}