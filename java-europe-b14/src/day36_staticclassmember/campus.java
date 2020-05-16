package day36_staticclassmember;

public class campus {
private String city;
static String country;
static {
	System.out.println("static lock-1");
	country="usa";
}
public campus(String city) {
	System.out.println("constructor");
	this.city=city;
	
}static {
	System.out.println("static block-2");
	country="uk";
}
}
