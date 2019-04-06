package problem;

import java.util.Arrays;

import org.junit.Test;

public class P0349Test {

	@Test
	public void test1() {
		int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        P0349IntersectionOfTwoArrays test = new P0349IntersectionOfTwoArrays();
        int[] result = test.intersection(nums1,nums2);
        int[] answer = {2};
        Arrays.sort(result);
        Arrays.sort(answer);
        assert Arrays.equals(result, answer);
	}
	
	@Test
	public void test2() {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		P0349IntersectionOfTwoArrays test = new P0349IntersectionOfTwoArrays();
        int[] result = test.intersection(nums1,nums2);
        int[] answer = {4,9};
        Arrays.sort(result);
        Arrays.sort(answer);
        assert Arrays.equals(result, answer); 
	}
}
