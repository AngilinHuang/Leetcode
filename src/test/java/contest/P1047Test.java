package contest;

import org.junit.Test;

import contest.week137.P1047RemoveAllAdjacentDuplicatesInString;

public class P1047Test {
	
	@Test
	public void test1() {
		String S = "abbaca";
		assert "ca".equals(new P1047RemoveAllAdjacentDuplicatesInString().removeDuplicates(S));
	}
	
}
