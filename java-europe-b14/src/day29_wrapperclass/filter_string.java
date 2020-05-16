package day29_wrapperclass;

public class filter_string {

	public static void main(String[] args) {
String str="@#@$@%@^*&(*&*)_)+&*&^%&^%$^$$#@$@@!#";
System.out.println(filterstring(str));
	}
public static String filterstring(String s) {
	String str="";
	for (int i=0;i<s.length();i++) {
		if(Character.isAlphabetic(s.charAt(i)) ) {
			str=str+s.charAt(i);
		}
	}
	return str;
}
}
