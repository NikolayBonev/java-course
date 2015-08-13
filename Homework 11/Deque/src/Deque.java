public class Deque<E>{
	private class Node<E> {
		public Node<E> left, right;
	    private E item;

	    public Node(E item) {
	      if (item == null) { 
	    	  throw new NullPointerException();
	      }
	      
	      this.item = item;
	      this.right = null;
	    }
	    
	    public Node(E item, Node<E> prevElem) {
		      if (item == null) { 
		    	  throw new NullPointerException();
		      }
		      
		      this.item = item;
		      prevElem.right = this;
		      this.right = null;
		}
	    
	    public Node(Node<E> nextElem, E item) {
		      if (item == null) { 
		    	  throw new NullPointerException();
		      }
		      
		      this.item = item;
		      this.right = nextElem;
		}
	}
	
	 private Node head;
	 private Node tail;
	 private int count;
	 
	 public Deque() {
		 this.head = null;
		 this.tail = null;
		 this.count = 0;
	 }
	 
	 public void addFirst(E item) {
		 if (head == null) {
			 head = new Node(item);
		     tail = head;
		 } else {
			 Node newNode = new Node(head, item);	
			 head = newNode;
		 }
		 count++;
	 }
	 
	 public void addLast(E item) {
		 if (head == null) {
			 head = new Node(item);
		     tail = head;
		 } else {
			 Node newNode = new Node(item, tail);
		     tail = newNode;
		 }
		 count++;
	 }
	 
	 public E remove(int index) {
		 
		 if (index>=count || index<0) {
			 throw new IndexOutOfBoundsException("Invalid index: " + index);
		 }
		 
		 int currentIndex = 0;
		 Node currentNode = head;
		 Node prevNode = null;
		 
		 while (currentIndex < index) {
			 prevNode = currentNode;
		     currentNode = currentNode.right;
		     currentIndex++;
		 }
		 
		 count--;
		 if (count==0) {
			 
			 head = null;
		     tail = null;
		     
		 } else if (prevNode == null) {
			 
			 head = currentNode.right;
			 
		 } else {
			 prevNode.right = currentNode.right;
		 }
		 return (E) currentNode.item;
	 }
	 
	 public int indexOf(E item) {
		 int index = 0;
		 Node current = head;
		 
		 while (current != null) {
			 if ((current.item != null && current.item.equals(item)) || (current.item == null) && (item == null)) {
				 return index;
		     }
			 
			 current = current.right;
		     index++;   
		 }
		 
		 return -1;
	 }
	 
	 public boolean contains(E item) {
		 int index = indexOf(item);
		 boolean found = (index != -1);
		 
		 return found;      
	 }
	 
	 public E elementAt(int index) {
		 if (index>=count || index<0) {
			 throw new IndexOutOfBoundsException("Invalid index: " + index);
		 }
		 
		 Node currentNode = this.head;
		    
		 for (int i = 0; i < index; i++) {
			 currentNode = currentNode.right;
		 }
		 
		 return (E) currentNode.item;
	 }
	 
	 public int getLength() {
		 return count;
	 }
}
