
public class Node {

	private Node prev; // Used to for O(1) insertion
	private Node next;
	private int value;
	
	public Node getPrev() {
		return prev;
	}
	
	public Node getNext() {
		return next;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setPrev(Node prev) {
		this.prev = prev; 
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public void setValue(int value) {
		this.value = value; 
	}
}
