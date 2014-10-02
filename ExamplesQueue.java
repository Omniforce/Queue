
class ExamplesQueue {
	public static void main(String [] args) {
		Queue queue = new Queue(3);

		try {
			queue.enqueue(1);
			queue.enqueue(2);
			queue.enqueue(3);
			queue.enqueue(4);
		}
		catch (Exception e) {
			System.out.println("Expected: \"QueueFullException: Cannot add any more elements.\", Actual: " + e.toString());
		}
		try {
			System.out.println("Expected: \"1\", Actual: " + queue.dequeue());
			System.out.println("Expected: \"2\", Actual: " + queue.dequeue());
			System.out.println("Expected: \"3\", Actual: " + queue.dequeue());
			queue.dequeue();
		}
		catch (Exception e) {
			System.out.println("Expected: \"QueueEmptyException: Cannot remove an element.\", Actual: " + e.toString());
		}

	}
}
