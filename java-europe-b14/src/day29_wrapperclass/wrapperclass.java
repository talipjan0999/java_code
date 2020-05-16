package day29_wrapperclass;

public class wrapperclass {

	public static void main(String[] args) {
int i=10;
Integer i1=new Integer(10);
System.out.println(i);
System.out.println(i1);

double d=1.1;
Double d1=new Double(1.1);
Double d2=new Double("1.1");
System.out.println(d1);
System.out.println(d2);
System.out.println(d);


char ch='A';
Character ch1=new Character('e');
System.out.println(ch);
System.out.println(ch1);


byte b=100;
Byte b1=new Byte((byte)10);
System.out.println(b);
System.out.println(b1);
	}

}
