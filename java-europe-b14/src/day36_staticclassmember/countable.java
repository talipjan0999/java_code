package day36_staticclassmember;

public class countable {
static int instancecount;
public countable() {
	instancecount++;
}
public int getInstancecount() {
	return instancecount;
}
}
