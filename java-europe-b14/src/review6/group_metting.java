package review6;

public class group_metting {

	public static void main(String[] args) {
boolean res=primeNumber(121);
		
		System.out.println(res);
		
		
	}
	
	public static boolean primeNumber(int num) {
		
		boolean result;
		if (num==2 || num==3 || num==5 || num==7) {
			result=true;
		}else if(num>7 && (num%2!=0 && num%3!=0 && num%5!=0 && num%7!=0) ) {
			result=true;
		}else {
			result = false;
		}
		return result;
		
	}
}