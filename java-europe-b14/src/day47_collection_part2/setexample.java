package day47_collection_part2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class setexample {

	public static void main(String[] args) {
		Set<Integer> myset=new HashSet<>();
		
		myset.add(100);
		myset.add(1000);
		myset.add(1003);
		myset.add(1002);
		myset.add(1006);
		myset.add(1006);

		System.out.println(myset.toString());
		
		List<String> list=Arrays.asList("23","23","a","e","jj","q","t","t");
		Set<String> unique=new HashSet<>(list);
		System.out.println(list.toString());
		System.out.println(unique.toString());

		TreeSet<Integer> tset=new TreeSet<>();
		
		tset.add(100);
		tset.add(1010);
		tset.add(1);
		tset.add(200);
		tset.add(300);
		tset.add(1200);
		tset.add(1030);

		System.out.println(tset.toString());

	}

}
