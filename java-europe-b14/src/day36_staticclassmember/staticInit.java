package day36_staticclassmember;

public class staticInit {
static final int num_second_per_hours;
static {
	System.out.println("static init");
	int numsecondperminute=60;
	int numminuteperhour=60;
	num_second_per_hours=numminuteperhour*numsecondperminute;
}
private static int one;
private static final int two;
private static final int three=3;
private static final int four;

static {
	one=1;
	two=2;
	three=4;
	two=4;
	
}
}
