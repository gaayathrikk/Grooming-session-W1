package Thread;

import java.util.concurrent.*;

public class Blockingqueue {

	public static void main(String[] args)
		throws InterruptedException
	{
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(5);

		queue.put("array");
		queue.put("list");
		queue.put("queue");
		queue.put("stack");
		queue.put("Avengers");

		System.out.println("queue contains " + queue);

		queue.remove();
		queue.remove();

		queue.put("Hashmap");


		System.out.println("queue contains " + queue);
	}
}

