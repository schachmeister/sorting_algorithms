package app;

public class SortingDeviation {
	
	public int[] mergeInsertionSort(int[] ar) {
		int middle = ar.length / 2;
		SortingAlgorithm algorithm = new SortingAlgorithm();
		int[] insertionArray = algorithm.clone(ar, 0, middle);
		int[] selectionArray = algorithm.clone(ar, middle, ar.length);
		insertionArray = algorithm.insertionSort(insertionArray);
		selectionArray = algorithm.selectionSort(selectionArray);
		return algorithm.merge(insertionArray, selectionArray);
	}
	
	public int[] recursiveSelection(int begin, int[] array) {
		if(begin < array.length-1) {
//			find smallest
			int minIndex = begin;
			for(int index = begin + 1; index < array.length; index++) {
				if(array[index] < array[minIndex]) {
					minIndex = index;
				}
			}
//			swap 
			if (minIndex > begin) {
				int temp = array[minIndex];
				array[minIndex] = array[begin];
				array[begin] = temp;
			}


//			call function
			return recursiveSelection(begin + 1, array);
		}
		return array;
	}
	
	public static void display(int[] ar) {
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}
		System.out.println();
	}

}
