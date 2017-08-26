package BinarySearch;

import java.lang.reflect.Array;

/*
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * Find the minimum element.
 * 
 * Given [4, 5, 6, 7, 0, 1, 2] return 0
 * 
 */
public class FindMinimuminRotatedSortedArray {
	/**
	 * @param nums:
	 *            a rotated sorted array
	 * @return: the minimum number in the array
	 */
	public int findMin(int[] nums) {
		// write your code here
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int left = 0;
		int right = nums.length - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (mid == 0 || mid == nums.length - 1) {
				return 0;
			}
			if (nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) {
				return mid;
			}

			if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
				right = mid - 1;
			}

			if (nums[mid] < nums[mid - 1] && nums[mid] > nums[mid + 1]) {
				left = mid + 1;
			}
		}

		return nums[left] < nums[right] ? left : right;
	}
}
