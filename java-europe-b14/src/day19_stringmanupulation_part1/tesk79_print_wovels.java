package day19_stringmanupulation_part1;

public class tesk79_print_wovels {

	public static void main(String[] args) {
String str="cybertekshool";
for (int i=0;i<str.length();i++) {
	char letter=str.charAt(i);
	if(letter=='a' || letter=='e' || letter=='o' || letter=='i' || letter=='u') {
		System.out.print(letter);
		if(i!=str.length()-2) {
			System.out.print(",");

		}

	}
}
	}

}
