package contest;

import org.junit.Test;

import contest.week131.P1024VideoStitching;

public class P1024Test {
	
	@Test
	public void test1() {
		int[][] clips = {{0,2},{4,6},{8,10},{1,9},{1,5},{5,9}};
		int T = 10;
		assert new P1024VideoStitching().videoStitching(clips,T)==3;
	}
	
	@Test
	public void test2() {
		int[][] clips = {{0,1},{1,2}};
		int T = 5;
		assert new P1024VideoStitching().videoStitching(clips,T)==-1;
	}
	
	@Test
	public void test3() {
		int[][] clips = {{0,1},{6,8},{0,2},{5,6},{0,4},{0,3},{6,7},{1,3},{4,7},{1,4},{2,5},{2,6},{3,4},{4,5},{5,7},{6,9}};
		int T = 9;
		assert new P1024VideoStitching().videoStitching(clips,T)==3;
	}
	
	@Test
	public void test4() {
		int[][] clips = {{0,4},{2,8}};
		int T = 5;
		assert new P1024VideoStitching().videoStitching(clips,T)==2;
	}
	
}
