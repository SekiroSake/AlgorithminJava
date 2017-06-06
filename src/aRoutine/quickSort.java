package aRoutine;

import java.util.Arrays;

public class quickSort {
	public void quickSort(int[] array) {
		if (array == null) {
			return;
		}
//////////S////////////
		quickSort(array, 0, array.length - 1);
//////////E////////////
	}

	public void quickSort(int[] array, int left, int right) {
//////////S////////////
		if(left >= right){
			return;
		}
//////////E////////////
		int pivot = partition(array, left, right);
		quickSort(array, left, pivot - 1);
		quickSort(array, pivot + 1, right);
	}

	private int partition(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		int pivotIndex = randomPivot(left, right);
		int leftIndex = left;
		///////////////////
		int pivotIndexVal = array[pivotIndex];
		///////////////////
		swap(array, pivotIndex, right);
		int rightIndex = right - 1;
		while (leftIndex <= rightIndex) {
			if (array[leftIndex] < pivotIndexVal) {
				leftIndex++;
			} else if (array[rightIndex] >= pivotIndexVal) {
				rightIndex--;
			} else {
				swap(array, leftIndex++, rightIndex--);
			}
		}

		swap(array, leftIndex, right);
		return leftIndex;
	}

	private void swap(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

	private int randomPivot(int left, int right) {
		// TODO Auto-generated method stub
		return left + (int) (Math.random() * (right - left + 1));
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
