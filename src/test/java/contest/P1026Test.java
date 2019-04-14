package contest;

import org.junit.Test;

import contest.week132.P1026MaximumDifferenceBetweenNodeAndAncestor;
import model.TreeNode;
import util.MyCollectionUtil;

public class P1026Test {
	@Test
	public void test1() {
		P1026MaximumDifferenceBetweenNodeAndAncestor t = new P1026MaximumDifferenceBetweenNodeAndAncestor();	
		Integer[] array = {8,3,10,1,6,null,14,null,null,4,7,13};
		TreeNode root = MyCollectionUtil.createBinaryTreeByArray(array, 0);
		int result = t.maxAncestorDiff(root);
		assert 7==result;
	}
}
