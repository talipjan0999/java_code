package method_part_1;

public class passmultipilearg {

	public static void main(String[] args) {
showsum (5,9);
showsum (11,19);
calculator (3,9,"+");
calculator (3,9,"-");
calculator (3,9,"*");
calculator (3,9,"/");
	}

	private static void calculator(int i, int j, String string) {
switch (string) {
case "+":
		System.out.println(i+j);
		break;
case "-":
	System.out.println(i-j);
	break;
case "*":
	System.out.println(i*j);
	break;
case "/":
	System.out.println(i/j);
	break;}
	}

	private static void showsum(double num,double num1) {
		System.out.println( "sum=" + ( num+num1));
		
	}

}
