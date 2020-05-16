package day7control_if_statment;

public class small_tsaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x, y;
x=5;
y=20;
if (y==20){
	x=0;
	
	
}
System.out.println("x="+ x +" y="+ y);
double payRate=10000;
int hours=41;
if (hours>40) {
	payRate=payRate*1.5;
}
System.out.println("payRate= "+payRate);
int a=90;
int b=20;
int c=120;
if(b==50 ||c>=100) {a=20;}
System.out.println("a= "+a);
int temp=90;
if (temp>=70 && temp<=80) {
	System.out.println("idealtemp");
}
System.out.println("no idealtemp");
}

}
