
public class reversenode {
	static class Node{
		Node next;
		int data;
		Node(int data){
			this.data = data;
		}
	}
	static class LinkedList{
		Node head;
		Node tail;
		void push(int d) {
			Node newnode = new Node(d);
			if(head == null) {
				head = newnode;
				tail = newnode;
			}
			else {
				tail.next = newnode;
				tail = newnode;
			}
		}
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		int[] arr = {1,4,5,7,9};
		for(int val:arr) {
			ll.push(val);
		}
		
		showNode(reverse(ll.head));

	}

	private static Node reverse(Node head) {
		Node current = head;
		Node prev = null;
		Node next = null;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	private static void showNode(Node h) {
		Node curr = h;
		while(curr!=null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
		
	}

}
