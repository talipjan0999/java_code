package day24_ARRAY_PART1;

import java.util.Scanner;

public class TESK86_MONTHarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
String[] myArray=new String[12];
myArray[0]="JANURAY";
myArray[1]="FAB";
myArray[2]="MARCH";
myArray[3]="APRIL";
myArray[4]="MAY";
myArray[5]="JUN";
myArray[6]="JULY";
myArray[7]="AUGOST";
myArray[8]="SEPTEMBER";
myArray[9]="OCTOBER";
myArray[10]="NOVEMBER";
myArray[11]="DECEMBER";
System.out.println("enter your month index");
int index=sc.nextInt();

System.out.println("this month is "+myArray[index]);
	}

}
