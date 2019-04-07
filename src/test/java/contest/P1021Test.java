package contest;

import org.junit.Test;

import contest.week131.P1021RemoveOutermostParentheses;

public class P1021Test {
	
	@Test
	public void test1() {
		String s1 =  "(()())(())";
		String result = new P1021RemoveOutermostParentheses().removeOuterParentheses(s1);
		String answer = "()()()";
		assert answer.equals(result);
	}
	
	@Test
	public void test2() {
		String s1 =  "(()())(())(()(()))";
		String result = new P1021RemoveOutermostParentheses().removeOuterParentheses(s1);
		String answer = "()()()()(())";
		assert answer.equals(result);
	}
	
	@Test
	public void test3() {
		String s1 =  "()()";
		String result = new P1021RemoveOutermostParentheses().removeOuterParentheses(s1);
		String answer = "";
		assert answer.equals(result);
	}
}
