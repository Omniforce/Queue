
public class Queue {
	
	private DoubleLinkedList list;
	
	// Creates a queue with a max size
	Queue(int size) {
		this.list = new DoubleLinkedList(size);
	}
	
	// Add an element to the queue unless full
	public void enqueue(int i) throws QueueFullException {
		list.insertElem(i);
	}
	
	// Removes and return the next element in the queue
	public int dequeue() throws QueueEmptyException {
		return list.removeElem();
	}
	
	public String toString() {
		return list.toString();
	}
	
}
