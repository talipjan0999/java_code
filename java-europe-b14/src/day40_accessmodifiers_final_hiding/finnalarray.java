package day40_accessmodifiers_final_hiding;

public class finnalarray {

	public static void main(String[] args) {
		final int[] times= {11,11};
		System.out.println(times[0]);
		times[0]=15;
		System.out.println(times[0]);
		
		int nums[]=new int [] {20,20,40};
		nums=new int[] {20,29,9};
		
		final int[] finalnums= {2,3,4};
		finalnums[0]=120;
		finalnums=new int[] {1,2,3};
	}

}
