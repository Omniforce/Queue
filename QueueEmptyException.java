
public class QueueEmptyException extends Exception {

	public QueueEmptyException() {
		super("Cannot remove an element");
	}
	
}
