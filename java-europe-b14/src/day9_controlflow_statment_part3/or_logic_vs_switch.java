package day9_controlflow_statment_part3;

public class or_logic_vs_switch {

	public static void main(String[] args) {
		char grade='E';
		switch (grade) {
		
		case 'A':case 'B':case 'C':
			System.out.println("pass");
			break;
		case 'D':case 'E':
			System.out.println("fail");
			break;
		}
	}

}
