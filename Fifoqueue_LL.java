package StackLL;
 		
		class Node {
		    int data;
		    Node next;

		    public Node(int data) {
		        this.data = data;
		        this.next = null;
		    }
		}

		public class Fifoqueue_LL {
		    private Node front; 
		    private Node rear;  
		    public Fifoqueue_LL() {
		        front = null;
		        rear = null;
		    }
		 public boolean isEmpty() {
		        return front == null;
		    }

		    
		    public void enqueue(int data) {
		        Node newNode = new Node(data);
		        if (rear == null) {
		            front = newNode;
		            rear = newNode;
		        } else {
		            rear.next = newNode;
		            rear = newNode;
		        }
		    }

		    // Removes elements from the queue
		    public int dequeue() {
		        if (isEmpty()) {
		            throw new IllegalStateException("Queue is empty");
		        }
		        int data = front.data;
		        front = front.next;
		        if (front == null) {
		            rear = null;
		        }
		        return data;
		    }

		    
		    public int peek() {
		        if (isEmpty()) {
		            throw new IllegalStateException("Queue is empty");
		        }
		        return front.data;
		    }

		  
		    public void display() {
		        if (isEmpty()) {
		            System.out.println("Queue is empty");
		            return;
		        }
		        Node current = front;
		        while (current != null) {
		            System.out.print(current.data + " ");
		            current = current.next;
		        }
		        System.out.println();
		    }

		    public static void main(String[] args) {
		    	Fifoqueue_LL queue = new Fifoqueue_LL();
		        queue.enqueue(50);
		        queue.enqueue(60);
		        queue.enqueue(70);
		        queue.enqueue(80);

		        queue.display(); 

		        queue.dequeue();
		        queue.dequeue();

		        queue.display();
		    }
		


}
