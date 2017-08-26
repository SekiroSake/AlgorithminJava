package BinarySearch;

/*
 * Given a target number and an integer array A sorted in ascending order, 
 * find the index i in A such that A[i] is closest to the given target.
 * Return -1 if there is no element in the array.
 * **************************************************
 * Given [1, 2, 3] and target = 2, return 1.
 * Given [1, 4, 6] and target = 3, return 1.
 * Given [1, 4, 6] and target = 5, return 1 or 2.
 * Given [1, 3, 3, 4] and target = 2, return 0 or 1 or 2.
 */
public class ClosestNumberinSortedArray {
	public int closestNumber(int[] A, int target) {
		// Write your code here
		if (A == null || A.length == 0) {
			return -1;
		}
		int mid = 0;
		int left = 0;
		int right = A.length - 1;
		if (target < A[left]) {
			return left;
		}
		if (target > A[right]) {
			return right;
		}
		while (left < right - 1) {
			mid = left + (right - left) / 2;
			if (target == A[mid]) {
				return mid;
			} else if (target > A[mid]) {
				left = mid;
			} else {
				right = mid;
			}

		}
		// if binary search didnt find the target, at least get the closest here
		return Math.abs(A[left] - target) <= Math.abs(A[right] - target) ? left : right;
	}
}
