package day42_interface;

public class TeslaSemi extends  ElectricTruck {
public TeslaSemi(String model, double price, String color) {
		super(model, price, color);
		this.engineSize=engineSize;
}

private double engineSize;

@Override
public void load(String item) {
System.out.println("tesla - load"+item+"by ");	
}

@Override
public void start() {
	// TODO Auto-generated method stub
	
}

@Override
public void charge() {
	// TODO Auto-generated method stub
	
}

@Override
public void drive() {
	// TODO Auto-generated method stub
	
}

}
