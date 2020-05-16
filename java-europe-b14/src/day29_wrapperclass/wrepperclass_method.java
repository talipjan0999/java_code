package day29_wrapperclass;

public class wrepperclass_method {

	public static void main(String[] args) {
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MAX_VALUE);

		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isAlphabetic('1'));

		System.out.println(Character.isLetter('$'));
		System.out.println(Character.isDigit(5));
		System.out.println(Character.isDigit('p'));

String word="java101";
System.out.println(Character.isDigit(word.charAt(6)));


	}

}
