package method_part_1;

public class deepanddepper {

	public static void main(String[] args) {
System.out.println("i am starting main");
deep();
System.out.println("new i am back in main");
	}

	private static void deep() {
System.out.println("now i am in deep");
deeper();
System.out.println("new i am back in deep");

	}

	private static void deeper() {
System.out.println("now i am in deeper");

	}

}
