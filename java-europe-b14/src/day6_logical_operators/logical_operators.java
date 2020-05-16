package day6_logical_operators;

public class logical_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c1='A';
char c2=65;
int i1=5;
int i2=10;
boolean res1=(i1==i2)&&(c1==c2);
System.out.println("res1= "+ res1);
boolean res2=(i1==i2)|(c1==c2);
System.out.println("res2= "+ res2);
boolean res3=(i1==i2)||(c1==c2);
System.out.println("res3= "+ res3);
boolean res4=(i1==i2)^(c1==c2);
boolean res5=(i1==i2)^(c1!=c2);
System.out.println("res4= "+ res4);
System.out.println("res5= "+ res5);
	}

}
