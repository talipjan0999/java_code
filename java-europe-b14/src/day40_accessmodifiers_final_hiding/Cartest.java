package day40_accessmodifiers_final_hiding;

public class Cartest {

	public static void main(String[] args) {
		Car c=new Car();
		c.model="m3";
		c.year=2017;
		//c.door=4;
		c.engine=5.3;
		System.out.println(c.toString());
	}

}
