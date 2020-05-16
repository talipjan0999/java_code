package day34_constructors_passingobject_method;

public class Floor {
	
	double length,width;

	public Floor(double length, double width) { //double length = 5;
		
		if(width<0) {
			this.width = 0;
		}else {
			this.width = width;
		}
		
		if(length<0) {
			this.length = 0;
		}else {
			this.length = length;
		}
	
	}
	
	public double getArea() {
		return width * length;
	}
}