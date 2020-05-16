package day19_stringmanupulation_part1;

public class string_charat {

	public static void main(String[] args) {
String  word="apple";
System.out.println(word.length());

System.out.println(word.charAt(1));
System.out.println(word.charAt(4));
System.out.println(word.charAt(3));
String word1="slack";
if(word1.charAt(2)=='a') {
	System.out.println("A is the second alphabit");
}else {
	System.out.println("A is not second alphabit");

}
String word2="uyghur";
char first=word2.charAt(0);
char last=word2.charAt(5);
if (first==last) {
	System.out.println("first match last");
}else {	
	System.out.println("first not match last");
}
String word3="suyush";
char lastchar=word3.charAt((word3.length()-1));
System.out.println("last char of "+word3+" is "+lastchar);

	}

}
