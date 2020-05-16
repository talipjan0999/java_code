package day34_constructors_passingobject_method;

public class Calculator {
	Floor floor;
	Carpet carpet;
	
	
	public Calculator(Floor floor, Carpet carpet) { // Floor floor = new floor()
		this.floor = floor;
		this.carpet = carpet;
	}
	
	
	public double getTotalCost() {
		
		return floor.getArea() * carpet.getcost();
	}
	
	
	

}