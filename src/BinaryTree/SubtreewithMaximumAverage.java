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
 * Use this:
 * 5/3 < 2/1 => 5 * 1 < 2 * 3
 *
 *************************************************************/
public class SubtreewithMaximumAverage {
	/**
	 * @param root
	 *            the root of binary tree
	 * @return the root of the maximum average of subtree
	 */
	private class ResultType{
		public int sum,size;
		public ResultType(int sum, int size){
			this.sum = sum;
			this.size = size;
		}
	}
	private TreeNode subtree = null;
	private ResultType subtreeResult = null;
	
	public TreeNode findSubtree(TreeNode root){
		helper(root);
		return subtree;
	}

	private ResultType helper(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null){
			return new ResultType(0,0);
		}
		ResultType left = helper(root.left);
		ResultType right = helper(root.right);
		ResultType result = new ResultType(left.sum + right.sum + root.val,
										   left.size + right.size + 1);
		if(subtree == null || subtreeResult.sum * result.size < result.sum + subtreeResult.size){
			subtree = root;
			subtreeResult = result;
		}
		return result;
	}
}
