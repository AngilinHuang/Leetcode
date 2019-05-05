package contest;

import org.junit.Test;

import contest.week135.P1037ValidBoomerang;


public class P1037Test {
	@Test
	public void test1() {
		int[][] test = {{1,1},{2,3},{3,2}};
		assert true == new P1037ValidBoomerang().isBoomerang(test);
		
	}
	
	@Test
	public void test2() {
		int[][] test2 = {{1,1},{2,2},{3,3}};
		assert false == new P1037ValidBoomerang().isBoomerang(test2);
	}
}
