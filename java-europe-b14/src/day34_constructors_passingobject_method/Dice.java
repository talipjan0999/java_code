package day34_constructors_passingobject_method;

import java.util.Random;

public class Dice {
int sides;
int value;
public Dice(int numsides) {
sides=numsides;
roll();
}
public void roll() {
	Random rand=new Random();
	value =rand.nextInt(sides)+1;
}
public int getsides() {
	return value;
}
    public int getValue() {
        return value;
    }
}
