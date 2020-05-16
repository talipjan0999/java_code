package day36_staticclassmember;

public class student_test {

	public static void main(String[] args) {
		Student s1 = new Student("Mike", 30, 1000);
		Student s2 = new Student("Ozzy", 20, 1200);
		Student s3 = new Student("Jamal", 10, 1500);
		
		Student.schoole="aaa";
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}