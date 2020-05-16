package day8control_flow_statmentpart2;

public class smalltask2 {

	public static void main(String[] args) {
		int x=100;
		int y=10;
		if(x>100) {y=20;}
		

		else {y=0;}
		System.out.println("y= "+y);
		
		if(y==100) {x=1;}
		else {x=0;}
		System.out.println("x= "+x);
		int a=20;
		int b=0;
		int c=0;
		if (a<=10) {b=0;c=1;}
		else {b=-99;c=0;}
		System.out.println("b= "+b+" c="+c);
	}
}
