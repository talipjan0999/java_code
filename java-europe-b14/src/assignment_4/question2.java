package assignment_4;

public class question2 {

	public static void main(String[] args) {
int income=200000000;
double  tex;
if(income<150000000) {
 tex=income*0.25;
	System.out.println("your income : "+income);
	System.out.println("The tax amount you have to pay "+tex);
}
else if(income>150000000 && income<300000000) {
	tex=(income-150000000)*0.3+150000000*0.25;
	System.out.println("your income : "+income);
	System.out.println("The tax amount you have to pay "+tex);
}
else if(income<=300000000) {
	tex=income*0.30;
	System.out.println("your income : "+income);
	System.out.println("The tax amount you have to pay "+tex);
}
else if(income<=600000000) {
	tex=income*0.35;
	System.out.println("your income : "+income);
	System.out.println("The tax amount you have to pay "+tex);
}else if(income<=1200000000) {
	tex=income*0.40;
	System.out.println("your income : "+income);
	System.out.println("The tax amount you have to pay "+tex);
}
else if(income>1200000000) {
	tex=income*0.50;
	System.out.println("your income : "+income);
	System.out.println("The tax amount you have to pay "+tex);
}

	}
}
