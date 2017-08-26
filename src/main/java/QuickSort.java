import java.util.Arrays;

/*
 * Count the seconds of writing a quickSort
 */
public class QuickSort {
	public void QuickSort(int[] array){
		if(array == null || array.length <= 1){
			return;
		}
		quickSort(array, 0, array.length - 1);
	}

	private void quickSort(int[] array, int left, int right){
		if(left >= right){
			return;
		}
		int pivotPos = sortArray(array, left, right);
		quickSort(array, left, pivotPos);
		quickSort(array, pivotPos + 1, right);
	}

	private int sortArray(int[] array, int left, int right){
		int randomPivot = getRandomPivot(left, right);
		int pivot = array[randomPivot];
		int leftBound = left;
		swap(array,right,randomPivot);
		int rightBound = right - 1;
		while(leftBound <= rightBound){
			if(array[leftBound] < pivot){
				leftBound++;
			}else if(array[rightBound] >= pivot){
				rightBound--;
			}else {
				swap(array, leftBound++, rightBound--);
			}
		}
		swap(array,leftBound,right);
		return leftBound;
	}

	private int getRandomPivot(int left, int right){
		return left + (int)Math.random()*(right - left + 1);
	}
	
	private void swap(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		int temp = array[right];
		array[right] = array[left];
		array[left] = temp;
	}
}
