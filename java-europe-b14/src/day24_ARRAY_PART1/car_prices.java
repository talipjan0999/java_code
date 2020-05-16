package day24_ARRAY_PART1;

import java.util.*;

public class car_prices {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Random rn=new Random();

int price=0;
String[] car=new String[7];
car[0]="Honda";
car[1]="Toyota";
car[2]="Nissan";
car[3]="BWW";
car[4]="Mercedes";
car[5]="porsche";
car[6]="Ferrari";
System.out.println("your selected car");
int  indexcar=sc.nextInt();
String selectedcar=car[indexcar];

switch(selectedcar){
case"Honda":case"Toyota":case"Nissan":
	price=rn.nextInt((40000-20000)+1)+20000;
	break;
case"BWW":case"Mercedes":
	price=rn.nextInt((80000-50000)+1)+50000;
	break;
case"Porsche":case"Ferrari":
	price=rn.nextInt((150000-100000)+1)+100000;
	break;	
	default:
		System.out.println("invalied car selection");
}System.out.println("price for selected car is "+price);
	}

}

