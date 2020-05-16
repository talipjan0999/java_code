package day34_constructors_passingobject_method;

public class light {
int noOfwastts;
boolean indicator;
String location;
public light() {
	this(0,false);
	System.out.println("returning from no-argument constructor no.1");
}
public light(int watt,boolean ind) {
	this(watt,ind,"X");
	System.out.println("returning from no-argument constructor no.2");
}
public light(int noOfwastts, boolean indicator, String location) {
	
	this.noOfwastts = noOfwastts;
	this.indicator = indicator;
	this.location = "Gdansk";
	System.out.println("returning from no-argument constructor no.3");

}

}
