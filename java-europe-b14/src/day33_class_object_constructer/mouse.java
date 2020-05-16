package day33_class_object_constructer;

public class mouse {
	
int numteth;
int numwhiskers;
int weight;

public mouse(int weight) {
	this(20,weight);
	this.weight = weight;
	System.out.println("java");
}
public mouse(int numteth, int weight) {
	this(numteth,20,weight);
	this.numteth = numteth;
	this.weight = weight;
	System.out.println("js");
}
public mouse(int numteth, int numwhiskers, int weight) {
	
	this.numteth = numteth;
	this.numwhiskers = numwhiskers;
	this.weight = weight;
	System.out.println("c");

}
public void print() {
	System.out.println(weight+""+numteth+""+numwhiskers);
}
}
