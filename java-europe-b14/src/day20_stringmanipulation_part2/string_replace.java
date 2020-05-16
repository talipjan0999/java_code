package day20_stringmanipulation_part2;

public class string_replace {

	public static void main(String[] args) {
String str="moscow is capital of Russia";
str=str.replace("moscow", "Urumqi").replace("Russia","East turkistan");
System.out.println(str);
String email="my first email address :";
email=email.replace(":", "talipjan1208@gmail.com");
System.out.println(email);
String str1="code is my favoriate hobbit :";
String withnospacs=str1.replace(":", "!");
System.out.println(withnospacs);


	}
	

}
