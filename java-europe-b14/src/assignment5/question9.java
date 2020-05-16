package assignment5;

public class question9 {

	public static void main(String[] args) {
		int num=122900;
		
        
        int n1 = num / 100000 % 10;
        int n2 = num / 10000 % 10;
        int n3 = num / 1000 % 10;
        int n4 = num / 100 % 10;
        int n5 = num / 10 % 10;
        int n6 = num % 10;
        System.out.println("-Display prompt:"+n1);
        System.out.println("-Display prompt:"+n2);
        System.out.println("-Display prompt:"+n3);
        System.out.println("-Display prompt:"+n4);
        System.out.println("-Display prompt:"+n5);
        System.out.println("-Display prompt:"+n6);

    }
}