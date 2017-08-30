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
		int pivotIndex = sortWithRandomPivot(array, left, right);
		quickSort(array, left,pivotIndex - 1);
		quickSort(array,pivotIndex + 1,right);
	}

	private int sortWithRandomPivot(int[] array, int left, int right){
		int pivotPos = getRandomPivot(left,right);
		int leftBound = left;
		int rightBound = right - 1;
		int pivotValue = array[pivotPos];
		swap(array,right,pivotPos);
		while(leftBound <= rightBound){
			if(array[leftBound] < pivotValue){
				leftBound++;
			}else if(array[rightBound] >= pivotValue){
				rightBound--;
			}else{
				swap(array,leftBound++,rightBound--);
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
