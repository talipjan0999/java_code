package day22_string_manipulation_part3;

public class string_startsandEnd_with {

	public static void main(String[] args) {
String word1="eclipse";

	System.out.println(word1.startsWith("a"));
	System.out.println(word1.startsWith("e"));
	System.out.println(word1.startsWith("ecl"));

	System.out.println(word1.endsWith("e"));
	System.out.println(word1.endsWith("se"));
	System.out.println(word1.endsWith("e "));

String name="Dr.simison";
if (name.startsWith("mr.")){
	System.out.println("married man");
}else if (name.startsWith("mrs.")) {
	System.out.println("married woman");
}else if (name.startsWith("ms.")) {
	System.out.println("unmarried woman");
}else if (name.startsWith("Dr.")) {
	System.out.println("doctor man or  woman");
}else   {
	System.out.println("unknown stats");
}
	}

}
