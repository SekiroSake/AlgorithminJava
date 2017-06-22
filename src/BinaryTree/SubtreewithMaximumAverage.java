package BinaryTree;
/*
 * Given a binary tree, find the subtree with maximum average. Return the root of the subtree.

 Notice

LintCode will print the subtree which root is your return node.
It's guaranteed that there is only one subtree with maximum average.

Have you met this question in a real interview? Yes
Example
Given a binary tree:

     1
   /   \
 -5     11
 / \   /  \
1   2 4    -2 
return the node 11.
 */
/************************************************************
 * 
 * don't use sum / num to get avg, since 5 / 3 == 2 / 1
 *
 *************************************************************/
public class SubtreewithMaximumAverage {
	/**
	 * @param root
	 *            the root of binary tree
	 * @return the root of the maximum average of subtree
	 */
	public TreeNode findSubtree2(TreeNode root) {
		// Write your code here
		int globalMax = root.val + root.left.val + root.right.val;
		return findMax(root, globalMax);
	}

	private TreeNode findMax(TreeNode root, int globalMax) {
		// TODO Auto-generated method stub
		if(root == null){
			
		}
		return null;
	}
}
