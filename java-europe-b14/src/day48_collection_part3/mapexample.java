package day48_collection_part3;

import java.util.HashMap;
import java.util.List;
import java.util.*;

public class mapexample {

	public static void main(String[] args) {
		
		List<Integer> items2=new ArrayList<>();
		items2.add(10);

		
		Map<String,Double> items=new HashMap<>();
		items.put("apple", 2.9);
		items.put("flowers", 99.9);
		items.put("eggs", 4.9);
		items.put("ozzy", 7.9);
		items.put("asiya", 19.9);
		items.put("apple", 12.9);

		System.out.println(items.size());
		System.out.println(items.toString());
		
		
		System.out.println(items.isEmpty());

		System.out.println(items.get("apple"));
		System.out.println(items.get("ozzy"));

items.remove("flowers");
System.out.println(items.toString());
System.out.println("is apple there?"+items.containsKey("apples"));

System.out.println("is flowers there  ?"+items.containsKey("flowers"));

		items.replace("eggs", 3.15);
		System.out.println("price of eggs:"+items.get("eggs"));
        items.put("ozzy", 1.1);
System.out.println("price of ozzy:"+items.get("ozzy"));

	// increase price of cherries by 2$
   // items.replace("ozzy", items.get("ozzy")+2);
    System.out.println(items.get("ozzy")+2);

		
		
		
		
	}

}
