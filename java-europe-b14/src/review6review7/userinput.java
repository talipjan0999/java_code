package review6review7;
import java.util.Scanner;
public class userinput {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("enter first number");

int num1=sc.nextInt();
System.out.println("enter second number");
int num2=sc.nextInt();

sc.hasNextLine();

System.out.println("enter a string");
String str=sc.nextLine();

System.out.println("output :"+num1+num2+str);
	}

}
