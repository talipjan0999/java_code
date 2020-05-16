package day47_collection_part2;

import java.util.HashSet;

import java.util.Set;

public class loopset {

	public static void main(String[] args) {
		Set<Integer> nuMSet=new HashSet<>();
		nuMSet.add(50);
		nuMSet.add(5450);
		nuMSet.add(5034);
		nuMSet.add(502);
		nuMSet.add(503);
		nuMSet.add(450);
		nuMSet.add(250);
		
		for(Integer n:nuMSet ) {
			System.out.println(n+"|");
		}
		System.out.println();
		nuMSet.forEach(n-> System.out.println(n+"|"));
	}

}
