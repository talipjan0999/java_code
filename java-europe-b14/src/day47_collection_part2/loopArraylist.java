package day47_collection_part2;


import java.util.ArrayList;
import java.util.List;

public class loopArraylist {

	public static void main(String[] args) {
List<Integer> nums=new ArrayList<>();
nums.add(50);
nums.add(5450);
nums.add(5034);
nums.add(502);
nums.add(503);
nums.add(450);
nums.add(250);

//looping using for each loop
for(Integer n :nums) {
	System.out.print(n+"|");
}
System.out.println();

//looping using for iterator loop
for(int i=0;i<nums.size();i++) {
	System.out.print(nums.get(i)+"|");
	}
System.out.println();
//looping using forEach method.Lambda expresstion
nums.forEach(n->System.out.print(n+"|"));
System.out.println();

nums.removeIf(n-> n<500);
nums.forEach(n-> System.out.println(n+"|"));

	}
}
