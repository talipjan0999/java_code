package day38_inhertiance_part2;

public class Animal {
private String name;
private int brain;
private int body;
private int size;
private int weight;
public Animal(String name, int brain, int body, int size, int we) {
	
	this.name = name;
	this.brain = brain;
	this.body = body;
	this.size = size;
	this.weight = we;
}
public void eat() {
	System.out.println("Animal.eat() is called");
}
public void move(int speed) {
	System.out.println("animal.move() called.animal is moving at"+speed);

}
public String getName() {
	return name;
}

public int getBrain() {
	return brain;
}

public int getBody() {
	return body;
}

	

public int getSize() {
	return size;
}

public int getWeight() {
	return weight;
}

}
