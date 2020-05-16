package DAY31_aRRAYLIST;

import java.util.ArrayList;

public class removeIntegers {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
System.out.println(nums.size());
System.out.println(nums.isEmpty());
System.out.println(nums.size()==0);

nums.add(15);
nums.add(185);
nums.add(145);
nums.add(105);
nums.add(125);
System.out.println(nums.toString());
nums.remove(4);
System.out.println(nums.toString());
nums.remove(new Integer(145)); /// remove the specific elment form object
System.out.println(nums.toString());

	}

}
