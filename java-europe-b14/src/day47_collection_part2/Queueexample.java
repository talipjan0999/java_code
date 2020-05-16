package day47_collection_part2;

import java.util.LinkedList;
import java.util.Queue;

public class Queueexample {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<>();
		queue.add("mike");
		queue.add("jamal");
		queue.add("mike1");
		queue.add("mike2");
		
		System.out.println(queue.toString());
		
		
		String name=queue.remove();
		System.out.println(name);

		System.out.println(queue.toString());

		
		//removing an elment from Queue using poll()
		//the poll() method is similar to remove() except that it retunrs null
		//if the queue is empty
       name =queue.poll();
		System.out.println(name);
		System.out.println(queue.toString());

		//get the elment at the front of the queue without removing it using peak()
		name=queue.peek();
		System.out.println(name);
		System.out.println(queue.toString());

	}

}
