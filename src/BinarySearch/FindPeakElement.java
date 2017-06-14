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
//https://siddontang.gitbooks.io/leetcode-solution/content/array/find_peak_element.html
public class FindPeakElement {
	public int findPeak(int[] A) {
		// write your code here
		int n = A.length;
		if (n == 1) {
			return 0;
		}

		int start = 0;
		int end = n - 1;
		int mid = 0;

		while (start <= end) {
			mid = start + (end - start) / 2;
			if ((mid == 0 || A[mid] >= A[mid - 1]) && (mid == n - 1 || A[mid] >= A[mid + 1])) {
				return mid;
			} else if (mid > 0 && A[mid - 1] > A[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return mid;
	}
}
