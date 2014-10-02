
public class DoubleLinkedList {
	
	private Node first;
	private Node last;
	private int size;
	private int maxSize;
	
	DoubleLinkedList(int maxSize) {
		this.maxSize = maxSize;
	}
	
	public void insertElem(Integer elem) throws QueueFullException {
		if(this.maxSize <= this.size) {
			throw new QueueFullException();
		}
		Node node = new Node();
		node.setValue(elem);
		node.setNext(first);
		if(this.first != null) this.first.setPrev(node);
		if(this.first == null) this.last = node;
		this.first = node;
		this.size++;
	}
	
	public int removeElem() throws QueueEmptyException {
        if(this.last == null){
        	throw new QueueEmptyException();
        }
        Integer element = this.last.getValue();
        
        Node temp = this.last.getPrev();
        if(temp != null) temp.setNext(null);
        if(temp == null) this.first = null;
        this.last = temp;
        this.size--;
        
        return element;
	}
}
