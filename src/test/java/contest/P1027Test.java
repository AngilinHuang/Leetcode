package contest;

import org.junit.Test;
import contest.week132.P1027LongestArithmeticSequence;

public class P1027Test {

	@Test
	public void test1() {
		int[] A1 = {3,6,9,12};
		assert 4==new P1027LongestArithmeticSequence().longestArithSeqLength(A1);
		
		int[] A2 = {9,4,7,2,10};
		assert 3==new P1027LongestArithmeticSequence().longestArithSeqLength(A2);
		
		int[] A3 = {20,1,15,3,10,5,8};
		assert 4==new P1027LongestArithmeticSequence().longestArithSeqLength(A3);
		
		//divide zero error
		int[] A4 = {24,13,1,100,0,94,3,0,3};
		assert 2==new P1027LongestArithmeticSequence().longestArithSeqLength(A4);
		
	}
	
}
