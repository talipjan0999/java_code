package day9_controlflow_statment_part3;

public class tesk39_trafictrafficlight_selecter {

	public static void main(String[] args) {
		char color='B';
switch (color) {
case 'R':case 'r':
	System.out.println("red light");
	break;
case 'o':case 'O':
	System.out.println("orange light");
	break;
case 'G':case 'g':
	System.out.println("green light");
	break;
	default:
	System.out.println("invalied light");
}		
	}

}
