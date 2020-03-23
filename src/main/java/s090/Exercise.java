package s090;

public class Exercise {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.push(32);
		//System.out.println(stack);

	}
	
}
	
class MyStack {
		private Node top;
		
		public void push(int value) {
			Node node = new Node();
			node.setNext(top);
			this.top.setValue(value);
		}

		public int pop() {
			if(top == null) {
				throw new IllegalCallerException("Cannot pop an empty list");
			}
			
			int popped = top.getValue();
			this.top = top.getNext();
			
			return popped;
		}
	
	
}

class Node {
	private int value; 							// il nodo ha il valore del nodo in se.
	private Node next; 							// + la reference al Nodo successivo.

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

//private int tail; 
//
//public int getTail() {
//	return this.tail;
//}
//
//public void setTail(int tail) {
//	this.tail = tail;
//}


