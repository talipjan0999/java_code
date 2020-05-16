package day38_inhertiance_part2;

public class Student extends Person {

	@Override
	public void message() {
		System.out.println("this is student class");			
	}
	
public void display() {
	message();
	super.message();
}
}
