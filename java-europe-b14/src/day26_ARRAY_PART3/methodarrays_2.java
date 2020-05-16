package day26_ARRAY_PART3;

import java.util.*;

public class methodarrays_2 {

	public static void main(String[] args) {
System.out.println(findcar(4,"honda"));
	}
public static String[] creatcar(int arraysize) {
	Scanner sc=new Scanner(System.in);
	String[] cararray=new String[arraysize];
	for (int i=0;i<cararray.length;i++) {
		System.out.println("Ente your car #"+ (i+1));
		cararray[i]=sc.next();
	}

	return cararray;
	}
public static boolean findcar(int value,String tofindcar) {
	for (String car:creatcar(value)) {
		if(car.equalsIgnoreCase(tofindcar)) {
			return true;
		}
	}
	return false;
}
}
