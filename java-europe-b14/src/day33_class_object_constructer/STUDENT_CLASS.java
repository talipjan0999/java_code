package day33_class_object_constructer;

public class STUDENT_CLASS {
String name;
String course;
int age;
int  year;
char   gender;
String university="Gdansk";


public STUDENT_CLASS (String name,int age,char gender,int year,String course,String university) {
	this.age=17;
	this.course="java";
	this.gender='m';
	this.name="mike";
	this.year=2016;
	this.age=17;
	this.university="Gdansk";
}

	public STUDENT_CLASS(String name, String course, int age, int year, char gender) {
	super();
	this.name = name;
	this.course = course;
	this.age = age;
	this.year = year;
	this.gender = gender;
}

	public void attandlecture() {
		System.out.println(name+"attanding lecture");
	}
	public void submitaassignment() {
		System.out.println(name+"subiting assignment");

	}
}