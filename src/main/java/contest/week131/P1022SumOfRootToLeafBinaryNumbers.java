package contest.week131;

import model.TreeNode;


/**
 * Given a binary tree, each node has value 0 or 1.  Each root-to-leaf path represents a binary number starting with the most significant bit.  For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
	For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
	Return the sum of these numbers modulo 10^9 + 7.
 * 
 * The number of nodes in the tree is between 1 and 1000.
	node.val is 0 or 1.
 * 
 * @author angilin
 *
 */
public class P1022SumOfRootToLeafBinaryNumbers {
	int sum = 0;
	
	public int sumRootToLeaf(TreeNode root) {
		walk(root, 0);
		return sum;
    }
	
	public void walk(TreeNode treeNode, int val){
		if(treeNode!=null) {
			val += treeNode.val;
			if(treeNode.left==null && treeNode.right==null) {
				sum = sum + (val%1000000007);
				return;
			}
			walk(treeNode.left, val*2);
			walk(treeNode.right, val*2);
		}
	}
	
}
