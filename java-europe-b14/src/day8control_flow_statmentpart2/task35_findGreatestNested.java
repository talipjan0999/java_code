package day8control_flow_statmentpart2;

public class task35_findGreatestNested {

	public static void main(String[] args) {
		
		int n1=1000;
		int n2=2000;
		int n3=3000;
		
		//find the greatest by using nested if 
		
		if(n1>n2 && n1>n3) {
			System.out.println("n1 is biggest");
		}else {
			if(n2>n3) {
				System.out.println("n2 is biggest");
			}else {
				System.out.println("n3 is biggest"); //n3>n2
			}
	}

	}
}
