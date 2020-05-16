package day7control_if_statment;

public class if_statments {

	public static void main(String[] args) {
		 int score=60; // if score=80 is deffirent
		// same with  boolean x=score>=70;
		 if (score>=70) {
			 
		 
		 System.out.println("Excellent");
		 System.out.println("you passed with grade 'A'");
		 }
		 System.out.println("00000000000");
		 int sales,bonus;
		 double commisionRate,salary;
		 sales=5001;salary=10000;
		 if (sales>5000) {bonus=500;commisionRate=1.12;
		 salary=sales*commisionRate+bonus;
		 }
		 System.out.println("salary= "+ salary);
	}

}
