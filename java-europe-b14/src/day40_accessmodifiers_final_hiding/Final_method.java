package day40_accessmodifiers_final_hiding;

public class Final_method {

	
	public void method1() {
		System.out.println("method-1");
	}
	public static void staticmethod(String word) {
		System.out.println("static method");
	}
}
class sub extends Final_method() {
	System.out.println("method-1 in sub class");
}
public static void staticmethod(String word) {
	System.out.println("static method in sub class");
}
}