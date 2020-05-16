package day36_staticclassmember;

public class Student {
String name;
int age;
int idnumber; // belongs to object 
static String schoole="cybertek";// belongs to class
public Student(String name, int age, int idnumber) {
	
	this.name = name;
	this.age = age;
	this.idnumber = idnumber;
}
public String toString() {
	return "student [name=" + name + ", age=" + age + ", idnumber=" + idnumber + "]";
}

}
