package BinarySearch;

/*
 * The code base version is an integer start from 1 to n. 
 * One day, someone committed a bad version in the code case,
 *  so it caused this version and the following versions are all failed in the unit tests.
 *   Find the first bad version.
 *   You can call isBadVersion to help you determine which version is the first bad one. 
 *   The details interface can be found in the code's annotation part.
 */
/*
 * Given n = 5:

isBadVersion(3) -> false
isBadVersion(5) -> true
isBadVersion(4) -> true
Here we are 100% sure that the 4th version is the first bad version.
 */
/**
 * public class SVNRepo { public static boolean isBadVersion(int k); } you can
 * use SVNRepo.isBadVersion(k) to judge whether the kth code version is bad or
 * not.
 */

public class FirstBadVersion {
	public static class SVNRepo {
		public static boolean isBadVersion(int k) {
			return false;
		}
	}

	/**
	 * @param n:
	 *            An integers.
	 * @return: An integer which is the first bad version.
	 */
	public int findFirstBadVersion(int n) {
		// write your code here
		if (n <= 1) {
			return n;
		}
		int left = 1;
		int right = n;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (SVNRepo.isBadVersion(mid) == true) {
				right = mid;
			}else{
				left = mid;
			}
		}
		return SVNRepo.isBadVersion(left) == true?left:right;
	}
}
