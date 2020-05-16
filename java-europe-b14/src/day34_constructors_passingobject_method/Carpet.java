package day34_constructors_passingobject_method;

public class Carpet {
	double cost;

	public Carpet(double cost) {
		
		if(cost<0) {
			this.cost = 0;
		}else {
			this.cost = cost;
		}
		
	}
	
	public double getcost() {
		return cost;
	}

}