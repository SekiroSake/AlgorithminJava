package BinarySearch;

/*
 * Given a mountain sequence of n integers which increase firstly and then decrease, find the mountain top.
 * Example
 * Given nums = [1, 2, 4, 8, 6, 3] return 8
 * Given nums = [10, 9, 8, 7], return 10
 */
public class MaximumNumberinMountainSequence {
	public int mountainSequence(int[] nums) {
		// Write your code here
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int left = 0;
		int right = nums.length - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			int midRight = mid + 1;
			if (nums[mid] < nums[midRight]) {
				left = mid;
			} else {
				right = mid;
			}
		}
		return nums[left] > nums[right] ? nums[left] : nums[right];
	}
}
/*
 * if (nums == null || nums.length == 0) { return 0; } int start = 0; int end =
 * nums.length - 1; while (start + 1 < end) { int mid = (start + end) / 2; if
 * (nums[mid] > nums[mid + 1]) { end = mid; } else { start = mid; } } return
 * Math.max(nums[start], nums[end]);
 */