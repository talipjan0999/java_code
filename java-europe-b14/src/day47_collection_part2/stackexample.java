package day47_collection_part2;

import java.util.*;

public class stackexample {

	public static void main(String[] args) {
		Vector<Integer> numStack=new Stack<>();
		//creating an object ways
		//regular way class-class
		//polymorphisim
numStack.add(55);
numStack.add(59);
numStack.add(550);
numStack.add(590);
numStack.add(5530);
System.out.println(numStack.toString());

// check vale on top of stack
System.out.println(((Stack<Integer>) numStack).peek());

//read value on top of stack remove it
((Stack<Integer>) numStack).pop();

System.out.println(((Stack<Integer>) numStack).pop());
System.out.println(numStack.toString());
System.out.println(numStack.get(0));


	}

}
