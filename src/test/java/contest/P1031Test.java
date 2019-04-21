package contest;

import org.junit.Test;

import contest.week133.P1031MaximumSumOfTwoNonOverlappingSubarrays;

public class P1031Test {
	
	@Test
	public void test1() {
		int[] A = {2,1,5,6,0,9,5,0,3,8}; 
		int L = 4; 
		int M = 3;
		assert 31 == new P1031MaximumSumOfTwoNonOverlappingSubarrays().maxSumTwoNoOverlap(A, L ,M);
	}
	
	@Test
	public void test2() {
		int[] A = {3,8,1,3,2,1,8,9,0}; 
		int L = 3; 
		int M = 2;
		assert 29 == new P1031MaximumSumOfTwoNonOverlappingSubarrays().maxSumTwoNoOverlap(A, L ,M);
	}
	
	@Test
	public void test3() {
		int[] A = {0,6,5,2,2,5,1,9,4}; 
		int L = 1; 
		int M = 2;
		assert 20 == new P1031MaximumSumOfTwoNonOverlappingSubarrays().maxSumTwoNoOverlap(A, L ,M);
	}
}
