package app;

public class SortingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,0,5,2,4,1};
		display(bubbleSort(array));
		System.out.println();

		System.out.println("bubbleSortFlipped: ");
		display(bubbleSortFlipped(array));
		System.out.println("SelectionSort: ");
		
		System.out.println();
		System.out.println(isPrime(2));
		System.out.println(isPrime(4));
		System.out.println(isPrime(3));
		System.out.println(findMinIndex(new int[] {3,7,5,2,4,1}));
		System.out.println(findMinIndex(array));
		
		SortingAlgorithm algorithm = new SortingAlgorithm();
		
		System.out.println("Selection Sort: ");
		display(algorithm.selectionSort(new int[] {2, 4, 5, 7, 3, 6, 1}));
		System.out.println("Bubble Sort Descending: ");
		display(algorithm.bubbleSortDescending(array));		
		System.out.println("Insertion Sort: ");
		display(algorithm.insertionSort(new int[] {2, 4, 5, 7, 3, 6, 1}));
		System.out.println("Merge: ");
		int[] a = new int[] {1, 3, 5, 7};
		int[] b = new int[] {2, 6, 8, 10, 11};
		display(algorithm.merge(a, b));
		
		
		int[] array2 = new int[] {1, 4, 7, 8, 1, 4, 5, 2, 3, 6, 1, 10};
		
		int left = 4;
		int middle = 7;
		int right = 10;
		int[] c = algorithm.merge(array2, left, middle, right);
//		c should be: {1, 4, 7, 8, 1, 2, 3, 4, 5, 6, 1, 10}
		System.out.println("Actual c is: ");
		display(c);
		array = new int[] {3, 5, 2, 6, 20, 33, 14, 1, 5, 9};
		System.out.println("MergeSort of array2 is: ");
		display(algorithm.mergeSort(array, 2, 7));
		System.out.println("MergeSortDeviation: ");
		SortingDeviation msd = new SortingDeviation();
		array = new int[] {3, 55, 2, 600, 20, 33, 14, 1, 5, 9};

		display(msd.mergeInsertionSort(array));
		array = new int[] {3, 55, 2, 600, 20, 33, 14, 1, 5, 9};
		display(msd.recursiveSelection(0, array));
	}

	
	
	
	static int[] clone(int[] ar) {
		int[] b = new int[ar.length];
		for(int i = 0; i < ar.length; i++) {
			b[i] = ar[i];
		}
		return b;
	}
	public static int[] bubbleSortFlipped(int[] arr) {
		int[] ar = clone(arr);
		for(int i = 0; i < ar.length-1; i++) {
			for(int j = ar.length-1; j > i; j--) {
				if (ar[j] < ar[j-1]) {
					int temp = ar[j-1];
					ar[j-1] = ar[j];
					ar[j] = temp;
				}
			}
		}
		return ar;
	}
	
	public static boolean isPrime(int x) {
		if(x % 2 == 0) {
			if (x == 2) 
				 return true;
			else 
				return  false;
		}
		for(int factor = 3; factor < x / 2; factor +=2) {
			if(x % factor == 0) {
				return false;
			}
		}
		return true;
	
	}
	
	public static int findMinIndex(int[] array) {
		int minIndex = 0;
		for (int index = 1; index < array.length; index++) {
			if(array[minIndex] > array[index]) {
				minIndex = index;
			}
		}
		return minIndex;
	}
	
	

	
	public static void display(int[] ar) {
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}
		System.out.println();
	}
	
	public static void display(int x) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int[] bubbleSort(int[] arr) {
		int[] ar = clone(arr);
		for(int i = ar.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if (ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		return ar;
	}
}
