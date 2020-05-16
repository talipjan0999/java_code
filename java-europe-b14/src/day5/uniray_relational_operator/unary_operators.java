package day5.uniray_relational_operator;

public class unary_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i1=+10000989;
int i2=-100;
int i3=-(i1+i2);
System.out.println("i3= "+i3 + " i2= "+i2 +" i1= "+i1);
System.out.println(++i3 );
System.out.println(--i3 );
System.out.println(i3++ );
System.out.println(i3-- );
boolean flag=true;
System.out.println(!flag);
System.out.println(!!!!flag);
int res=++i1 + --i2;
System.out.println(res--);


	}

}
