package DAY31_aRRAYLIST;

import java.util.ArrayList;

public class addAll {

	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList<>();
		l1.add("java");
		l1.add("js");
		ArrayList<String> l2=new ArrayList<>();
		l2.add("c#");
		l2.add("c++");
		System.out.println(l1.toString());
		System.out.println(l2.toString());

		
		l2.addAll(l1);
		System.out.println(l2.toString());

		l1.addAll(l2);
		System.out.println(l1.toString());

	}

}
