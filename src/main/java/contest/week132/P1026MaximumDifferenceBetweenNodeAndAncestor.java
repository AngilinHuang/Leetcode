package contest.week132;


import java.util.*;

import model.TreeNode;
import util.MyCollectionUtil;

/**
 * Given the root of a binary tree, find the maximum value V for which there exists different nodes A and B where V = |A.val - B.val| and A is an ancestor of B.
(A node A is an ancestor of B if either: any child of A is equal to B, or any child of A is an ancestor of B.)
 * 
 * The number of nodes in the tree is between 2 and 5000.
Each node will have value between 0 and 100000.
 * 
 * @author angilin
 *
 */
public class P1026MaximumDifferenceBetweenNodeAndAncestor {

	int differ = 0;
	
	public int maxAncestorDiff(TreeNode root) {
		walk(root, new int[0]);
		return differ;
    }
	
	public void walk(TreeNode treeNode, int[] fatherVals){
		if(treeNode!=null) {
			int val = treeNode.val;
			for(int i=0;i<fatherVals.length;i++) {
				int diff = fatherVals[i]-val;
				if(diff<0) {
					diff = diff*-1;
				}
				if(diff>differ) {
					differ = diff;
				}
			}
			
			int[] newFatherVals = Arrays.copyOf(fatherVals, fatherVals.length+1);
			newFatherVals[newFatherVals.length-1] = val;
			
			walk(treeNode.left, newFatherVals);
			walk(treeNode.right, newFatherVals);
		}
	}
	
}
