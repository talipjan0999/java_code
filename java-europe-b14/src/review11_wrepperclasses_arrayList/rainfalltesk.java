package review11_wrepperclasses_arrayList;

import java.util.Scanner;

public class rainfalltesk {

	public static void main(String[] args) {
String[] month= {"jan","fab","m","a","may","jun","july","aug","sep","oct","nov","desem"};
double[] rain=new double[12];
Scanner keyboard=new Scanner(System.in);
System.out.println("please enter in the following rainfall for the month ahead");
System.out.println("month\trainfall(inches)");
for(int i=0;i<month.length;i++) {
	System.out.println(month[i]+":");
	double val=keyboard.nextDouble();
	while(val<0) {
		System.out.println("do not enter negative val.re enter");
		val=keyboard.nextDouble();
	}
	rain[i]=val;
}System.out.println("the sum of all the rain is:"+getsum(rain)+"inches");
System.out.println("the avarage rainfall is "+getavrage(rain)+"inches");
System.out.println("the max rain is :"+getmaxvale(rain)+"inches");
	}
private static String getmaxvale(double[] rain) {
		return null;
	}
public static double getsum(double[] rain) {
	double sum=0;
	for(double temp:rain) {
		sum=sum+temp;
		
	}
	return sum;
}
public static double getavrage(double[] rain) {
	
	return getsum(rain)/rain.length;
}
}
