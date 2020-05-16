package day37_Inheritance;

public class Schoole {

	public static void main(String[] args) {
		Person person=new Person();
		Student student=new Student();
		
		person.name="mike";
		person.age=35;
		person.gender='m';
		
		student.name="simith";
		student.age=30;
		student.gender='m';
		
		student.studentID=1000;
		
		person.eat("kebab");
		student.eat("lagman");
		
		///person.code("java");
	}

}
