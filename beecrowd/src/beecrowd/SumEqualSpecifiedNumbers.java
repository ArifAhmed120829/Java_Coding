package beecrowd;

public class SumEqualSpecifiedNumbers {
	static void result(int array[],int inputnum) {
		System.out.println("elements & their sum: ");
		for(int i = 0; i<array.length; i++) {
			for(int j = i+1; j <array.length;j++) {
				if(array[i] + array[j] == inputnum) {
					System.out.println(array[i]+"+"+array[j]+"="+inputnum);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result(new int[] {10,0,8,5,100}, 15);
		result(new int[] {90,0,8,5,100}, 100);

	}

}
