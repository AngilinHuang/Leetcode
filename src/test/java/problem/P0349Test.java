package problem;

import org.junit.Test;

public class P0349Test {

	@Test
	public void test1() {
		int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        P0349IntersectionOfTwoArrays test = new P0349IntersectionOfTwoArrays();
        int[] result = test.intersection(nums1,nums2);
        assert result.length==1;  
        assert result[0]==2;
	}
	
	@Test
	public void test2() {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		P0349IntersectionOfTwoArrays test = new P0349IntersectionOfTwoArrays();
        int[] result = test.intersection(nums1,nums2);
        assert result.length==2;
        assert (result[0]==9&&result[1]==4)||(result[0]==4&&result[1]==9); 
	}
}
