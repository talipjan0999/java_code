package day29_wrapperclass;

public class parsing_values {

	public static void main(String[] args) {
String numberasString="2020";
System.out.println(numberasString);


int number=Integer.parseInt(numberasString);
System.out.println(numberasString);

number=number+1;
System.out.println(number);
System.out.println(numberasString);

double number2=Double.parseDouble(numberasString);
System.out.println(number2);

int i4=10;
String s=String.valueOf(i4);
System.out.println(i4); // it will return "10"

String s2=Integer.toString(i4);
System.out.println(i4);


	}

}
