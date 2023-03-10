
public class aray {

	public static void main(String[] args) {
		int[] arr = new int[6];
		int i = 0;
		int j = 2;
		int len = arr.length;
		input(arr,i,j,len);
		for(int val:arr) {
			System.out.println(val);
		}

	}

	private static void input(int[] arr, int i, int j,int len) {
		if(len<=0) {
			return;
		}
		arr[i] = j;
		len--;
		input(arr,i+1,j+2,len);
		
	}

}
