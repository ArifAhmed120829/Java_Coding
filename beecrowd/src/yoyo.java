
public class yoyo {

	public static void main(String[] args) {
		int[] array = {1,4,5,2,8,9};
		mergesort(array);

	}

	private static void mergesort(int[] array) {
		int[] helper = new int[array.length];
		mergesort(array,helper,0,array.length-1);
		
	}

	private static void mergesort(int[] array, int[] helper, int low, int high) {
		if(low<high) {
			int middle = (low + high)/2;//0+5/2 = 2, 3+5/2 = 4, 
			mergesort(array,helper,low,middle);
			mergesort(array,helper,middle+1,high);
			System.out.println(middle);
		}
	}

}
