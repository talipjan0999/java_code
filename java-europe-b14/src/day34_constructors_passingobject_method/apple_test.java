package day34_constructors_passingobject_method;

public class apple_test {

	public static void main(String[] args) {
		apple a1=new apple();
		changeapple(a1);
		methodobject().color="brown";
	}
public static void changeapple(apple b1) {
	// i want to change color inside the method
	
	b1.color="yellow";
	b1.mA();
}
public static apple methodobject() {
	apple a1=new apple();
	return a1;
}
}
