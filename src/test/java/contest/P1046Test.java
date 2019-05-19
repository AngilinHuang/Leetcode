package contest;

import org.junit.Test;

import contest.week137.P1046LastStoneWeight;

public class P1046Test {
	
	@Test
	public void test1() {
		int[] stones = {2,7,4,1,8,1};
		assert 1==new P1046LastStoneWeight().lastStoneWeight(stones);
	}
	
}
