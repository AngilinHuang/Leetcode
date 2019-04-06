package problem;

import java.util.*;


/**
 * Given two arrays, write a function to compute their intersection.
 * 
 * Each element in the result must be unique.
   The result can be in any order.
 *
 */
public class P0349IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
    	if(nums1.length==0 || nums2.length==0) {
    		return new int[0];
    	}
        if(nums1.length>nums2.length){
            return intersect(nums1, nums2);
        }
        else{
            return intersect(nums2,nums1 );
        }
    }

    private int[] intersect(int[] longerNums, int[] shorterNums){
        Set<Integer> keySet = new HashSet<>(shorterNums.length);
        for(int num : shorterNums){
        	keySet.add(num);
        }
        Set<Integer> resultSet = new HashSet<>(keySet.size());
        for(int num : longerNums){
            if(keySet.contains(num)){
                resultSet.add(num);
            }
        }
        return resultSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
