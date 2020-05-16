package assignment_4;

public class question9 {

	public static void main(String[] args) {
double distance=550,rate1=1.1,rate2=2.2,rate3=3.70,rate4=3.8,charge,
weight=12;
if (weight<=2 && distance<=500) {
	charge=rate1;
	System.out.println("charge is "+charge);
}else if (weight<=2 && distance>500 ) {
	charge=((int)(distance/500))*rate1+rate1; 
	System.out.println("charge is "+charge);
}
else if (weight>2 && weight<6 && distance<=500) {
	charge=rate2;
	System.out.println("charge is "+charge);
}
else if (weight>=6 && weight<10 && distance<=500) {
	charge=rate3;
	System.out.println("charge is "+charge);
}
else if (weight>=6 && weight<10 && distance>500) {
	charge=((int)(distance/500))*rate3+rate3; 
	System.out.println("charge is "+charge);
}
else if (weight>10  && distance<=500) {
	charge=rate4;
	System.out.println("charge is "+charge);}
	else if (weight>10  && distance>500) {
	charge=((int)(distance/500))*rate4+rate4; 
	System.out.println("charge is "+charge);
}

	}

}
