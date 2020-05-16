package day38_inhertiance_part2;

public class Contractor extends Employee {

	@Override
	public void calculatepay(int hours, double rate) {
		super.calculatepay(hours, rate);
		double total=(hours*rate)+200;
		System.out.println("constractor  total pay:"+total);

	}

}
