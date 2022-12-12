package beecrowd;



public class countNodes{
	class node{
		int data;
		node next;
		public node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public node head = null;
	public node tail = null;
	
	public void addnode(int data) {
		node newNode = new node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else  {
			tail.next  = newNode;
			tail = newNode;
			
			
			
		}
	}
	public int countnodes(){	
		int count = 0;
		node current  = head;
		while(current!=null) {
			count++;
			current = current.next;
		}
		return count;
		
	}
	public void display() {
		node  current = head;
		if(current==null) {
			System.out.println("List is Emprty");
			return;
		}
		System.out.println("Nodes of singly linked lsit");
		while(current!= null) {
			System.out.println(current.data +  "");
			current = current.next;
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		countNodes slist = new countNodes();
		slist.addnode(1);
		slist.addnode(2);
		slist.addnode(3);
		slist.addnode(4);
		  slist.display();    
          
	        //Counts the nodes present in the given list    
	        System.out.println("Count of nodes present in the list: " + slist.countnodes());    

	}

}

