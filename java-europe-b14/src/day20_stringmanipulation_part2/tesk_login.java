package day20_stringmanipulation_part2;

import java.util.Scanner;

public class tesk_login {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("enter your name");
String username=sc.nextLine();

System.out.println("enter your password");
String password=sc.nextLine();

String usernameinsystem="murat";
String passwordinsystem="2019";


if(username.equals("") && password.equals("")) {
	System.out.println("user name and password cant be empty");
}else if (username.equals("") && !password.equals("")) {
	System.out.println("user name cant be empty");	
}else if (!username.equals("") && password.equals("")) {
	System.out.println("password cant be empty");		
}else if (!username.equals(usernameinsystem) || !password.equals(passwordinsystem)) {
	System.out.println("username or password not valied");		
}else if (username.equals(usernameinsystem) && password.equals(passwordinsystem)) {
	System.out.println("using login successful");
}
	}

}
