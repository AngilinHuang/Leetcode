package contest;

import org.junit.Test;

import contest.week136.P1041RobotBoundedInCircle;

public class P1041Test {
	
	@Test
	public void test1() {
		String input = "GL";
		assert true == new P1041RobotBoundedInCircle().isRobotBounded(input);
	}
	
	@Test
	public void test2() {
		String input = "GG";
		assert false == new P1041RobotBoundedInCircle().isRobotBounded(input);
	}
	
	@Test
	public void test3() {
		String input = "GGLLGG";
		assert true == new P1041RobotBoundedInCircle().isRobotBounded(input);
	}
	
}
