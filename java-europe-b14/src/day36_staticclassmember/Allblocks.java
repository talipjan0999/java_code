package day36_staticclassmember;

public class Allblocks {
	public Allblocks(int x) {
		System.out.println("one argument constructor ");
	}

	public Allblocks() {
		System.out.println("no argument constructor ");
	}

	static {
		System.out.println("first static init");
	}
	{
		System.out.println("first  init block ");

	}
	{
		System.out.println("second  init block ");
	}
	static {
		System.out.println("second static init");
	}
}
