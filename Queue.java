
public class Queue {
	
	private DoubleLinkedList list;
	
	Queue(int size) {
		this.list = new DoubleLinkedList(size);
	}
	
	public void enqueue(int i) throws QueueFullException {
		list.insertElem(i);
	}
	
	public int dequeue() throws QueueEmptyException {
		return list.removeElem();
	}
	
}
