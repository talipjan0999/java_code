package day29_wrapperclass;

public class boxing {

	public static void main(String[] args) {
// Autoboxing to ----->primitive object
		Integer num1=123;
		int i=9;
		Integer num2=i;
		//unboxing to---->object to primitive
		Double d1=new Double(1.2);
		Double d2=d1;
		System.out.println(d2);
		
		int j=9;
		double k=j;
		
		Integer j1=Integer.valueOf(13);
		///// *  Double k1=j1; in wrepper classe it is not possible to casting */
		
	}

}
