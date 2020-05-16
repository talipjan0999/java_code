package day23_string_manipulation_part3;

public class Q11 {

	public static void main(String[] args) {
		int counter=0;
String str=" hi hi hi hi olo h lhip";
for (int i=0;i<str.length()-1;i++) {
if(str.substring(i,i+2).equals("hi"))	{
	counter++;
}
}
System.out.println(counter);

	}
}
