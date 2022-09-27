package beecrowd;

import java.util.Random;

public class quicksort {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[10];
		for(int i = 0; i<numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		System.out.println("Before: ");
		printArray(numbers);
		quicksort(numbers, 0, numbers.length-1);
		System.out.println("After: ");
		printArray(numbers);

	}

	private static void quicksort(int[] numbers, int i, int j) {
		int pivot = numbers[j];
		int leftPointer = i;
		int rightPointer = j;
		while(leftPointer < rightPointer) {
			while(numbers[leftPointer] <= pivot && leftPointer <rightPointer ) {
				leftPointer++;
			}
		}
		
	}

	private static void printArray(int[] numbers) {
		// TODO Auto-generated method stub
		
	}

}
