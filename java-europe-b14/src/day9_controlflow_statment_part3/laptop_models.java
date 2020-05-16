package day9_controlflow_statment_part3;

public class laptop_models {

	public static void main(String[] args) {
		String computer="Apple";
		switch (computer) {
		case"Apple":
		System.out.println("No virus");
		
		break;
		case "Dell":
		
			System.out.println("Tough one");
			break;
		case"Acer":
			System.out.println("Not recommended");
			break;
		default:
			System.out.println("Do not buy that one");	
		
		}
	}

}
