package BinarySearch;

/*
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.
 */
/*
 * Example
For [4, 5, 1, 2, 3] and target=1, return 2.

For [4, 5, 1, 2, 3] and target=0, return -1.
 */
public class SearchinRotatedSortedArray {
	public int search(int[] A, int target) {
		// write your code here
		if (A == null || A.length == 0) {
			return -1;
		}
		int left = 0;
		int right = A.length - 1;
		// Starting point of the rorate, left one is the gap
		int breakPivot = findBreak(A);
		if(breakPivot == 0){
			return binarySearch(A,target,left,right);
		}else if(target > A[right]){
			return binarySearch(A,target,left,breakPivot - 1);
		}else{
			return binarySearch(A,target,breakPivot,right);
		}
	}

	private int binarySearch(int[] A, int target, int left, int right) {
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (A[mid] == target) {
				return mid;
			} else if (A[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	private int findBreak(int[] A) {
		int left = 0;
		int right = A.length - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (A[mid - 1] > A[mid]) {
				return mid;
			} else if(A[mid] > A[left]){
				left = mid;
			}else{
				right = mid;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		SearchinRotatedSortedArray sol = new SearchinRotatedSortedArray();
		int[] array = {6,8,9,1,3,5 };
		int target = 5;
		System.out.println(sol.search(array, target));
	}
}
