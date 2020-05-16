package day39_inertance_part2;

public class Vehicle {
private String name;
private String size;
private int currentVelocity;
private int currentdirection;



public Vehicle() {
	this("murat","hcer");
}
public Vehicle(String murat ,String size) {
	
	this.size=size;
	this.name=name;
	this.currentdirection=0;
	this.currentVelocity=0;
}
public Vehicle(String name, String size, int currentVelocity, int currentdirection) {
	this();
	this.name = name;
	this.size = size;
	this.currentVelocity = currentVelocity;
	this.currentdirection = currentdirection;
}
public void steer(int direction) {
	this.currentdirection+=direction;
	System.out.println("vehicle.steer():steering at"+currentdirection+"degrees.");
}
public void stop() {
	this.currentVelocity = 0;
}
public void move(int velocity,int direction) {
	this.currentdirection=direction;
	this.currentVelocity=velocity;
	System.out.println("vehicle.move():moving at"+currentVelocity+"");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public int getCurrentVelocity() {
	return currentVelocity;
}
public void setCurrentVelocity(int currentVelocity) {
	this.currentVelocity = currentVelocity;
}
public int getCurrentdirection() {
	return currentdirection;
}
public void setCurrentdirection(int currentdirection) {
	this.currentdirection = currentdirection;
}

	
	
}
