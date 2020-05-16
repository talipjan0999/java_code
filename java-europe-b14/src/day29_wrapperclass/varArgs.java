package day29_wrapperclass;

public class varArgs {

	public static void main(String[] args) {
sum(2,3);
sum(2,9,8);
sum(4,8,9,8);
concat("apple","orange","123");
	}

	private static void sum(int...numbers) {
		int sum =0;
		for(int value:numbers) {
			sum=sum+value;
		}
System.out.println(sum);		
	}
public static void concat(String...strs) {
	String newstr="";
	for(String str:strs) {
		newstr=newstr+str.charAt(2);
	}
	System.out.println(newstr);		

}
}
