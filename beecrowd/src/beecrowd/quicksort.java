package beecrowd;

import java.util.Random;

public class quicksort {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[10];
		for(int i = 0; i<numbers.length; i++) {
			numbers[i] = random.nextInt(10);
		}
		System.out.println("Before: ");
		printArray(numbers);
		quicksort(numbers, 0, numbers.length-1);
		System.out.println("After: ");
		printArray(numbers);

	}

	private static void quicksort(int[] numbers, int i, int j) {
		if(i >= j) {
			return;
		}
		int pivot = numbers[j];
		int leftPointer = i;
		int rightPointer = j;
		while(leftPointer < rightPointer) {
			while(numbers[leftPointer] <= pivot && leftPointer <rightPointer ) {
				leftPointer++;
			}
			while(numbers[rightPointer]>= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			swap(numbers, leftPointer, rightPointer);//lp = 1, rp = 9 lp = = 2; rp = 8
		}
		swap(numbers,leftPointer, j);
		quicksort(numbers,i, leftPointer-1);
		quicksort(numbers, leftPointer+1, j);
		
		
	}
	private static void swap(int array[],int index1, int index2){
		//first parameter = contains elements that want to swap
		int temp = array[index1];//9
		array[index1] = array[index2];//8
		array[index2] = temp;//9
	}

	private static void printArray(int[] numbers) {
		// TODO Auto-generated method stub
		for(int  i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}

}
