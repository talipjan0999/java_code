package day5.uniray_relational_operator;

public class task21_incrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		int y = x * 4 - x++;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		//x in memory : 4 - > 5
		//y           : 4 * 4 - 4 = > 12
	}

}
