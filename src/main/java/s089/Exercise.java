package s089;

public class Exercise {

	public static void main(String[] args) {
		MyIntQueue miq = new MyIntQueue();

		miq.add(42);
		miq.add(43);
		miq.add(45);
		miq.add(47);
		
		System.out.println("[42, 43, 45, 47] -> " + miq.toString());

		// int value = miq.remove();

		// System.out.println("42 -> " + value);
		// System.out.println("[] -> " + miq.toString());

	}

}

// Head Tail
class MyIntQueue { // [value, next] [value, next]
	private Node head;
	private Node tail;

	public MyIntQueue() {
		this.head = null; // superfluo perchè sono inizializzate già a null.
		this.tail = null;

	}

	void add(int value) {

		Node node = new Node();
		// node.setNext(tail);
		node.setValue(value);
		if (head == null) {
			this.head = node;
			this.tail = node;

		} else {

			// metodo costoso
			// while (head.getNext() != null )
			// this.head.setNext(node);
			// } fai da te

			// metodo meno costoso

			this.tail.setNext(node);
			this.tail = node;
		}

	}

	int remove() {
		//
		if (this.head == null) {
			throw new IllegalStateException("Queue is Empty");

		}
		if (this.head == this.tail) {
			this.tail = null;
		}

		int oldNodeValue = this.head.getValue();
		this.head = this.head.getNext();

		return oldNodeValue;
	}

	@Override
	public String toString() {

		StringBuilder string = new StringBuilder("[");

		while (this.head != null) {
			string.append(this.head.getValue()); 
			this.head = this.head.getNext();
			string.append(", ");
		}
		string.append("]");
		string.delete(string.lastIndexOf(","), string.indexOf("]"));

		return string.toString(); // partire dalla head e scandire tutti gli elementi e printarli.
	}
}

class Node {
	private int value; // il nodo ha il valore del nodo in se.
	private Node next; // + la reference al Nodo successivo.

	public int getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

/*
 * 
 * [1] [23] [4]
 * 
 * add(54) --> List O(1) [1] [23] [4] [54]
 * 
 * remove() --> List O(n) --> LinkedList O(1) [23] [4] [54]
 * 
 * Linkedlist organizzata in "blocchetti"
 * 
 * head tail [1, -> 23] [23, -> 4], [4, //]
 */
