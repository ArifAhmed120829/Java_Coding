package beecrowd;

class Node{
	int data;
	Node pointer;
}
class linked{
	public static int sum = 0;
	
	public Node insert(int num, Node n) {
		if(n == null) {
			return createNode(num);
		}
		else {
			n.pointer = insert(num,n.pointer);
		}
		return n;
	}

	public Node createNode(int num) {
		Node node = new Node();
		node.data = num;
		node.pointer = null;
		return node;
	}
	public void show(Node j) {
		if(j == null) {
			return;
		}
		System.out.print(j.data+" ");
		sum = sum +j.data;
		show(j.pointer);
	}
	
}

public class MakeANode {
	
	public static void main(String[] args) {
		Node head = null;
		linked a  = new linked();
		head = a.insert(10,head);
		head = a.insert(20,head);
		head = a.insert(30,head);
		head = a.insert(40,head);
		head = a.insert(50,head);
		head = a.insert(60, head);
		a.show(head);
		
		System.out.println(linked.sum);
		

	}

}
