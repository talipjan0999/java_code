package DAY31_aRRAYLIST;

import java.util.ArrayList;

public class arraylistexample {

	public static void main(String[] args) {
//languages 
		///print size of arraylisy
		//read couple of elments
		ArrayList<String> languages=new ArrayList<>();
languages.add("uyghur");
languages.add("java");
languages.add("turkish");
languages.add("english");
System.out.println("number of values:"+languages.size());
System.out.println(languages.toString());
languages.add("russian");
System.out.println(languages.toString());

languages.remove(4);
System.out.println(languages.toString());

	}

}
