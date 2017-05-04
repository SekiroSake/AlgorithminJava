package BinarySearch;
/*
 * Consider the following matrix:

[
    [1, 3, 5, 7],
    [10, 11, 16, 20],
    [23, 30, 34, 50]
]
Given target = 3, return true
 */
public class Searcha2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int down = matrix.length - 1;
        int up = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        if (target < matrix[up][0] || target > matrix[down][right]){
            return false;
        }
        //找具体数字的二分法，while的最后边界是左右相等再算一次，确定最后一个边界在不在
        while (up <= down) {
            int mid = up + (down - up) / 2;
            if (target > matrix[mid][0]){
                //这里边界值不用保存做以后的对比，所以可以直接跳过（+1）
                up = mid + 1;
            } else if (target < matrix[mid][0]){
                down = mid - 1;
            } else {
                return true;
            }
        }
        if (target < matrix[down][0]){
            left = up;
        } else {
            left = down;
        }
        int start = 0;
        int end = matrix[0].length - 1;
        while (start <= end){
            int secondmid = start + (end - start) / 2;
            if (target > matrix[left][secondmid]){
                start = secondmid + 1;
            } else if (target < matrix[left][secondmid]){
                end = secondmid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
