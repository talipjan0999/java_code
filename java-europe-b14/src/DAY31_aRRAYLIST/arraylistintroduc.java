package DAY31_aRRAYLIST;

import java.util.ArrayList;

public class arraylistintroduc {

	public static void main(String[] args) {
		////Creating Arraylist/
ArrayList<String> names=new ArrayList<>();
ArrayList<Integer> nums=new ArrayList<>();
//assigning value to  arraylist /
names.add("murat");
names.add("musa");
names.add("muzat");
names.add("hacer");

nums.add(99);
nums.add(199);
nums.add(299);
nums.add(499);
nums.add(399);
nums.add(new Integer("100"));

//reading from arraylist/
System.out.println(nums.get(0));
System.out.println(nums.get(1));
System.out.println(nums.get(2));

System.out.println(names.get(0));
System.out.println(names.get(1));
System.out.println(names.get(2));

System.out.println("names count"+names.size());
System.out.println("names count"+nums.size());

System.out.println(names.toString() );
System.out.println(nums.toString() );

	}

}
