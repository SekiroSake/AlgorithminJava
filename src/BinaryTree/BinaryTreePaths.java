package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a binary tree, return all root-to-leaf paths.
 */
/*
 * Given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

[
  "1->2->5",
  "1->3"
]
 */
public class BinaryTreePaths {
	/**
	 * @param root
	 *            the root of the binary tree
	 * @return all root-to-leaf paths
	 */
	public List<String> binaryTreePaths(TreeNode root) {
		// Write your code here
		List<String> paths = new ArrayList<String>();
		if (root == null) {
			return paths;
		}
		
		if(root.left == null && root.right == null){
			paths.add(String.valueOf(root.val));
			return paths;
		}
		List<String> leftLeaf = binaryTreePaths(root.left);
		List<String> rightLeaf = binaryTreePaths(root.right);
		
		for(String path: leftLeaf){
			paths.add (root.val + "->" + path);
		}
		for(String path: rightLeaf){
			paths.add (root.val + "->" + path);
		}
		
		
		// 前面的return都是阶段性的，return给上一层作为input，真正的结果是最后的return，也就是顶root的那次return
		return paths;
	}
}
