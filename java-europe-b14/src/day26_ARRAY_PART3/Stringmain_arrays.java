package day26_ARRAY_PART3;

public class Stringmain_arrays {

	public static void main(String[] args) {
String[] myfruit= {"peach","date"," apple"};
System.out.println(myfruit[0].length());
System.out.println(myfruit[1].codePointAt(2));
System.out.println(myfruit[2].charAt(3));
System.out.println(myfruit[1].equals(myfruit[2]));
System.out.println(myfruit[1] == myfruit[2]);

System.out.println(myfruit[2].trim());
System.out.println("=====================");

for(int i=0;i<myfruit.length;i++) {
	System.out.println(myfruit[i].length());

}
	}

}
