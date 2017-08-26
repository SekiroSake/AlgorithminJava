import java.util.Arrays;

/*
 * Count the seconds of writing a quickSort
 */
public class QuickSort {
	public void QuickSort(int[] array){
		if(array == null || array.length <= 1){
			return;
		}
		QuickSort(array,0,array.length - 1);
	}

	private void QuickSort(int[] array, int left, int right) {
		if(left >= right){
			return;
		}
		int pivotPosAfterSort = sortArray(array,left,right);
		//Dont move pivot
		QuickSort(array,left,pivotPosAfterSort - 1);
		QuickSort(array,pivotPosAfterSort + 1,right);
	}

	private int sortArray(int[] array, int left, int right) {
		int randomPivotPos = randomPivot(left,right);
		int endPos = right;
		int pivot = array[randomPivotPos];
		swap(array,randomPivotPos,right);
		//right start position left shift an space for pivot
		right--;
		//make sure left position shift over right(left == right, then left++)
		while(left <= right){
			//beacause the array is dynamically sorting, pivot has to be a fix value(rather than array[pivotPos], the value at that pos is changing)
			if(array[left] < pivot){
				left++;
			}else if(array[right] >= pivot){
				right--;
			}else{
				swap(array,left++,right--);
			}
		}
		//endpos is the arrayend,which is the pivot, the 'right' is the last position of right pointer
		//swap left pointer with pivot (rather than right) is because the break point is when left > right and array[left] > array[pivot]
		swap(array,left,endPos);
		return left;
	}

	//Math.random() returns a number from zero to one.
	private int randomPivot(int left, int right){
		return left + (int)(Math.random()*(right - left + 1));
	}
	
	private void swap(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		int temp = array[right];
		array[right] = array[left];
		array[left] = temp;
	}
}
