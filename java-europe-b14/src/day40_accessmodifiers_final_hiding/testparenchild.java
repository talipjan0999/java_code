package day40_accessmodifiers_final_hiding;

public class testparenchild {

	public static void main(String[] args) {
		child s=new child();
		System.out.println("value of x before increement"+s.x);
		s.increment();
		System.out.println("value of x after increement"+s.x);
	}

}
