
public class TestQueue {

	public static void main(String[] args) {
		// Create a queue
		GenericQueue<String> queue = new GenericQueue<>();
		
		// Add elements to the queue
		queue.enqueue("Timmy"); // Add it to the queue
		System.out.println("(1) " + queue);
		
		queue.enqueue("Tommy"); // Add it to the queue
		System.out.println("(2) " + queue);
		
		queue.enqueue("Tom Nook"); // Add it to the queue
		queue.enqueue("Isabelle"); // Add it to the queue
		
		System.out.println("(3) " + queue);
		
		// Remove elements from the queue
		System.out.println("(4) " + queue.dequeue()); // Remove from queue
		System.out.println("(5) " + queue.dequeue()); // Remove from queue
		System.out.println("(6) " + queue);

	}

}
