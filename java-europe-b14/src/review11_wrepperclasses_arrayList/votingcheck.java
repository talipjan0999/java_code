package review11_wrepperclasses_arrayList;

public class votingcheck {
	
	public static void main(String[] args) {
		//int age=20;
		checkifcanvote(1990);
	int age=printage(1990);
	System.out.println(age);

	}
public static void checkifcanvote(int birthyear) {
int x=printage(birthyear);
	if (x>=18) {
		System.out.println("eligiable for vote");
	}else{
		System.out.println("not eligiable for vote");
	}
}
public static int printage(int birthyear) {
	int age=2020-birthyear;
	return age;
}
}
