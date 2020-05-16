package day36_staticclassmember;

public class calculatertest {

	public static void main(String[] args) {
		double result =calculator.plus(55, 7);
		System.out.println("result:"+result);
		calculator c=new calculator ();
		System.out.println("result:"+c.plus(55, 7));
		
		int i=Integer.parseInt(33);
		System.out.println();

	}
public static void m1() {
	System.out.println("hello");
}
}
