package day26_ARRAY_PART3;

import java.util.Arrays;

public class howmany_words {

	public static void main(String[] args) {
String str="When in the market men with tall fur hats are used for target practice and a man’s face draws out in agony as a bullet cleaves his brain, and\n" + 
		"before the eyes that look to find the reason of their death the executioner fades and disappears,\n" + 
		"reflected in that bullet-pierced brain’s fevered thoughts will be my form, just then";
String[] array=str.split(" ");
System.out.println(array.length);
System.out.println(array[14]);


for(String value:array) {
	System.out.println(value);
	System.out.println(Arrays.deepToString(array));

}
	}

}
