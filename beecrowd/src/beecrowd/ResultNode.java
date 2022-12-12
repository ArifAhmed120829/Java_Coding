package beecrowd;
class Noode{
	int data;
	Noode next;
	Noode(){
		
	}
	Noode(int value){
		this.data = value;
	}
	Noode(int d, Noode n){
		this.data = d;
		this.next = n;
	}
	
}

public class ResultNode {

	public static void main(String[] args) {
		Noode node1 = new Noode();
		System.out.println(node1);

	}

}
