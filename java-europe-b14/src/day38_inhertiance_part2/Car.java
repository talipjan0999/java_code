package day38_inhertiance_part2;

public class Car extends vihcle {
	int maxSpeed=180;
	public void display() {
		System.out.println("maximum speed:"+super.maxSpeed);

		System.out.println("maximum speed :"+maxSpeed);
	}

}
