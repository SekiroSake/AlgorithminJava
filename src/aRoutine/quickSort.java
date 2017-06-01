package aRoutine;

import java.util.Arrays;

public class quickSort {
	public void quickSort(int[] array) {
		if (array == null) {
			return;
		}
		quickSort(array, 0, array.length - 1);
	}

	public void quickSort(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		// define a pivot and use it to partition the array and return the
		// updated pivot position.
		int pivot = partition(array, left, right);
		quickSort(array, left, pivot - 1);
		quickSort(array, pivot + 1, right);

	}

	private int partition(int[] array, int left, int right) {
		int pivotIndex = pivotIndex(left, right);
		int pivot = array[pivotIndex];
		// swap the pivot element to the rightmost position first
		swap(array, pivotIndex, right);
		int leftBound = left;
		int rightBound = right - 1;
		while (leftBound <= rightBound) {
			if (array[leftBound] < pivot) {
				leftBound++;
			} else if (array[rightBound] >= pivot) {
				rightBound--;
			} else {
				swap(array, leftBound++, rightBound);
			}
		}
		// swap back the pivot element.
		swap(array, leftBound, right);
		return leftBound;
	}

	private int pivotIndex(int left, int right) {
		// TODO Auto-generated method stub
		// pick random element as pivot each time
		return left + (int) (Math.random() * (right - left + 1));
	}

	private void swap(int[] array, int pivotIndex, int right) {
		// TODO Auto-generated method stub
		int temp = array[right];
		array[right] = array[pivotIndex];
		array[pivotIndex] = temp;
	}

	public static void main(String[] args) {
		quickSort solution = new quickSort();

		int[] array = null;
		solution.quickSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[0];
		solution.quickSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 1, 2, 3, 4 };
		solution.quickSort(array);
		System.out.println(Arrays.toString(array));

		array = new int[] { 4, 3, 2, 1, 9, 89, 12, 13, 123, 12, 12, 1241, 12, 546, 54, 657, 123 };
		solution.quickSort(array);
		System.out.println(Arrays.toString(array));
	}
}
