package day33_class_object_constructer;

import java.util.Scanner;

public class bankaccount_test {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String input;
System.out.println("what is your starting balance?");
input=sc.next();
bankaccount account=new bankaccount(input);
System.out.println("how much were u paid this month");

input=sc.next();

account.deposite(input);
System.out.println("your pay has been deposited.ypur current balance is"+account.getbalance());
	}

}
