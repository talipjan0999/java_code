package day9_controlflow_statment_part3;

public class dayselecter {

	public static void main(String[] args) {
		int day=10;
		switch (day) {
		case 1:
			
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednsday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Frieday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunnday");
			break;
			default:
				System.out.println("not in the weekdays list");
		}
	}

}
