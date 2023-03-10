package CodeforcesSolving;

class Node {
	int data;
	Node next;
	Node prev;

	Node(int data) {
		this.data = data;
	}
	
}

public class Output {

	public static void main(String[] args) {
		Node n1 = new Node(7);
		Node n2 = new Node(8);
		Node n3 = new Node(9);
		n1.next = n2;
		n2.prev= n1;
		n2.next = n3;
		n3.prev = n2;
		
		System.out.println("All nodes: ");
		printListNodes(n1);
		System.out.println("After deleting one node");
		countNodes(deleteNodes(8,n1));
		
	}

	private static void printListNodes(Node head) {
		Node current = head;
		
		while(current!= null) {
			System.out.println(current.data);
			current = current.next;//n1.next,n2.next,n3.next
		
		}
	
		
	}

	private static Node deleteNodes(int data,Node head) {
		Node current  = head;
		if(current.data == data) {
			head = current.next;
		}
		else {
			while(current!= null) {
				current = current.next;
				if(current!=null) {
					if(current.data == data) {
						current = current.next;
						return current;
					}
				}
			}
		}
	
		return head;
	}

	private static void countNodes(Node head) {
		Node current = head;
		//int c = 0;
		while(current!= null) {
			System.out.println(current.data);
			current = current.next;//n1.next,n2.next,n3.next
			
		}
		
		
	}
	

}
