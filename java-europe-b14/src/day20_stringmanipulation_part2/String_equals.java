package day20_stringmanipulation_part2;

public class String_equals {

	public static void main(String[] args) {
String s1="   welcome to java   ";
String s2="welcome to java";
String s3="welcome to c++";
boolean b1=s1.equals(s2);
boolean b2=s2.equals(s1);
System.out.println(b1+"|"+b2);


boolean b3=s1==s2;
boolean b4=s1==s3;

System.out.println(b3+"|"+b4);
String s4=new String("welcome to java");
System.out.println(s1==s4);
System.out.println(s1.equals(s4));

System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());

System.out.println(s1.trim());
	}

}
