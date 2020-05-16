package day18readinguserinput;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a byte value");
		
		byte b1=sc.nextByte();
		System.out.println("byte value is :"+b1);
		
		int b2=sc.nextInt();
		System.out.println(b2);
		
		short b3=sc.nextShort();
		System.out.println(b3);

boolean b4=sc.nextBoolean();
System.out.println(b4);

double b5=sc.nextDouble();
System.out.println(b5);

long b6=sc.nextLong();
System.out.println(b6);




		
		
	}

}
