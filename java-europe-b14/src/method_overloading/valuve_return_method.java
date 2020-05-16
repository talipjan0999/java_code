package method_overloading;

public class valuve_return_method {

	public static void main(String[] args) {
method_valuve_return(2,"apple");
System.out.println(method_valuve_return(2,"apple"));

int j=method_valuve_return(2,"apple")%2;
System.out.println(j);
	}

	public  static int method_valuve_return(int i, String string) {
		
		int sum=4+i;
		return sum;
	}

}
