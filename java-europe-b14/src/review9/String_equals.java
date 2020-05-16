package review9;

import java.util.Scanner;

public class String_equals {

	public static void main(String[] args) {
String s1="welcome to java ";
String s2="welcome to java ";
String s3=new String("welcome to java ");
System.out.println(s1==s2);
System.out.println(s1==s3);

System.out.println("============");

Scanner sc=new Scanner(System.in);

System.out.println("what is the capital of turky");
String capital=sc.next();

if (capital=="Ankara") {
	System.out.println("correct");

}else {
	System.out.println("wrong");

}

	}

}
