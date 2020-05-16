package day3_variables_datatype;

public class primitivevariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1=20;
		byte b2=10;
		//byte b3=-129;
		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		short s1=100;
		short s2=-100;
		short s3=32688;
		System.out.println("s1="+ s1);
		System.out.println("s2"+s2);
		System.out.println("s3="+s3);
		int i1=-1090900;
		int i2=1980800;
		int i3=100_000;
		System.out.println("i1="+i1 +" i2="+i2 +" i3="+i3);
		long l1=50000;
		long l2=-2999998999l; //suffix l is mandatory,because this number outoff the range
		long creditcard=567_7889_898_980l;
		
		System.out.println("l2="+l2);
		System.out.println("creditcard=" +creditcard);
		//floating number:defaulting is double
		float f1=-2.1f;
		double PI=3.14;
		System.out.println("f1="+f1);
		System.out.println("PI="+PI);
		char c1='A';
		char c2=65;
		char c3=9899;
		char c4=9098;
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		System.out.println("c4="+c4);
		boolean statue=true;
		boolean statues=false;
		System.out.println("Eligible to take exam="+statue);
		System.out.println("He is 16 age old,he can take exam:"+ statues);
		String name="murat";// s is capital word string is most important datatype
		System.out.println("my name is "+ name);
		
	}

}
