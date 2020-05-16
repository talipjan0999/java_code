package day26_ARRAY_PART3;

import java.util.Random;

public class MethodArray {

	public static void main(String[] args) {
printarray(15);
	}
private static void printarray(int numbers) {
for(int value:creatarray(numbers))	{
	System.out.println(value);
}
	}
public static int[] creatarray(int arraysize) {
	Random rn=new Random();
	int[] myarray= new int[arraysize];
	for(int i=0;i<myarray.length;i++) {
		myarray[i]=rn.nextInt(50);
	}
	return myarray;
}
}
