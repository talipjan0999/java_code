package day33_class_object_constructer;

public class car {
	String model;
	String make;
	int year;
	double mile;
	String color;
	
	//create constrcutor
	

	
	public car(String model, String make, int year, double mile, String color) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}

	public car() {
		
		model = "Honda";
		make = "Civic";
		year = 2020;
		mile = 5000;
		color = "red";
		
	}
	
	/*
	public Car(String mo,String ma,int yr,double ml,String cl) {
		model = mo;
		make = ma;
		year = yr;
		mile = ml;
		color = cl;
	}
	*/
	



}