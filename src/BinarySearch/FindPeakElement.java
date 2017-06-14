package BinarySearch;

/*
 * There is an integer array which has the following features:
 * The numbers in adjacent positions are different.
 * A[0] < A[1] && A[A.length - 2] > A[A.length - 1].
 * We define a position P is a peek if:
 * A[P] > A[P-1] && A[P] > A[P+1]
 */
/*
 * Given [1, 2, 1, 3, 4, 5, 7, 6]
 * Return index 1 (which is number 2) or 6 (which is number 7)
 */
public class FindPeakElement {
	public int findPeak(int[] A) {
		// write your code here
		if (A == null || A.length <= 2) {
			return -1;
		}
		int left = 0;
		int right = A.length - 1;
		int mid = left + (right - left) / 2;
		if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
			return mid;
		}
		int leftVal = binarySearch(A, left, mid);
		int rightVal = binarySearch(A, mid, right);
		if (leftVal != -1) {
			return leftVal;
		} else if (rightVal != -1) {
			return rightVal;
		} else {
			return -1;
		}
	}

	private int binarySearch(int[] A, int left, int right) {
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
				return mid;
			} else if (A[mid] > A[mid - 1] && A[mid] < A[mid + 1]) {
				left = mid + 1;
			} else if (A[mid] < A[mid - 1] && A[mid] > A[mid + 1]) {
				right = mid - 1;
			}
		}
		return -1;
	}
}
