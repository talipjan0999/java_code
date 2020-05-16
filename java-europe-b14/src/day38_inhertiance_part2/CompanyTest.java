package day38_inhertiance_part2;

public class CompanyTest {

	public static void main(String[] args) {
		Employee emp=new Employee();
		Fulltimeemployee ft=new Fulltimeemployee();
		Contractor ct=new Contractor();
		
		emp.calculatepay(40, 40);
		ft.calculatepay(40, 40);
		ct.calculatepay(40, 40);
	}

}
