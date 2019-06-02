package app;

public class SortingAlgorithm {
	
	public int[] insertionSort(int[] ar) {
		int[] array = clone(ar);
		int index = 0;
		
		while(index < array.length-1) {
			while(index+1 < array.length  && array[index] <= array[index+1]) {
				index++;
			}
			if(index+1 == array.length) {
				return array;
			}
			int key = array[index+1];
			int i = index;
			while(i >= 0 && array[i] > key ) {
				array[i+1] = array[i];
				i--;
//				System.out.println("key= "+ key);
//				display(array);
			}
			array[i+1] = key;
			display(array);
		}
		return array;
	}
	
	public int[] selectionSort(int[] ar) {
		int[] array = clone(ar);
		for(int i = 0; i < array.length-1; i++) {
//			Find minIndex
			int minIndex = i;
			for(int j = i+1; j < array.length; j++) {
				if(array[minIndex] > array[j])
					minIndex = j;
			}
//			Swap
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
			display(array);
		}
		return array;
	}
	
	public int[] bubbleSortDescending(int[] arr) {
		int[] ar = clone(arr);
		for(int i = ar.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if (ar[j] < ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		return ar;
	}
	
	
	public int[] mergeSort(int[] ar) {
		
		return mergeSort(ar, 0, ar.length);
	}
	
	public int[] mergeSort(int[] ar, int left, int right) {
		if(right - left <= 1) {
			return ar;
		}
		
		int middle = (left+right)/2;
		mergeSort(ar, left, middle);
		mergeSort(ar, middle, right);
		merge(ar, left, middle, right);
		
		return ar;
	}
	
	
	public int[] merge(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < a.length && j < b.length) {
			if(a[i] < b[j]) {
				result[k] = a[i];
				i++;
			}
			else {
				result[k] = b[j];
				j++;
			}
			k++;
		}
		
		while (i < a.length) {
			result[k] = a[i];
			k++;
			i++;
		}
		
		while (j < b.length) {
			result[k] = b[j];
			k++;
			j++;
		}
		
		return result;
	}
	
	public int[] merge(int[] array, int left, int middle, int right) {
		int[] a = clone(array, left, middle);
		int[] b = clone(array, middle, right);
		
		int[] c = merge(a, b);
		
		for(int i = 0; i<c.length; i++) {
			array[left+i] = c[i];
		}
		
		return array;
	}
	
	private int[] clone(int[] original) {
		int[] destination = new int[original.length];
		for(int i = 0; i < original.length; i++) {
			destination[i] = original[i];
		}
		return destination;
	}
	
	public int[] clone(int[] original, int from, int to) {
		int[] destination = new int[to-from];
		for(int i = 0; i < destination.length; i++) {
			destination[i] = original[from + i];
		}
		return destination;
	}
	
	
	public void display(int[] ar) {
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}
		System.out.println();
	}
}
