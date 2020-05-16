package day47_collection_part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class loopwith_itertater {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>();
		nums.add(50);
		nums.add(5450);
		nums.add(5034);
		nums.add(502);
		nums.add(503);
		nums.add(450);
		nums.add(250);
		
		//create Iterater object
		Iterator<Integer> it=nums.iterator();
		
		//call hasNext method
		//hasNext return true ,if there is still next value
		//returns false when it reaches the end or empty
		System.out.println("it.hasNext():"+it.hasNext());
		System.out.println("it.next():"+it.next());
		System.out.println("it.next():"+it.next());
		System.out.println("it.next():"+it.next());
		System.out.println("it.next():"+it.next());

		System.out.println("=======");
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		//System.out.println("it.next():"+it.next());
		Iterator<Integer> it2=nums.iterator();
		//what is the diffrences between for each loop and iterater
		//we can remove objects while looping 
		
		while(it2.hasNext()) {
			int val=it2.next();
			if(val>1000) {
				it2.remove();
			}
		}
		System.out.println(nums.toString()+"|");
		
		List<String> cities=new ArrayList<>();
		cities.add("new yourk");
		cities.add("new yourk1");
		cities.add("new yourk2");

		cities.add("new yourk3");

		for(String city:cities) {
			if(city.equals("new yourk2")) {
				cities.remove(city);
			}
		}
	}

}
