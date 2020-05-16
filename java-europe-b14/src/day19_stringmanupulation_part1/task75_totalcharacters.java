package day19_stringmanupulation_part1;

import java.util.Scanner;

public class task75_totalcharacters {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.print("enter your first name:");
String firstname=sc.next();

System.out.print("enter your last name:");
String lastname=sc.next();

System.out.println("total character in your first and last name:"+((firstname.length())+lastname.length()));
	}

}
