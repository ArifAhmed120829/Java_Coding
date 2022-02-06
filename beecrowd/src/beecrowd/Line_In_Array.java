package beecrowd;
import java.util.*;

public class Line_In_Array {
	public static void main(String[] args) {
		//HashSet<DataType> variable_name = new HashSet<>(capacity, loadFactor);
		String[] a = {"Fortnite","Apex","Valorant","COD","BF5"};;
		String[] b= {"LOLA","ABUL","Valorant","CODA","BF5"};;
		System.out.println("Arrays1: " +Arrays.toString(a));
		System.out.println("Arrays2: " +Arrays.toString(b));
		HashSet<String> set = new HashSet<String>();
		for(int i =0; i<a.length; i++) {
			for(int j = 0; j<b.length; j++) {
				if(a[i].equals(b[j])) {
					set.add(a[i]);
				}
			}
		}
		System.out.println("Common element: "+(set)); 
		
		
		
		
		
	}

}
