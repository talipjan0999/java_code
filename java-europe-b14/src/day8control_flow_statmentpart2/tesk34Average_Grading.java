package day8control_flow_statmentpart2;

public class tesk34Average_Grading {

	public static void main(String[] args) {
		
		int math=100;
		int phy=90;
		int chems=90;
		double avrage=(math+phy+chems)/3;
		System.out.println("avrage"+avrage);
		if(avrage>=0 && avrage<=59) {System.out.println("Grade is F");}
		else if(avrage>=60 && avrage<=69) {
			System.out.println("Grade is D");
		}else if(avrage>=70 && avrage<=79) {
			System.out.println("Grade is C");
		}else if(avrage>=80 && avrage<=89) {
			System.out.println("Grade is B");
		}else if(avrage>=90 && avrage<=100) {
			System.out.println("Grade is A");
		}

	}

}
