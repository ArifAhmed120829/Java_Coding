package beecrowd;
interface callback{
	void call(int p);
}
class bird{
	public void sing() {
		System.out.println("It is bird , So it can sing");
	}
}
class Eagle extends bird{
	
}
class hell implements callback{

	@Override
	public void call(int p) {
		while(p!=0) {
			System.out.println(p);
			p--;
		}
		
	}
	
}

public class instancepls {

	public static void main(String[] args) {
		instancepls pls = new instancepls();
		Eagle eagle  = new Eagle();
		System.out.println(pls instanceof instancepls ) ;
		System.out.println(eagle instanceof bird ) ;
		hell ps = new hell();
		ps.call(10);
		

	}

}
