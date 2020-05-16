package day23_string_manipulation_part3;

public class Q12 {

	public static void main(String[] args) {
String str="catdog";
int countercat=0,counterdog=0;

for (int i=0;i<str.length()-2;i++) {
if(str.substring(i,i+3).equals("hi"))	{
	countercat++;
}if(str.substring(i,i+3).equals("hi"))	{
		counterdog++;
}
}
if(countercat==counterdog) {
System.out.println(true);
	}else {
		System.out.println(false);
	}
}
}