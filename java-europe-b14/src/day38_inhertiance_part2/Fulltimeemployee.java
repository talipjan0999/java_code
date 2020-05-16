package day38_inhertiance_part2;

public class Fulltimeemployee extends Employee {
public void calculatepay(int hours,double rate) {
	double total=(hours*rate)*1.05;
	System.out.println("employee total pay:"+total);
}
}
