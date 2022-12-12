package beecrowd;
class noder{
	int data;
	noder next;
	noder(){
		
	}
	noder(int data1){
		this.data = data1;
		
	}
	noder(int data2, noder next2){
		this.data = data2;
		this.next = next2;
		
	}
	/*
	public void setdata(int data3) {
		this.data = data3;
	}
	*/
	public int  getdata() {
		return data;
	}
	public noder getnext() {
		return this.next;
	}
	
}

public class holyshit {

	public static void main(String[] args) {
		noder ob1 = new noder(1,null);
		//ob1.setdata(10);
		System.out.println(ob1.getdata());
		System.out.println(ob1.getnext());
		noder ob2 = new noder(10,ob1);
		//ob1.setdata(10);
		System.out.println(ob2.getdata());
		System.out.println(ob2.getnext().getdata());
		
		

	}

}
