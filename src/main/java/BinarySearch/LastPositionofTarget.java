package BinarySearch;

/*
 * Find the last position of a target number in a sorted array. Return -1 if target does not exist.
 * ******************************************
Given [1, 2, 2, 4, 5, 5].

For target = 2, return 2.

For target = 5, return 5.

For target = 6, return -1.
 */
public class LastPositionofTarget {
	 public int lastPosition(int[] nums, int target) {
	        // Write your code here
	        if (nums == null || nums.length == 0){
	            return -1;
	        }
	        int left = 0;
	        int right = nums.length - 1;
	        int retval = -1;
	        if (target < left || target > right){
	            return -1;
	        }
	        if(nums[right] == target){
	            return right;
	        }
	        while(left < right - 1) {
	            int mid = left + (right - left) / 2;
	            if (target == nums[mid]){
	                // Trick: Even found the answer, continue searching!
	                // retval = mid;
	                // break;
	                left = mid;
	            }else if (target > nums[mid]){
	                left = mid;
	            }else{
	                right = mid;
	            }
	        }
	        // if(retval != -1){
	        //     return findHelper(nums, target, retval);
	        // }else 
	        if(nums[right] == target){
	            return right;
	        }else if (nums[right - 1] == target){
	            return right - 1;
	        }else if (nums[left] == target){
	            return left;
	        }else {
	            return -1;
	        }
	        
	    }
	    
	    public int findHelper(int[] nums,int target, int pivot){
	        while(target == nums[pivot]){
	            if (pivot < nums.length - 1){
	                pivot++;
	            }
	        }
	        return pivot - 1;
	    }
}
