package method_part_1;

public class credi_card_method {

	public static void main(String[] args) {
double salary=5001;
int creditrating=15;
if (salary>5000 && creditrating>=7) {
	qualify();
}else { noqualify();
	}
}

	

	private static void noqualify() {
System.out.println("i am sorry, you are not qualified credit card");		
	}

	private static void qualify() {
System.out.println("congratualtion,you are qualified credit card");		
	}

}
