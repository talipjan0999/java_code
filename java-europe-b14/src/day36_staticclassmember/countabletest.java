package day36_staticclassmember;

public class countabletest {

	public static void main(String[] args) {
		int objectcount;
		countable obj1=new countable();
		countable obj2=new countable();

		countable obj3=new countable();
		objectcount=obj1.getInstancecount();
		objectcount=obj2.getInstancecount();
		System.out.println(objectcount);

	}

}
