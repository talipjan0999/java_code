package assignment_4;

public class question4 {

	public static void main(String[] args) {
int numcall=240;
double  totalpayment;
if(numcall<=100) {
	totalpayment=200;
	System.out.println("totalpayment is $"+totalpayment);
}else if (numcall>100 &&numcall<=150) {
	totalpayment=200+(numcall-100)*0.60;
	System.out.println("totalpayment is $"+totalpayment);
}else if(numcall>150 &&numcall<=200) {
	totalpayment=200+((numcall-100)-(numcall-150))*0.6+(numcall-150)*0.5;
	System.out.println("totalpayment is $"+totalpayment);
}
else if(numcall>200) {
	totalpayment=200+(numcall-100-(numcall-200)-(numcall-100)+(numcall-150))*0.6+((numcall-100)-(numcall-150))*0.5+
			(numcall-200)*0.4;
	System.out.println("totalpayment is $"+totalpayment);
}
	}

}
