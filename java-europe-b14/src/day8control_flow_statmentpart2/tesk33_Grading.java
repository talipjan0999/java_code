package day8control_flow_statmentpart2;

public class tesk33_Grading {

	public static void main(String[] args) {
		int mark=101;
		if(mark<60) {System.out.println("failed");}
		else if(mark>=60 && mark<=90) {System.out.println("pass");}
		else if(mark > 90){System.out.println("passed with distiction");}
		else {System.out.println("invalied score");}

	}       
}
