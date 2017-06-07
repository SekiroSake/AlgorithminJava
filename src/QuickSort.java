import java.util.Arrays;

/*
 * Count the seconds of writing a quickSort
 */
public class QuickSort {
	public void quickSort(int[] array){
		if(array == null || array.length <= 1){
			return;
		}
		quickSort(array,0,array.length - 1);
	}
	
	private void quickSort(int[] array, int left, int right){
		if(left >= right){
			return;
		}
		int pivotIndex = partition(array, left, right);
		quickSort(array, left, pivotIndex - 1);
		quickSort(array, pivotIndex + 1,right);
	}
	
	private int partition(int[] array, int left, int right){
		int randomPivotIndex = randomPivot(left,right);
		int randomPivotVal = array[randomPivotIndex];
		int leftBound = left;
		swap(array,randomPivotIndex,right);
		int rightBound = right - 1;
		while(leftBound <= rightBound){
			if(array[leftBound] < randomPivotVal){
				leftBound++;
			}else if(array[rightBound] >= randomPivotVal){
				rightBound--;
			}else{
				swap(array,leftBound++,rightBound--);
			}
		}
		swap(array,leftBound,right);
		return leftBound;
	}
	
	private int randomPivot(int left, int right){
		return left + (int)(Math.random()*(right - left + 1));
	}
	
	private void swap(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		int temp = array[right];
		array[right] = array[left];
		array[left] = temp;
	}



	public static void main(String[] args) {
		QuickSort solution = new QuickSort();
		int[] array = null;
		solution.quickSort(array);
		System.out.println(Arrays.toString(array));
		array = new int[0];
		solution.quickSort(array);
		System.out.println(Arrays.toString(array));
		array = new int[] { 1 };
		solution.quickSort(array);
		System.out.println(Arrays.toString(array));
		array = new int[] { 4, 3};
		solution.quickSort(array);
		System.out.println(Arrays.toString(array));
		array = new int[] { 2, 5, 3, 1, 4 ,123,42,454,12435435,343,21,65,1,2,5436352,4};
		solution.quickSort(array);
		System.out.println(Arrays.toString(array));
	}
}
