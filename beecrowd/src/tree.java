
public class tree {
	static class Node{
		Node left;
		Node right;
		int value;
		Node(int value){
			this.value = value;
			left = null;
			right = null;
		}
	}
	static class Binarytree{
		Node root;
		Node head;
		Node recurse(int val,Node curr) {
			if(head == null & curr!=null ) {
				head = curr;
			}
			if(curr==null) {
				return new Node(val);
			}
			else if(val<curr.value) {
				curr.left = recurse(val,curr.left);
			}
			else if(val>curr.value) {
				curr.right = recurse(val,curr.right);
			}
			else {
				return curr;
			}
			return curr;
		}
		void add(int value) {
			root = recurse(value,root);
		}
	}

	public static void main(String[] args) {
		Binarytree bt = new Binarytree();
		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);
		
		
		show(bt.head);
		System.out.println(bt.head.left.right.value);
		System.out.println(bt.head.right.left.value);
		

	}

	private static void show(Node root) {
		
		while(root != null) {
			root = root.right;
			if(root!=null)System.out.println(root.value);
			
		
		}
	}

}
