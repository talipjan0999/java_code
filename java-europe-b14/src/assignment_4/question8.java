package assignment_4;

public class question8 {

	public static void main(String[] args) {
int prices=99;
int quantity=90;
double dicount1=0.2,discount2=0.3,dicount3=0.4,dicount4=0.5,totalprice;
if (quantity>=10 && quantity<=19) {
	totalprice=(prices*quantity)*dicount1;
	System.out.println("totalprice  is :"+totalprice);
}
else if (quantity>=20 && quantity<=49) {
	totalprice=(prices*quantity)*discount2;
	System.out.println("totalprice  is :"+totalprice);
}
if (quantity>=50 && quantity<=99) {
	totalprice=(prices*quantity)*dicount3;
	System.out.println("totalprice  is :"+totalprice);
}
if (quantity>=100 ) {
	totalprice=(prices*quantity)*dicount4;
	System.out.println("totalprice  is :"+totalprice);
}
	}

}
