package BinarySearch;

import java.lang.reflect.Array;

/*
 * Given a big sorted array with positive integers sorted by ascending order. 
 * The array is so big so that you can not get the length of the whole array directly, 
 * and you can only access the kth number by ArrayReader.get(k) (or ArrayReader->get(k) for C++). 
 * Find the first index of a target number. Your algorithm should be in O(log k), where k is the first index of the target number.
 * 
 * Example
 * Given [1, 3, 6, 9, 21, ...], and target = 3, return 1.
 * Given [1, 3, 6, 9, 21, ...], and target = 4, return -1.
 */

/**
 * Definition of ArrayReader:
 * 
 * class ArrayReader {
 *      // get the number at index, return -1 if index is less than zero.
 *      public int get(int index);
 * }
 * 
 */
 class ArrayReader {
      // get the number at index, return -1 if index is less than zero.
      public int get(int index) {
		return 0;
	}
 }
public class SearchinaBigSortedArray {
    /**
     * @param reader: An instance of ArrayReader.
     * @param target: An integer
     * @return : An integer which is the index of the target number
     */
	public int searchBigSortedArray(ArrayReader reader, int target) {
        // write your code here
        int retVal = -1;
    	int initIndex = 0;
    	int nextJunpIndex =  initIndex + 1;
    	if(reader.get(initIndex) == target){
    	    return initIndex;
    	}
    	if(reader.get(nextJunpIndex) == target){
    	    return nextJunpIndex;
    	}
    	//Have to get nextJumpIndex - 1 rather than only nextJumpIndex
    	while(reader.get(nextJunpIndex - 1) < target){
    		nextJunpIndex = nextJunpIndex * 2;
    	}
    	int left = nextJunpIndex /2;
    	int right = nextJunpIndex - 1;
    	while(left < right - 1){
    		int mid = left + (right - left)/2;
    		if (reader.get(mid) < target){
    			left = mid;
    		}else{
    			right = mid;
    		}
    	}
    	if(reader.get(left) == target){
    		retVal = left;
    	}else if(reader.get(right) == target){
    		retVal = right;
    	}
		return retVal;
    }
}