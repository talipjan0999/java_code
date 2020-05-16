package DAY31_aRRAYLIST;

import java.util.ArrayList;

public class containsMethod {

	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList<>();
		l1.add("Jan");
		l1.add("Fab");
		System.out.println(l1.toString());
		ArrayList<String> l2=l1;
		//copy all the values from the l1
		ArrayList<String> month=new ArrayList<>(l1);
		System.out.println(month.toString());

		month.add("March");
		month.add("April");

System.out.println(month.contains("may"));
System.out.println(month.contains("April"));

System.out.println(l2.toString());

System.out.println(month.contains(month.indexOf("Fab")==1));
System.out.println(month.contains(month.get(1).equals("fab")));


if(month.containsAll(l1)) {
	System.out.println(l1);
}else {
	System.out.println("some values are missing ");
}
	}

}
