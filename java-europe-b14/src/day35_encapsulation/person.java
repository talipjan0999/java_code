package day35_encapsulation;

public class person {
	//instance variables
private String name;
private int age;
private char gender;
public String getName() {
	return name;
}
public person(String name,int age,char gender) {
	this.name = name;
	this.age=age;
	this.gender=gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}

}
